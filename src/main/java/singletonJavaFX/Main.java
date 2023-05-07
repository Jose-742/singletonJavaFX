package singletonJavaFX;
import java.net.URISyntaxException;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;
import singletonJavaFX.view.MainScene;

public class Main extends Application{
   private Stage stage;
	
	@Override
	public void start(Stage stage) throws Exception {
		this.stage = stage;
        Scene scene = new MainScene(this);
        stage.setScene(scene);
        stage.show();
	}
	
	 public static void main(String[] args) throws URISyntaxException {
    	 launch(args);
    }

	 public void setScene(Scene scene) {
		stage.setScene(scene);
	 }
}
