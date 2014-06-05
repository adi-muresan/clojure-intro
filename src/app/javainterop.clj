(ns app.javainterop
  (:import [java.util Date]
           [java.text SimpleDateFormat]))

;; instantiation
(def now (Date.))

(def now (new Date))

(def fmt (new SimpleDateFormat "yyyy.MM.dd - hh:mm:ss a"))

;; calling methods
(. fmt format now)

(.format fmt now)

;; accessing static content
(. java.lang.System/out println "stuff")

(.println java.lang.System/out "stuff")

