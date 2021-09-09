(defn escape-html [string]
  replace-all string [["&" "&amp;"]
                      ["\"" "&quot;"]
                      ["<" "&lt;"
                      [">" "&gt;"]]])