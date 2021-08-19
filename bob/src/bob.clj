(ns bob
  (:require [clojure.string :as str]))

(defn response-for [s]
  (let [chars (str/join (re-seq #"[a-zA-Z]" s))
        all-caps (and
                   (= chars (str/upper-case chars))
                   (not-empty chars))
        question (str/ends-with? (str/trim s) "?")
        yelled-question (and all-caps question)
        not-saying-anything (empty? (re-seq #"\w" s))]
    (cond
      yelled-question "Calm down, I know what I'm doing!"
      question "Sure."
      all-caps "Whoa, chill out!"
      not-saying-anything "Fine. Be that way!"
      :else "Whatever."
      )))
