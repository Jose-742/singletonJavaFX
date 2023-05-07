package singletonJavaFX.view;

import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.VBox;
import singletonJavaFX.Main;
import singletonJavaFX.model.Config;

public class ConfigScene extends AbstractScene{
	private final Config config = Config.getInstance();

	public ConfigScene(Main main) {
		super(main);
		
		var label1 = new Label("Formato de Relatórios");
		var fieldFormatoRelatorios = new TextField(config.getFormatRelatorios());
		var label2 = new Label("Tipo de Gráficos");
		var fieldTipoGraficos = new TextField(config.getTipoGrafico());
		var btnOK = new Button("OK");
		
		setRoot(new VBox(label1,fieldFormatoRelatorios, label2, fieldTipoGraficos, btnOK));
		btnOK.setOnAction(event ->{
			config.setFormatRelatorios(fieldFormatoRelatorios.getText());
			config.setTipoGrafico(fieldTipoGraficos.getText());
			main.setScene(new MainScene(main));
		} );
	}

}
