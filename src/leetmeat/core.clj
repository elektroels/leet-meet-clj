(ns leetmeat.core
  ;; Initial
  ;(:require [org.httpkit.server :as server]))
  ;; Initial
  (:require [org.httpkit.server :as server]
            [compojure.core :refer :all]
            [compojure.route :as route]
            [ring.middleware.defaults :refer :all]))

(defn hello-world []
  (str "hello world"))

;; Begynd
(defn handler [req]
  {:status 200
   :NESTED  {:chris 100}
   :headers {"Content-Type" "text/html"}
   :body "<p>chris elsker IKKE html"})
; ikke

(defn create-server []
  (server/run-server handler {:port 8001}))

(defn stop-server [server]
  (server :timeout 100))


;; hot reload
(defroutes app-routes 
  (GET "/" []
    {:status 200
     :headers {"Content-Type" "text/html"}
     :body "<p>chris elsker stadig <strong>IKKE</strong> html"})
  (GET "/chirs/:noget" [noget] 
    {:status 200
     :headers {"Content-Type" "text/html"}
     :body (format "<p>chris elsker %s" noget)})
  (GET "/martin/:noget" [noget] 
    {:status 200
     :headers {"Content-Type" "text/html"}
     :body (format "<p>Anders elsker %s" noget)})
  (route/not-found "Error, page not found!"))

(defn run-hot []
  (let [port (Integer/parseInt (or (System/getenv "PORT") "3000"))]
    (server/run-server (wrap-defaults #'app-routes api-defaults) {:port port})
    (println (str "Running webserver at http:/127.0.0.1:" port "/"))))


;; Macro
(defmacro infix
  "Use this macro when you pine for the notation of your childhood"
  [infixed]
  (list (second infixed) (first infixed) (last infixed)))