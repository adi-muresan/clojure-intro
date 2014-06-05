(ns app.core)

(defn foo
  "I don't do a whole lot."
  [x]
  (println x "Hello, World!"))

(defn bf [x y]
  (+ x y))

(bf 1 2)

(apply bf '(10 20))

;;(apply bf '(1 10 20))




;; Order:

;; simple
;; evaluation
;; functions
;; destruct
;; javainterop
;; hof
;; macros
