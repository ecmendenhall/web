(ns eisago.config
  (:require [carica.core :as carica]))

(def config carica/config)

(def local-config carica/override-config)
