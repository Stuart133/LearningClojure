(def debug-enabled false)

(defn debug [msg]
  (if debug-enabled
    (println msg)))

(binding [debug-enabled true]
  (debug "Calling that darned function")
  (some-function-that-needs-logging)
  (debug "Back from that darned function"))