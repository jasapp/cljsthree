(ns cljsthree.core.object3d)

(extend-type js/THREE.Object3D
  IPrintable
  (-pr-seq [o opts]
    (list "#<Object3g>")))