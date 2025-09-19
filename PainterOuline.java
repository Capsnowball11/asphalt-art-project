import org.code.neighborhood.*;
public class PainterOutline extends PainterPlus {
public void paintOutline(String color){
    turnRight();
    while (canMove()){
      move();
    } 
    turnRight();
    turnRight();
    move();
    turnRight();
    move();
    paint(color);
    move();
    turnLeft();
    move();
    paint(color);
    move();
    turnRight();
    move();
    paint(color);
    turnRight();
    move();
    turnLeft();
    move();
    paint(color);
    move();
    turnRight();
    move();
    paint(color);
    turnLeft();
    move();
    move();
    move();
    paint(color);
    turnLeft();
    move();
    turnLeft();
    move();
    paint(color);
    move();
    turnRight();
    move();
    paint(color);
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