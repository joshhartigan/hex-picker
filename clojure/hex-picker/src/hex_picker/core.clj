(ns hex-picker.core
  (:import
    (javax.swing JOptionPane JFrame JTextArea JButton)
    (java.awt FlowLayout))
  (:gen-class))

(defn -main []
  (let [button (JButton. "hello, world")
        window (JFrame. "hello, world")
        text (JTextArea. "hello, world")]
    (doto window
      (.setLayout (FlowLayout.))
      (.add button)
      (.add text)
      (.pack)
      (.setDefaultCloseOperation (JFrame/EXIT_ON_CLOSE))
      (.setVisible true))))
