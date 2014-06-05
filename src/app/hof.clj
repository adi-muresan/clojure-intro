;; higher-order functions
(ns app.hof)

(def ppl (list {:name "Adi" :height 178} {:name "Ovidiu" :height 180}))

ppl
;; apply
(apply + [1 2 3 4 5])


;; filter
(filter
 (fn [{height :height}]
   (>= height 180))
 ppl)


;; map
(defn to-lower [s]
  (.toLowerCase s))

(defn to-upper [s]
  (.toUpperCase s))

(map
 (fn [p transf]
   (assoc
     p
     :name (transf (:name p))))
 ppl
 [to-lower to-upper])


;; reduce
(defn red-fn
  [[sum cnt] pers]
  [(+ sum (:height pers))
   (inc cnt)])

(let [[sum total]
        (reduce
           red-fn
           [0 0]
           ppl)]
  (/ sum total))

