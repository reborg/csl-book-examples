(dosync ; <1>
  (ref-set op1 0)
  (ref-set op2 1)
  (ref-set res []))

(let [p1 (future (perform)) ; <2>
      p2 (future (perform))]
  [@p1 @p2]
  @res)

;; ###-1539638732-### ; <3>
;; ###-1047541620-###
;; 1 + 2 = 3 (i=3)
;; ###-1047541620-### ; <4>
;; ###-1047541620-###
;; ###-1047541620-###
;; ###-1539638732-###
;; 2 + 3 = 5 (i=2)
;; ###-1047541620-###
;; ###-1047541620-###
;; ###-1539638732-###
;; 3 + 4 = 7 (i=1)
;; ###-1047541620-###
;; ###-1047541620-###
;; ###-1047541620-###
;; ###-1047541620-### ; <5>
;; 4 + 5 = 9 (i=3)
;; ###-1047541620-###
;; 5 + 6 = 11 (i=2)
;; ###-1047541620-###
;; 6 + 7 = 13 (i=1)
;; [3 5 7 9 11 13]