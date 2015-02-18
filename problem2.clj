(def fib (lazy-cat [1 2] (map + fib (rest fib))))

(reduce + (filter even? (take-while #(> % 4000000) fib-seq)))
