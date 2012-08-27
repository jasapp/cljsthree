(ns cljsthree.materials.linebasic
  (:use [cljsthree.util :only [map->js]]))

(defn linebasic 
  ([] (linebasic {}))
  ([opts]
     (js/THREE.LineBasicMaterial. (map->js opts))))

(extend-type js/THREE.LineBasicMaterial
  IPrintable
  (-pr-seq [o opts]
    (list "#<LineBasicMaterial>")))
