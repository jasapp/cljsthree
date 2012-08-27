(ns cljsthree.core.materials.material)

(extend-type js/THREE.Material
  IPrintable
  (-pr-seq [o opts]
    (list "#<Material>")))