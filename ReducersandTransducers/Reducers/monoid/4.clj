(r/fold (r/monoid merge (constantly {}))  ; <1>
        (fn [m k v] (assoc m k (str v)))
        (zipmap (range 10) (range 10)))

;; {0 "0", 7 "7", 1 "1", 4 "4",
    6 "6", 3 "3", 2 "2", 9 "9",
    5 "5", 8 "8"}