(ns reverse-string)

(defn reverse-string [s]
  (loop [s s r ""]
    (if (empty? s)
      r
      (recur (subs s 1) (str (subs s 0 1) r)))
    ))

(defn reverse-string* [s]
  (let [shift-string
        (fn [[s r]]
          [(subs s 1) (str (subs s 0 1) r)])
        ]
    (->>
      (iterate shift-string [s ""])
      (take (inc (count s)))
      (last)
      (second))))