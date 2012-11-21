(ns jenkins-nrepl.core
  (:require [clojure.tools.nrepl.server :as nrepl-server]))

(defn boot []
  (nrepl-server/start-server :port 7888))
