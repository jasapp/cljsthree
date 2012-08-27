(ns cljsthree.extras.geometries.sphere)

(defn sphere
  ([] (sphere {}))
  ([radius segments-width segments-height]
     (js/THREE.SphereGeometry. radius segments-width segments-height)))

(extend-type js/THREE.SphereGeometry
  IPrintable
  (-pr-seq [o opts]
    (list "#<SphereGeometry>")))
