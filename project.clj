(defproject ring-1 "0.1.0-SNAPSHOT"
  :description "FIXME: write description"
  :url "http://example.com/FIXME"
  :license {:name "Eclipse Public License"
            :url "http://www.eclipse.org/legal/epl-v10.html"}
  :plugins [[lein-ring "0.9.7"]]
  :dependencies [[org.clojure/clojure "1.8.0"]
                 [ring/ring-core "1.4.0"]
                 [ring/ring-jetty-adapter "1.4.0"]]
  ;;lein-ring plugin monitors the file specified
  :ring {:handler ring-1.core/handler}
  :main ^:skip-aot ring-1.core
  :target-path "target/%s"
  :profiles {:uberjar {:aot :all}})
