(ns prettyedn.core
  (:gen-class))

(defn pretty-edn [filename]
  )

(defn -main [& [filename]]
  (pretty-edn (if (or (nil? filename)
                      (= "-" filename))
                (pretty-edn nil)
                (pretty-edn filename))))
