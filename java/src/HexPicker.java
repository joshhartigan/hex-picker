import javax.swing.*;
import java.awt.*;
import java.text.NumberFormat;

class HpComponent extends JComponent {
  private Color color;

  HpComponent() {
    color = new Color(0, 0, 0);
  }

  public void setColor(Color color) {
    this.color = color;
    repaint();
  }

  public void paint(Graphics g) {
    g.setColor(color);

    int width = 200;
    int height = 200;

    g.fillRect(0, 0, width / 2, height);
  }
}

public class HexPicker {

  public static Color hexToRgb(String hexCode) {
    try {
      return new Color(
        Integer.valueOf(hexCode.substring(0, 2), 16),
        Integer.valueOf(hexCode.substring(2, 4), 16),
        Integer.valueOf(hexCode.substring(4, 6), 16));
    } catch (NumberFormatException e) {
      JOptionPane.showMessageDialog(null, "incorrect hex code");
      return null;
    }
  }

  public static void main(String[] args) {

    JFrame window = new JFrame("Hex Picker 3000");
    window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    window.setLayout(new GridLayout());

    HpComponent hp = new HpComponent();
    window.getContentPane().add(hp);

    TextField tf = new TextField();
    tf.addKeyListener(new HpKeyListener(hp, tf));
    window.getContentPane().add(tf);

    int width = 200;
    int height = 200;

    window.setSize(width, height);
    window.setVisible(true);

  }
}
