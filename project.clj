(defproject bttrnws "0.1.0-SNAPSHOT"
            :description "Curated Link Sharing Site"
            :dependencies [[org.clojure/clojure "1.3.0"]
                           [noir "1.2.1"]]
            :dev-dependencies [[midje "1.3.0" :exclusions [org.clojure/clojure]]
                               [lein-midje "1.0.7"]
                               [lein-diagnostics "0.0.1"]]
            :main bttrnws.server)

