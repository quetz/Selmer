(defproject selmer "0.9.5"
  :description "Django style templates for Clojure"
  :url "https://github.com/yogthos/Selmer"
  :license {:name "Eclipse Public License"
            :url "http://www.eclipse.org/legal/epl-v10.html"}
  :dependencies [[org.clojure/clojure "1.7.0"]
                 [criterium "0.4.3" :scope "test"]
                 [joda-time "2.9.1"]
                 [commons-codec "1.10"]
                 [json-html "0.3.6"]
                 [fipp "0.6.3"]
                 [cheshire "5.5.0"]]

  :aot [selmer.node]
  :javac-options ["-target" "1.6"]

  :test-selectors {:default (complement :benchmark)
                   :benchmark :benchmark
                   :all (constantly true)}
  :profiles {:dev {:global-vars {*warn-on-reflection* true}
                   :repl-options {:port 10123}
                   :plugins [[lein-marginalia "0.8.0"]]
                   :dependencies [[environ "1.0.1"]]}})
