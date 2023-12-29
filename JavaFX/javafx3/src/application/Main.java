package application;
	
import java.io.IOException;

import controllers.SampleController;
import gorevSerialize.GorevSerializer;
import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Parent;
import javafx.scene.Scene;

import javafx.fxml.FXMLLoader;

public class Main extends Application {
	private static SampleController appController;
	private static Scene scene;
	@Override
	public void start(Stage primaryStage) throws IOException{
		scene=new Scene(loadFXML("Sample"));
		primaryStage.setScene(scene);
		primaryStage.show();
		
		
	}
	@Override
	public void stop() throws IOException {
		GorevSerializer.serialize(appController.gorevleriAl());;
		
	}
	
	public static Parent loadFXML(String fxml) throws IOException {
		FXMLLoader fxmlLoader=new FXMLLoader(Main.class.getResource("/views/"+fxml+".fxml"));
	    Parent parent=fxmlLoader.load();
	    appController=fxmlLoader.getController();
	    return parent;
	}
	public static void main(String[] args) {
		launch(args);
	}
}
