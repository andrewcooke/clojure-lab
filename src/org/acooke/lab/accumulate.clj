(ns org.acooke.lab.accumulate)

; http://stackoverflow.com/questions/10666228/accumulators-conj-and-recursion

(defn my-range-0 [lo hi]
  (if (= lo hi)
    nil
    (cons lo (my-range-0 (inc lo) hi))))

(defn my-range-1
  ([lo hi] (my-range-1 lo hi nil))
  ([lo hi acc]
    (if (= lo hi)
      acc
      (recur (inc lo) hi (cons lo acc)))))

(defn my-range-2
  ([lo hi] (my-range-2 lo hi nil))
  ([lo hi acc]
    (if (= lo hi)
      acc
      (let [hi (dec hi)]
        (recur lo hi (cons hi acc))))))

(defn my-range-3
  ([lo hi] (my-range-3 lo hi []))
  ([lo hi acc]
    (if (= lo hi)
      acc
      (recur (inc lo) hi (conj acc lo)))))

(defn my-range-4
  ([lo hi] (my-range-4 lo hi nil))
  ([lo hi acc]
    (if (= lo hi)
      acc
      (recur (inc lo) hi (conj acc lo)))))

