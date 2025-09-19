import org.code.neighborhood.*;
public class PainterTent extends PainterPlus {

  public void paintTent(String color) {
    turnRight();
    while (canMove()){
    move();
  }
    turnLeft();
    move();
    move();
    turnLeft();
    move();
    paint(color);
    turnRight();
    move();
    paint(color);
    turnLeft();
    move();
    paint (color);
    turnLeft();
    turnLeft();
    move();
    turnLeft();
    move();
    paint(color);
    move();
    move();
    paint(color);
    move();
    paint(color);
    turnLeft();
    move();
    turnLeft();
    move();
    paint(color);
    move();
    paint(color);
    while (canMove()){
    move();
  }
  turnLeft();
  while (canMove()){
    move();
  }
    turnRight();
  }
}