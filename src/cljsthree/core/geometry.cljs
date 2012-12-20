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

(defn vertices [g]
  (into [] (.-vertices g)))

(defn add-vertices [g & vs]
  (doseq [v vs]
    (.push (.-vertices g) v))
  g)

(defn vertices-count [g]
  (count (vertices g)))

(extend-type js/THREE.Geometry
  IPrintable  
  (-pr-seq [o opts]
    (list "#<Geometry>")))

