package singletonJavaFX.view;


import javafx.scene.control.Button;
import javafx.scene.layout.TilePane;
import singletonJavaFX.Main;

public class MainScene extends AbstractScene{

	public MainScene(Main main) {
		super(main);
		
		var btnRelatorios = new Button("Relatórios");
		var btnConfig = new Button("Configurações");
		setRoot(new TilePane(btnRelatorios, btnConfig));
		
		btnRelatorios.setOnAction(event -> main.setScene(new RelatoriosScene(main)));
		btnConfig.setOnAction(event -> main.setScene(new ConfigScene(main)));
	}

}
