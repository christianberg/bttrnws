(ns bttrnws.views.welcome
  (:require [bttrnws.views.common :as common]
            [noir.content.getting-started])
  (:use noir.core
        hiccup.core
        hiccup.page-helpers))

(defpage "/welcome" []
         (common/layout
           [:p "Welcome to bttrnws"]))
