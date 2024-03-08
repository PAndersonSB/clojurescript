(ns core
  (:require react-dom))

(.render js/ReactDOM
         (.createElement js/React "h2" nil "Hello, React!")
         (.getElementById js/document "app"))
;clj -M --main cljs.main --compile core --repl
;clj -M -m cljs.main -c core -r