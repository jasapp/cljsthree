(ns cljsthree.core.objects.mesh
  (:use [cljsthree.core.object3d :only [Position]]))

(defn mesh 
  ([g] 
     (js/THREE.Mesh. g))
  ([g m]
     (js/THREE.Mesh. g m)))

(defn position [m]
  (.-position m))

;; why can't I call apply here? 
(defn set-position [m v]
  (let [[x y z] v]
    (.set (position m) x y z))
  m)

(extend-type js/THREE.Mesh 
  IPrintable
  (-pr-seq [o opts]
    (list "#<Mesh>")))
