(defproject weasel "0.4.0-SNAPSHOT"
  :description "websocket REPL environment for ClojureScript"
  :url "http://github.com/tomjakubowski/weasel"
  :license {:name "Unlicense"
            :url "http://unlicense.org/UNLICENSE"
            :distribution :repo}

  :dependencies [[org.clojure/clojure "1.7.0-alpha2"]
                 [org.clojure/clojurescript "0.0-2356" :scope "provided"]
                 [org.clojure/google-closure-library "0.0-20140718-946a7d39" :scope "provided"]
                 [http-kit "2.1.19"]]

  :profiles {:dev {:dependencies [[com.cemerick/piggieback "0.1.3"]]}}
  :source-paths ["src/clj" "src/cljs"]
  :scm {:name "git"
        :url "https://github.com/tomjakubowski/weasel"})
