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

(defn stream2 [seed]
  (defn helper
    ([slow] (helper (first slow) seed (rest slow)))
    ([c fast slow] (concat (map #(str c %) fast) (lazy-seq (helper slow)))))
  (declare delayed)
  (let [slow (cons "" (lazy-seq delayed))]
    (def delayed (helper slow))
    delayed))

(defn stream3 [seed]
  (defn helper [slow]
    (concat (map #(str (first slow) %) seed) (lazy-seq (helper (rest slow)))))
  (declare delayed)
  (let [slow (cons "" (lazy-seq delayed))]
    (def delayed (helper slow))
    delayed))
