(ns org.acooke.lab.perms)

; http://stackoverflow.com/questions/11530574/clojure-for-comprehension-example

(defn stream [seed]
  (defn helper
    ([slow] (helper (first slow) seed (rest slow)))
    ([c fast slow]
      (let [fast (seq fast)]
        (if fast
          (lazy-seq (cons (str c (first fast)) (helper c (rest fast) slow)))
          (helper slow)))))
  (declare delayed)
  (let [slow (cons "" (lazy-seq delayed))]
    (def delayed (helper slow))
    delayed))
