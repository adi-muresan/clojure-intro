(ns app.functions)

;; definitions
(defn f "my adder" [x y] (+ x y))

(f 1 2)

;; anonymous
(fn [x]
  (+ x 1))

((fn [x]
   (+ x 1))
 10)


#(+ %1 1)

(#(+ %1 1)
  10)


;; multi-argument
(defn mult-add [a1 & rest]
  (* a1
     (apply + rest)))

(mult-add 10 1 2 3 4 5)


;; pre/post conditions
(defn sqr [x]
  {:pre [(pos? x)
         (integer? x)]
;   :post [(= x
;             (* % %))]}
   }
  (* x x))

(sqr 10)

