(ns cljsthree.scene.scene)

(defn scene []
  (js/THREE.Scene.))

(defn add [s & os]
  (doseq [o os]
    (.add s o))
  s)

(defn lights [s]
  (into [] (.-__lights s)))

(defn light-count [s]
  (count (lights s)))

(defn objects [s]
  (into [] (.-__objects s)))

(defn object-count [s]
  (count (objects s)))

(extend-type js/THREE.Scene 
  IPrintable
  (-pr-seq [o opts]
    (list "#<Scene>"))
  ICounted
  (-count [o]
    (+ (light-count o) (object-count o))))
