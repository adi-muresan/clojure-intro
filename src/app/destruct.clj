(ns app.destruct)

;; in functions
(defn f [{name :name age :age}]
  (str name "-" age))

(f {:name "adi" :age 28})

(defn func
  ([] (println "empty"))
  ([x] (inc x))
  ([x y] ("ab")))



;; in lets
(let [[v1 v2] [42 24]]
  (max v1 v2))

