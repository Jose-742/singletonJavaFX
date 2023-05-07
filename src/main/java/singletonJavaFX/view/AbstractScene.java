package singletonJavaFX.view;

import javafx.scene.Scene;
import javafx.scene.layout.TilePane;
import singletonJavaFX.Main;

public abstract class AbstractScene extends Scene{

	public AbstractScene(Main main) {
		super(new TilePane(), 640, 480);
	}

	
}
