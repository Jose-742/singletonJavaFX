package singletonJavaFX.view;


import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.TilePane;
import singletonJavaFX.Main;
import singletonJavaFX.model.Config;

public class RelatoriosScene extends AbstractScene{
	private final Config config = Config.getInstance();
	
	public RelatoriosScene(Main main) {
		super(main);
		
		var label = new Label("Formato de Relatórios = " + config.getFormatRelatorios());
		var btnVoltar = new Button("Voltar");
		setRoot(new TilePane(label, btnVoltar));
		btnVoltar.setOnAction(event -> main.setScene(new MainScene(main)));
	}

}
