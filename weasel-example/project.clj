(defproject weasel-example "NOT_RELEASED"
  :description "example project for the weasel ClojureScript REPL env"
  :url "https://github.com/tomjakubowski/weasel"
  :license {:name "Unlicense"
            :url "http://unlicense.org/UNLICENSE"
            :distribution :repo}

  :dependencies [[org.clojure/clojure "1.7.0-alpha2"]
                 [org.clojure/clojurescript "0.0-2356"]
                 [weasel "0.4.0-SNAPSHOT"]]

  :source-paths ["src"]
  :profiles {:dev {:dependencies [[com.cemerick/piggieback "0.1.4-SNAPSHOT"]]
                   :plugins [[lein-cljsbuild "1.0.4-SNAPSHOT"]]
                   :repl-options {:nrepl-middleware [cemerick.piggieback/wrap-cljs-repl]}
                   :cljsbuild {:builds [{:id "weasel-example"
                                         :source-paths ["src"]
                                         :compiler {:output-to "weasel_example.js"
                                                    :output-dir "out"
                                                    :optimizations :none
                                                    :source-map true}}]}}})
