(ns app.macros
  (use [clojure.string :as s]))

;; for
(for [x [1 2]
      y ["a" "b"]]
  [x y])

(println (macroexpand-1
 '(for [x [1 2]
      y ["a" "b"]]
  [x y])))



;; doseq
(doseq [fruit (list "apples" "oranges")]
  (println "I like" fruit))


;; ->, ->>
(str (s/trim "  fruit  ")
     "-ness")

(-> "  fruit  "
    (s/trim)
    (str "-ness"))

(println (macroexpand
   '(-> "  fruit  "
    (s/trim)
    (str "-ness"))))


;; doto
(doto (new java.util.HashMap)
  (.put "a" 1)
  (.put "b" 2))

(print
 (macroexpand-1
   '(doto (new java.util.HashMap)
    (.put "a" 1)
    (.put "b" 2))))

(-> 0
  inc
  dec
  inc
  dec)

((comp inc inc dec) 0)
