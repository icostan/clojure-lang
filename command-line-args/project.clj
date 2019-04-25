(defproject command-line-args "0.1.0-SNAPSHOT"
  :description "FIXME: write description"
  :url "http://example.com/FIXME"
  :license {:name "Eclipse Public License"
            :url "http://www.eclipse.org/legal/epl-v10.html"}
  :dependencies [[org.clojure/clojure "1.5.1"]]
  :dev-dependencies [[lazytest "1.1.2"]
                     [lein-autotest "1.2.0"]]
  :profiles {:dev {:plugins [[lein-daemon "0.5.4"]
                             [com.jakemccrary/lein-test-refresh "0.3.4"]
                             [lein-autotest "1.2.0"]]}}
  :main command-line-args.core
  :daemon {:ping {:ns command-line-args.core
                  :pidfile "ping.pid"}}
  )

