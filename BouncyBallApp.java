
import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Group;
import javafx.scene.Scene;
/**
 * This is a bouncing ball animation.
 *
 * ThanosCar
 * Bob
 */
public class BouncyBallApp extends Application
{
    final int WIDTH = 700;
    final int HEIGHT = 500;
    Ball ball;
    public static void main(String args[]) {
        launch(args);
    } 
    public void start(Stage stage)throws Exception {
      stage.setTitle("Bouncy Ball");
      Group root = new Group();
      Scene scene = new Scene(root, WIDTH, HEIGHT);
      stage.setScene(scene);
      stage.show();
      ball = new Ball(WIDTH, HEIGHT);
      BallController controller = new BallController(ball);
      root.getChildren().add(ball.circle);
      controller.start();
    }
}