(ns org.acooke.lab.accumulate-test
  (:use org.acooke.lab.accumulate)
  (:use clojure.test))


(deftest test-my-range-1
  (is (= '(0 1 2) (my-range-0 0 3))))

(deftest test-my-range-1
  (is (= '(2 1 0) (my-range-1 0 3))))

(deftest test-my-range-2
  (is (= '(0 1 2) (my-range-2 0 3))))

(deftest test-my-range-3
  (is (= [0 1 2] (my-range-3 0 3))))

(deftest test-my-range-4
  (is (= '(2 1 0) (my-range-4 0 3))))

(run-tests)
