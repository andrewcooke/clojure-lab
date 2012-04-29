(ns org.acooke.lab.state)

; this is related to
; http://stackoverflow.com/questions/10337932/how-to-better-iterate-over-state-in-clojure-monad

; the problem is:
; - there is a "state" which must be passed to a series of operations.
; - each operation returns some value and a new state
; - how do we sequence a series of operations without duplicating code?

; to see the code below in use, visit the associated test


(defn fold-over-state [state functions]
  (reduce (fn [[acc state] f]
            (let [[result state] (f state)]
              [(conj acc result) state]))
    [[] state] functions))

(defn fold-over [state functions]
  (let [[acc state] (fold-over-state state functions)]
    acc))
