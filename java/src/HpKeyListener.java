import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class HpKeyListener implements KeyListener {

  private HpComponent hp;
  private TextComponent tc;

  HpKeyListener(HpComponent hp, TextComponent tc) {
    this.hp = hp;
    this.tc = tc;
  }

  @Override
  public void keyTyped(KeyEvent e) {
    if (e.getKeyChar() == '\n') {
      hp.setColor(HexPicker.hexToRgb(tc.getText()));
    }
  }

  @Override
  public void keyPressed(KeyEvent e) { }

  @Override
  public void keyReleased(KeyEvent e) { }
}
