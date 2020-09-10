(ns holes.core)

(defn test-core []
  (do
    (def my-hmap (hmap {
                         :name      "Landon"
                         :languages [
                                      :clojure
                                      :python3
                                      :rust
                                      :julia
                                      :java
                                      :elixir
                                      :c++
                                      :typescript
                                      :kotlin]
                         :emotion   :happy}
                       [
                         :age
                         :favorite-number]))
    (assert (= ))
    ))
