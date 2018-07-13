(defn lookup [id] ; <1>
  {:index "backup"
   :bucket (rand-int (* 100 id))})

(def request [12 41 11]) ; <2>

(reduce #(assoc %1 %2 (lookup %2)) {} request) ; <3>

;; {12 {:index "backup" :bucket 888}
;;  42 {:index "backup" :bucket 4058}
;;  11 {:index "backup" :bucket 355}}