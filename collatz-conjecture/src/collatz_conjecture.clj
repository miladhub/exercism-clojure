(ns collatz-conjecture)

(defn next_n [num]
  (if (= (mod num 2) 0) (/ num 2) (+ (* num 3) 1)))

(defn collatz [num]
  (if (<= num 0) (throw (new IllegalArgumentException "number must be positive")))
  (count (take-while (fn [x] (> x 1)) (iterate next_n num))))

