(defn compute-discount-amount [amount discount-percent min-charge]
  (let [discounted-amount (* amount (-1.0 discount-percent))]
  (if (> discounted-amount min-charge)
    discounted-amount
    min-charge)))