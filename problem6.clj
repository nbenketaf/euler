(defn sum-of-squares [coll] (reduce + (map #(* % %) coll)))

(defn square-of-sums [coll] (#(* % %) (reduce + coll)))

(- (square-of-sums (range 1 101)) (sum-of-squares (range 1 101)))
