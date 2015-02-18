(defn palindrome? [n] 
  (= (reverse (str n)) (seq (str n))))


(apply max (filter palindrome? 
        (for [a (range 100 1000)
              b (range 100 1000)]
          (* a b))))
