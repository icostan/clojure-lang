(ns pets.core-test
  (:require [expectations :refer :all]
            [pets.core :refer :all]
            [datomic.api :as d]))

(defn create-empty-in-memory-db []
  (let [uri "datamic:mem://pets-test-db"]
    (d/delete-database uri)
    (d/create-database uri)
    (let [conn (d/connect uri)
          schema (load-file "resources/datomic/schema.edn")]
      (d/transact conn schema)
      conn)))

(expect "John"
       (with-redefs [conn (create-empty-in-memory-db)])
       (do
         (add-pet 'Paco')
         (find-all-pets)))
