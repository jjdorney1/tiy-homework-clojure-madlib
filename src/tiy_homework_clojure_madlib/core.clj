(ns tiy-homework-clojure-madlib.core)

(def verb "walk")
(def food "pie")
(def emotion "happy")
(def thingsPlr "notebooks")
(def place "Raleigh")
(def personality "quiet")
(def silly-word "scrunchie")
(def profession "surgeon")
(def thingSing "table")
(def clothing "hat")


(defn -main [] ())

(defn mad-lib [] (print
                   "I caught a leprechaun this St. Patty’s day, but he wouldn’t give me any gold. I was"
                   emotion "but at least he offered to teach me how he earned his gold. First he taught me to"
                   verb ", which is how he got his first nugget. Then he showed me how to make"
                   thingsPlr "out of"
                   thingSing ". I could see how they would sell well, but I wasn’t"
                   personality "enough to make them well. Finally he founded the first"
                   silly-word "in"
                   place ", a restaurant that specializes in"
                   food "for"
                   profession "s. That all sounded like too much work, so I asked for his"
                   clothing "and left for home."))

;(println verb-given food-given emotion-given things-given)

(-main)
(mad-lib)

;
;;(defn foo
;;  "I don't do a whole lot."
;;  [x]
;;  (println x "Hello, World!"))
;
;; (def verb-given "walk")
;
;
;(defn -main [] ((let [first-number (+ 400 40)
;                      second-number (- 400 50)]) (println first-number second-number)))
;
;
;(def food "pie")
;(def emotion-given "happy")
;(def things-given "notebooks")
;(def place-given "Raleigh")
;(def personality-trait-given "quiet")
;(def silly-word-given "scrunchie")
;(def profession-given "surgeon")
;(def thing-given "table")
;(def clothing-given "hat")
;
;
;
;  ;(let [

;
;
;
;
;(-main)
;
;
;
;
;;(defn -main [(let
;;
;;  ) ]
;;  (foo verb-given))
;
;
;
;  ;   verb-given "walk")
