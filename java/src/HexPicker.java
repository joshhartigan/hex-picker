import javax.swing.*;
import java.awt.*;

class HpWindow extends JComponent {
  public void paint(Graphics g) {
    // testing code {
      g.setColor(new Color(34, 209, 24));
      g.fillRect(10, 10, 200, 200);
    // }
  }
}

public class HexPicker {
  public static void main(String[] args) {

    JFrame window = new JFrame("Hex Picker 3000");
    window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    window.setBounds(30, 30, 300, 300);
    window.getContentPane().add(new HpWindow());
    window.setVisible(true);

  }
}
