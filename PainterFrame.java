import org.code.neighborhood.*;
public class PainterFrame extends PainterPlus {

  public void paintFrame (String color) {
    while (hasPaint()) {
      paint(color);
      move();
    if (!canMove()) {
      turnRight();
    }
    }
     turnRight();
    while (canMove()) {
      move();
    }
      turnRight();
    while (canMove()) {
      move();
    }
  }
}