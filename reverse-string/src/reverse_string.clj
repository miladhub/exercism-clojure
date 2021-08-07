(ns reverse-string)

(defn reverse-string [s]
  (let [go (fn [s r]
             (if (empty? s)
               [s r]
               (recur (subs s 1) (str (subs s 0 1) r))))
        [_ rev] (go s "")]
    rev))
