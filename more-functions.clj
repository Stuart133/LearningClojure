(defn both? [first-predicate second-predicate book]
  (when (and (first-predicate book)
             (second-predicate book))
  book))

