(defn pgcd [a b] 
  (if (zero? b) 
    a 
    (recur b (mod a b))))

(defn ppcm [a b] 
  (/ (* a b) (pgcd a b)))

(reduce #(ppcm %1 %2) (range 1 21))
