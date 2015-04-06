import javax.swing.*;
import java.awt.*;

class HpComponent extends JComponent {
  private Color color;

  HpComponent() {
    color = new Color(0, 0, 0);
  }

  public void setColor(Color color) {
    this.color = color;
  }

  public void paint(Graphics g) {
    g.setColor(color);

    int width = 200;
    int height = 200;

    g.fillRect(0, 0, width / 2, height);
  }
}

public class HexPicker {
  public static void main(String[] args) {

    JFrame window = new JFrame("Hex Picker 3000");
    window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    window.setLayout(new GridLayout());

    HpComponent hp = new HpComponent();
    window.getContentPane().add(hp);

    TextField tf = new TextField();
    window.getContentPane().add(tf);

    int width = 200;
    int height = 200;

    window.setSize(width, height);
    window.setVisible(true);

  }
}
