(ns org.acooke.lab.state-test
  (:use org.acooke.lab.state)
  (:use clojure.test))


; first, some example state and operations

; the state used in the tests/examples
(def state (range))

; this returns the head of the state and the new state
(defn op-head [state]
  [(first state) (rest state)])

; this returns a string representing the next two values in the state, and
; the new state
(defn op-str-two [state]
  (let [[two state] (split-at 2 state)]
    [(apply str two) state]))

; this averages the next n values
(defn op-avg [n state]
  (let [[vals state] (split-at n state)]
    [(/ (apply + vals) n) state]))

; this returns two values and the state
(defn op-two [state]
  (let [[[a b] state] (split-at 2 state)]
    [[a b] state]))


; this is how i call the above - note the duplication of state
(deftest the-problem
  (let [[a state] (op-head state)
        [b state] (op-str-two state)
        [c state] (op-avg 3 state)
        [d state] (op-two state)]
    (is (= [a b c d] [0 "12" 4 [6 7]]))))

; this is using fold-over, which is a kind-of inverted fold...
(deftest the-solution
  (let [[a b c d] (fold-over state
                   [op-head op-str-two (partial op-avg 3) op-two])]
    (is (= [a b c d] [0 "12" 4 [6 7]]))))


(run-tests)
