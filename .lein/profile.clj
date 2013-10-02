{:user {:plugins [[lein-ancient "0.4.4"]
                  [lein-bikeshed "0.1.3"]
                  [lein-try "0.3.0"]
                  [lein-vanity "0.1.0"]
                  [jonase/eastwood "0.0.2"]
                  [lein-kibit "0.0.8"]
                  [com.aphyr/prism "0.1.1"]
                  [quickie "0.2.2"]
                  [lein-typed "0.3.0"]
                  [lein-marginalia "0.7.1"]
                  [org.timmc/nephila "0.2.0"]
                  [lein-cloverage "1.0.2"]]
        :aliases {"eval" ["run" "-m" "clojure.main/main" "-e"]}
        :dependencies [[org.clojure/tools.namespace "0.2.4"]
                       [org.clojure/tools.trace "0.7.6"]
                       [org.clojure/core.typed "0.2.4"]
                       [night-vision "0.1.0-SNAPSHOT"]
                       [alembic "0.2.0"]
                       [riddley "0.1.0"]
                       [wally "0.1.1"]
                       [jark "0.4.3"]]}}

;; Documentation

;; lein try [clj-time "0.5.1"]
;; lein try clj-time
