(ns series)

(defn slices [string length]
  (if (<= length 0)
    [""]
    (loop [string string matches []]
      (if (< (count string) length)
        matches
        (recur
          (subs string 1)
          (conj matches (subs string 0 length)))))))