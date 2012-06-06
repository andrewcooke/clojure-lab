(ns org.acooke.lab.doctest)

(defn add-one
  ^{:test (fn [] assert (= 1 (add-one 0)))}
  [n] (+ 1 n))

(defn factorial
  ^{:test #(assert (= 6 (factorial 3)))}
  ([n] (factorial n 1))
  ([n acc] (if (zero? n) acc (recur (dec n) (* n acc)))))
