(require '[clojure.repl :refer [dir-fn dir]])
(require 'clojure.set)

(dir-fn 'clojure.set) ; <1>
;; (difference index intersection
;;  join map-invert project rename
;;  rename-keys select subset?
;;  superset? union)

(dir clojure.set) ; <2>
;; difference
;; index
;; intersection
;; [..]
;; union
;; nil