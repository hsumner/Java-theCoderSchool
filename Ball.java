
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;

/**
 * Write a description of class Ball here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */


public class Ball
{
   double BallRadius = 20;
   double BallX = 100;
   double BallY = 200;
   double xSpeed = 5;
   double ySpeed = 5;
   double xDirection = 1;
   double yDirection = 1;
   double windowWidth;
   double windowHeight;
   Circle circle;
   Ball(int width, int height) {
     circle = new Circle();
     circle.setCenterX(BallX);
     circle.setCenterY(BallY);
     circle.setRadius(BallRadius);
     circle.setFill(Color.BLUE);
     circle.setFocusTraversable(true);
     windowWidth = width;
     windowHeight = height;
    }
    void render() {
        circle.setCenterX(BallX);
        circle.setCenterY(BallY);
    }
     void moveForward() {
         BallX=BallX+xSpeed*xDirection;
         BallY=BallY+ySpeed*yDirection;
        }
        boolean isTouchingBottom() {
        if(BallY >=windowHeight) {
            return true;
        }
        return false;
    }
    boolean isTouchingRight() {
        if(BallX >=windowWidth) {
            return true;
        }
        return false;
    }
    boolean isTouchingLeft() {
        if(BallX <=0) {
            return true;
        }
        return false;
    }
    boolean isTouchingTop() {
        if(BallY >=windowHeight) {
            return true;
        }
        return false;
    }
    void bounceUp() {
    yDirection=yDirection*-1;
    }
    void bounceLeft() {
    System.out.println("Bounce Left ThanosIDK");
        xDirection=xDirection*-1;
}
    void bounceRight() {
    xDirection*=-1;
    }
    void bounceBottom() {
    yDirection=yDirection*-1;
    }
}