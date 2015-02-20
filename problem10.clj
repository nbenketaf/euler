;; Summation of primes
;; TODO: create a lazy seq of prime numbers
(defn prime? [n] 
  (loop [nb n
         acc 2]
    (cond
      (> acc (/ nb 2.0)) true
      (zero? (mod nb acc)) false
      :else (recur nb (inc acc)))
    ))

(reduce + (filter prime? (take-while (partial >= 2000000) (iterate inc 2))))
