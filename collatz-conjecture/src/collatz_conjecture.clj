(ns collatz-conjecture)

(defn next-n [num]
  (if (= (mod num 2) 0)
    (/ num 2)
    (+ (* num 3) 1)))

(defn collatz [num]
  (assert (> num 0))
  (->>
    (iterate next-n num)
    (take-while #(> % 1))
    (count)))
