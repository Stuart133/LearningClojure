(ns hello-world.core
  (:gen-class))

(defn hello-world []
  (println "Hello, world!"))

(defn say-welcome [what]
  (println "Welcome to" what))

(defn -main []
  say-welcome "Clojure"))