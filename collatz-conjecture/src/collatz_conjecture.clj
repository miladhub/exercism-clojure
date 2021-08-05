(ns collatz-conjecture)

(defn next-n [num]
  (if (zero? (mod num 2))
    (/ num 2)
    (+ (* num 3) 1)))

(defn collatz [num]
  (assert (pos? num))
  (->>
    (iterate next-n num)
    (take-while #(> % 1))
    (count)))
