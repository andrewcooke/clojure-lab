(ns org.acooke.lab.doctest)

(defn
  ^{:test (fn [] (assert (= 1 (add-one 0))))}
  add-one
  [n] (+ 1 n))

(defn
  ^{:test #(assert (= 6 (factorial 3)))}
  factorial
  ([n] (factorial n 1))
  ([n acc] (if (zero? n) acc (recur (dec n) (* n acc)))))
