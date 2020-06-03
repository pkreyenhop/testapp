(ns testapp.core
  (:gen-class))

(defn -main
  "I don't do a whole lot ... yet."
  [& args]
  (println "Hello, World!"))

(defn add1 [x]
  (+ 1 x))
(add1 3)
