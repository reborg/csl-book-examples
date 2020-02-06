(def pi-digits
  (slurp "https://tinyurl.com/pi-digits")) ; <1>

(def pi-seq               ; <2>
  (sequence
    (comp
      cat                 ; <3>
      (map int)           ; <4>
      (map #(mod % 48)))  ; <5>
    (re-seq #"\d{10}" pi-digits)))

(take 20 pi-seq)
;; (1 4 1 5 9 2 6 5 3 5 8 9 7 9 3 2 3 8 4 6)