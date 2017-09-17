(defproject collection-check "0.1.7"
  :description "fuzz testing for alternate data structures"
  :license {:name "MIT License"
            :url "http://opensource.org/licenses/MIT"}
  :dependencies [[org.clojure/test.check "0.9.0"]
                 [com.gfredericks/test.chuck "0.2.8"]
                 [org.clojure/clojure "1.9.0-alpha20"]]
  :profiles {:dev {:dependencies []}})
