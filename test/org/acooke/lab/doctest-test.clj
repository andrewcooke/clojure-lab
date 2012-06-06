(ns org.acooke.lab.doctest-test
  (:use org.acooke.lab.doctest)
  (:use clojure.test))

(deftest test-add-one
  (is (= :ok (test #'add-one))))

(deftest test-factorial
  (is (= :ok (test #'factorial))))

(run-tests)
