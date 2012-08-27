(ns cljsthree.core.vector3)

(defn vector3 
  ([] (js/THREE.Vector3.))
  ([x y z] (js/THREE.Vector3. x y z)))

(defn x [v]
  (.-x v))

(defn y [v]
  (.-y v))

(defn z [v]
  (.-z v))

(defn normalize [v]
  (.normalize v))

(defn dist [v1 v2]
  (.distanceTo v1 v2))

(defn dist-sq [v1 v2]
  (.distanceToSquared v1 v2))

(defn cross [v1 v2]
  (.cross v1 v2))

(extend-type js/THREE.Vector3
  ISeqable
  (-seq [o]
    (list (x o) (y o) (z o)))
  IPrintable  
  (-pr-seq [o opts]
    (list "#<Vector3 "
          (apply str (interpose "," (list (x o) (y o) (z o))))
          ">")))
