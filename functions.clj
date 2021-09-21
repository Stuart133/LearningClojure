(defn greet 
  ([to-whom] (greet "Welcome to my shop" to-whom))
  ([message to-whom] (println message to-whom)))

(defn print-any-args [& args]
  (println "My arguments are: " args))