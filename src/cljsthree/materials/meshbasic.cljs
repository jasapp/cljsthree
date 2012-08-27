(ns cljsthree.materials.meshbasic
  (:use [cljsthree.util :only [map->js]]))

(defn meshbasic 
  ([] (meshbasic {}))
  ([opts]
     (js/THREE.MeshBasicMaterial. (map->js opts))))

(extend-type js/THREE.MeshBasicMaterial
  IPrintable
  (-pr-seq [o opts]
    (list "#<MeshBasicMaterial>")))
