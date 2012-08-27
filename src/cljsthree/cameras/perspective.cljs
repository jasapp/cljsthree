(ns cljsthree.cameras.perspective)

(defn perspective [fov aspect near far]
  (js/THREE.PerspectiveCamera. fov aspect near far))

(defn position [c]
  (.-position c))

;; this is starting to look familiar already... Fix this. 
(defn set-position [c v]
  (let [[x y z] v]
    (.set (position c) x y z))
  c)

(defn look-at [c v]
  (.lookAt c v))

(extend-type js/THREE.PerspectiveCamera
  IPrintable
  (-pr-seq [o opts]
    (list "#<PerspectiveCamera>")))