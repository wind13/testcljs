(require 'cljs.build.api)

;(cljs.build.api/build "src" {:output-to "out/main.js"})
(cljs.build.api/build "src"
  {:main 'hello-world.core
   :output-to "out/main.js"})
