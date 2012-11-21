(defproject jenkins-nrepl "1.0.0-SNAPSHOT"
  :description "FIXME: write description"
  :dependencies [[org.clojure/clojure "1.5.0-master-SNAPSHOT"]
                 [org.clojure/tools.nrepl "0.2.0-beta10"]
                 [com.cemerick/drawbridge "0.0.6"]
                 [ring/ring-servlet "1.1.6"]]
  :plugins [[org.thelastcitadel/jenkins-clojure-injector "0.1.0"]]
  :jenkins-inject jenkins-nrepl.core/boot)
