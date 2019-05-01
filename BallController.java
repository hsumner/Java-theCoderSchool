import javafx.animation.AnimationTimer;
import javafx.event.EventHandler;
import javafx.scene.input.KeyEvent;
/**
 * This controls the ball
 *
 * @author Thanos
 * 5.0
 */
public class BallController extends AnimationTimer implements EventHandler <KeyEvent>
{
    Ball ball;
    BallController(Ball ball) {
        this.ball=ball;
        ball.circle.setOnKeyPressed(this); 
            
       
    }
    public void handle(long arg0){
        //Move the ball forward
        ball.moveForward();
        System.out.println("in handle method");
        if (ball.isTouchingBottom()) {
            ball.bounceUp();
        }
        if (ball.isTouchingRight()) {
            System.out.println("touchingRight");
            ball.bounceLeft();
        }
        if (ball.isTouchingLeft()) {
            ball.bounceRight();
        }
        if (ball.isTouchingTop()) {
            ball.bounceBottom();
        }
        
        ball.render();
    }
    public void handle(KeyEvent arg0){
        
    }
}
