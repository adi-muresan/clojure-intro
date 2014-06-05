(ns app.simple)

;; a list
(list 1 :a "b")

;; a vector
(def v ["a" "b" "c"])

;; a set
(def s #{"a" "b" "c"})

(s "a")
(s "x")

(conj s "y")

;; a map
(def my-info {:name "adi" :height 178})

(:name my-info)
(get my-info :height)

(assoc my-info :shoesize 43)

my-info

;; Naming conventions
;; do-stuff!
;; *const*
;; is-even?
;; _

(fn [[_ x]])
