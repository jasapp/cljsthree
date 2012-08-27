(ns cljsthree.renderers.webgl
  (:use [cljsthree.util :only [map->js]]))

(defn webgl
  ([] (webgl {}))
  ([options]
     (js/THREE.WebGLRenderer. (map->js options))))

(defn render [r s c]
  (.render r s c))

(defn set-size [r width height]
  (.setSize r width height))

  