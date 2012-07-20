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

(deftest test-perms2-2
  (let [s (take 2 (stream2 ["a" "b" "c"]))]
    (is (= s ["a" "b"]))))

(deftest test-perms2-3
  (let [s (take 3 (stream2 ["a" "b" "c"]))]
    (is (= s ["a" "b" "c"]))))

(deftest test-perms2-4
  (let [s (take 4 (stream2 ["a" "b" "c"]))]
    (is (= s ["a" "b" "c" "aa"]))))

(deftest test-perms2-25
  (let [s (take 25 (stream2 ["a" "b" "c"]))]
    (is (= s ["a" "b" "c" "aa" "ab" "ac" "ba" "bb" "bc" "ca" "cb" "cc" "aaa" "aab" "aac" "aba" "abb" "abc" "aca" "acb" "acc" "baa" "bab" "bac" "bba"]))))

(deftest test-perms3-2
  (let [s (take 2 (stream3 ["a" "b" "c"]))]
    (is (= s ["a" "b"]))))

(deftest test-perms3-3
  (let [s (take 3 (stream3 ["a" "b" "c"]))]
    (is (= s ["a" "b" "c"]))))

(deftest test-perms3-4
  (let [s (take 4 (stream3 ["a" "b" "c"]))]
    (is (= s ["a" "b" "c" "aa"]))))

(deftest test-perms3-25
  (let [s (take 25 (stream3 ["a" "b" "c"]))]
    (is (= s ["a" "b" "c" "aa" "ab" "ac" "ba" "bb" "bc" "ca" "cb" "cc" "aaa" "aab" "aac" "aba" "abb" "abc" "aca" "acb" "acc" "baa" "bab" "bac" "bba"]))))

(deftest test-perms4-2
  (let [s (take 2 (stream4 ["a" "b" "c"]))]
    (is (= s ["a" "b"]))))

(deftest test-perms4-3
  (let [s (take 3 (stream4 ["a" "b" "c"]))]
    (is (= s ["a" "b" "c"]))))

(deftest test-perms4-4
  (let [s (take 4 (stream4 ["a" "b" "c"]))]
    (is (= s ["a" "b" "c" "aa"]))))

(deftest test-perms4-25
  (let [s (take 25 (stream4 ["a" "b" "c"]))]
    (is (= s ["a" "b" "c" "aa" "ab" "ac" "ba" "bb" "bc" "ca" "cb" "cc" "aaa" "aab" "aac" "aba" "abb" "abc" "aca" "acb" "acc" "baa" "bab" "bac" "bba"]))))

(deftest test-perms5-2
  (let [s (take 2 (stream5 ["a" "b" "c"]))]
    (is (= s ["a" "b"]))))

(deftest test-perms5-3
  (let [s (take 3 (stream5 ["a" "b" "c"]))]
    (is (= s ["a" "b" "c"]))))

(deftest test-perms5-4
  (let [s (take 4 (stream5 ["a" "b" "c"]))]
    (is (= s ["a" "b" "c" "aa"]))))

(deftest test-perms5-25
  (let [s (take 25 (stream5 ["a" "b" "c"]))]
    (is (= s ["a" "b" "c" "aa" "ab" "ac" "ba" "bb" "bc" "ca" "cb" "cc" "aaa" "aab" "aac" "aba" "abb" "abc" "aca" "acb" "acc" "baa" "bab" "bac" "bba"]))))

(run-tests)
