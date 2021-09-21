(defn greet 
  ([to-whom] (greet "Welcome to my shop" to-whom))
  ([message to-whom] (println message to-whom)))

(defn print-any-args [& args]
  (println "My arguments are: " args))

(defn dispatch-book-format [book]
  (cond
    (vector? book) :vector-book
    (contains? book :title) :standard-map
    (contains? book :book) :alternative-map))

(defmulti normalize-book dispatch-book-format)

(defmethod normalize-book :vector-book [book]
  {:title (first book) :author (second book)})

(defmethod normalize-book :standard-map [book]
  book)

(defmethod normalize-book :alternative-map [book]
  {:title (:book book) :author (:by book)})

(defn sum-copies
  ([books] (sum-copies books 0))
  ([books total]
    (if (empty? books)
      total
      (recur
        (rest books)
        (+ total (:copies-sold (first books)))))))