(ns org.acooke.lab.perms-test
  (:use org.acooke.lab.perms)
  (:use clojure.test))

(deftest test-perms-2
  (let [s (take 2 (stream ["a" "b" "c"]))]
    (is (= s ["a" "b"]))))

(deftest test-perms-3
  (let [s (take 3 (stream ["a" "b" "c"]))]
    (is (= s ["a" "b" "c"]))))

(deftest test-perms-4
  (let [s (take 4 (stream ["a" "b" "c"]))]
    (is (= s ["a" "b" "c" "aa"]))))

(deftest test-perms-25
  (let [s (take 25 (stream ["a" "b" "c"]))]
    (is (= s ["a" "b" "c" "aa" "ab" "ac" "ba" "bb" "bc" "ca" "cb" "cc" "aaa" "aab" "aac" "aba" "abb" "abc" "aca" "acb" "acc" "baa" "bab" "bac" "bba"]))))

(run-tests)
