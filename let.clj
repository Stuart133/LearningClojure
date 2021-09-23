(defn compute-discount-amount [amount discount-percent min-charge]
  (let [discount (* amount discount-percent)
        discounted-amount (- amount discount)]
  (if (> discounted-amount min-charge)
    discounted-amount
    min-charge)))