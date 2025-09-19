import org.code.neighborhood.*;

public class NeighborhoodRunner {
  public static void main(String[] args) {
/*
 * sets amount of paint to 48 and paints the frame tan
 */
    PainterFrame nic = new PainterFrame();
      nic.setPaint(48);

    nic.paintFrame("Tan");

/*
 * sets amount of paint to 10 and paints outline of the tent in Black
 */
    
    PainterOutline joe = new PainterOutline();
    
    joe.setPaint(10);
    
    joe.paintOutline("black");

/*
 * sets amount of paint to 8 and paints the inside of the tent Red
 */
    
    PainterTent kyle = new PainterTent();

    kyle.setPaint(8);

    kyle.paintTent("red");

/*
 * sets amount of paint to 10 and paints the outline of the mountain black
 */
    
    PainterMountain greg = new PainterMountain();

    greg.setPaint(10);

    greg.paintMountainOutline("black");

    greg.setPaint(40);

    greg.paintMountain("green");

 /*
 * sets amount of paint to 35 and paints the sky
 */
    
    PainterSky leia = new PainterSky();

    leia.setPaint (35);

    leia.paintSky("blue");
    
  }
}