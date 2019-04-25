(ns command-line-args.core)

(defn keywordize [kvp]
  (let [[k v] kvp]
    [(keyword (.replace k "--" "")) v]))

(defn parse-args [args]
  (into {} (map keywordize (partition 2 args))))


(def state (atom {}))

(defn start []
  (println "Starting ping daemon..."))

(defn stop []
  (println "Stopping ping daemon..."))

(defn work []
  (println "Ping."))

(defn -main []
  (start)
  (identity)
  (while true
    (work)
    (Thread/sleep 1000)))
