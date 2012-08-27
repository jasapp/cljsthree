(ns cljsthree.core.geometry)

(defn geometry []
  (js/THREE.Geometry.))

(defn faces [g]
  (into [] (.-faces g)))

(defn add-faces [g & fs]
  (doseq [f fs]
    (.push (.-faces g) f))
  g)

(defn faces-count [g]
  (count (faces g)))

(defn verticies [g]
  (into [] (.-verticies g)))

(defn add-verticies [g & vs]
  (doseq [v vs]
    (.push (.-verticies g) v))
  g)

(defn verticies-count [g]
  (count (verticies g)))

(extend-type js/THREE.Geometry
  IPrintable  
  (-pr-seq [o opts]
    (list "#<Geometry>")))

