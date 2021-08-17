(ns clock)

(defn clock->string [clock]
  (str
    (format "%02d" (clock :hours))
    ":"
    (format "%02d" (clock :minutes))))

(defn clock [hours minutes]
  (let [tot (+ (* hours 60) minutes)
        m (mod tot 60)
        h' (quot tot 60)
        h (if (and (neg? tot) (pos? m))
            (mod (dec h') 24)
            (mod h' 24)
            )]
    {:hours   h
     :minutes m
     }))

(defn add-time [{h :hours m :minutes} time]
  (clock h (+ m time)))
