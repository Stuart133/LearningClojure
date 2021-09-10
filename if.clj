(def print-greeting [preferred-customer]
  (if preferred-customer
    (println "Welcome back to Blotts books")
    (println "Welcome to Blotts books")))

(defn shipping-charge [preferred-customer order-amount]
  (if preferred-customer
    0.00
    (* order-amount 0.10)))

(defn shipping-surcharge? [preferred-customer express oversized]
  (and (not preferred-customer) (or express oversized)))

