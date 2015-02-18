(defn div-by-3-or-5
  [nb]
  (or (zero? (mod nb 3)) (zero? (mod nb 5))))

(defn euler1
  []
  (reduce + (filter div-by-3-or-5 (range 1000))))
