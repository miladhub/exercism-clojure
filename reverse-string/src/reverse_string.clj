(ns reverse-string)

(defn reverse-string [s]
  (loop [s s r ""]
    (if (empty? s)
      (apply str r)
      (recur (rest s) (into [(first s)] r)))
    ))
