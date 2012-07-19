(ns org.acooke.lab.perms)

(defn stream [seed]
  (defn helper
    ([slow] (let [slow (seq slow)] (helper (first slow) seed (rest slow))))
    ([c fast slow]
      (let [fast (seq fast)]
        (if fast
          (lazy-seq (cons (str c (first fast)) (helper c (rest fast) slow)))
          (helper slow)))))
  (declare delayed)
  (let [slow (cons "" (lazy-seq delayed))]
        (def delayed (helper slow))
        delayed))
