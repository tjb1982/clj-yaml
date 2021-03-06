(defproject org.pojagi/clj-yaml "1.1.1-SNAPSHOT"
  :description "YAML encoding and decoding for Clojure using SnakeYAML"
  :url "https://github.com/tjb1982/clj-yaml"
  :license {:name "Eclipse Public License - v 1.0"
            :url "http://www.eclipse.org/legal/epl-v10.html"}
  :source-paths ["src/clojure"]
  :java-source-paths ["src/java"]
  ;;:javac-options ["-target" "1.6" "-source" "1.6" "-Xlint:-options"]
  :dependencies
  [[org.clojure/clojure "1.9.0"]
   [org.yaml/snakeyaml "1.23"]
   [org.flatland/ordered "1.5.6"]])
