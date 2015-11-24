(ns to-do-clojure.core
  (:gen-class))
(def to-dos (atom []))    ; making a vector called to-dos  atom makes it mutable

(defn add-to-do [input]
  (reset! to-dos (conj (deref to-dos) input))                                                      ; end let
  ) ; end add-to-do



(defn -main [& args]
  (println "Type a to-do and hit enter")
   (loop []
     (let [input (read-line)]
       (when (not= input "q")
         (add-to-do input)
         (recur))))
  (println (deref to-dos))
  )                                                         ; end -main
