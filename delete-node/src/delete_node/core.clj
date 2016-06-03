(ns delete-node.core
  (:require [delete-node.list :as list])
  (:gen-class))

(defn delete [node]
  (-> node
      (assoc :value (get-in node [:next :value]))
      (assoc :next (get-in node [:next :next]))))