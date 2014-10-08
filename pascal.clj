;;          1
;;        1   1
;;      1   2   1
;;    1   3   3   1
;;  1   4   6   4   1

(defn pascals-triangle [] (iterate #(flatten [1 (map + % (rest %)) 1]) '(1)))

(println (take 30 (interpose "\n" (pascals-triangle))))
