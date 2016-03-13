(ns ring-1.core
  (:require [ring.adapter.jetty :as jetty])
  (:gen-class))

(defn handler [request]
  {:status 200
   :headers {"Content-Type" "text/plain"}
   :body "Hello Clojure, Hello Ring!2232"})

(defn -main []
  (jetty/run-jetty handler {:port 3000}))


(comment
  ;;to start the jetty in the normal way run
  lein run
  ;;to run using lein-ring plugin which monitors the handler
  ;;changes without restarting
  lein ring server
  )
