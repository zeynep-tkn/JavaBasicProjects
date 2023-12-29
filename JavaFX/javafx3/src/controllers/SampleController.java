package controllers;

import javafx.scene.input.KeyEvent;
import javafx.stage.Stage;
import javafx.stage.StageStyle;

import java.io.IOException;
import java.net.URL;
import java.security.KeyStore.TrustedCertificateEntry;
import java.time.LocalDate;
import java.util.ResourceBundle;

import application.Main;
import gorevSerialize.GorevSerializer;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.Button;
import javafx.scene.control.DatePicker;
import javafx.scene.control.ListView;
import javafx.scene.control.TextField;
import javafx.scene.input.KeyCode;
import model.Modelim;
import routing.Routing;

public class SampleController implements Initializable{
	@FXML 
	private Button gorevEkleButton;
	@FXML
	private TextField gorevAciklamasiTextField;
	@FXML
    DatePicker tarihSeciciDatePicker;
	@FXML
	private Button silButton;
	@FXML
	private ListView<Modelim> gorevListView;
	
	ObservableList<Modelim> dataModelims=FXCollections.observableArrayList();
	
	@FXML
	private void butonCalisanKod() {
		var yeniGorev= new Modelim(tarihSeciciDatePicker.getValue(),gorevAciklamasiTextField.getText());
	   
		dataModelims.add(yeniGorev);
	    gorevListView.setItems(dataModelims);
	    
	}
	
	@FXML
	private void butonsil(ActionEvent e) {
		dataModelims.remove(gorevListView.getSelectionModel().getSelectedIndex());
	}
	
	@FXML
	private void textfieldEnter(KeyEvent event) {
		if(event.getCode()==KeyCode.ENTER) {
			butonCalisanKod();
		}
	}
	
	@FXML
	private void girisYapBtnKodum() throws IOException{
		Routing.redirectPage("Giriş Paneli","GirisPaneli", null,StageStyle.UTILITY, false);
	}
	
	
   public Object[] gorevleriAl() {
	   return gorevListView.getItems().toArray();
   }
	
	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		tarihSeciciDatePicker.setValue(LocalDate.now());
		try{
			var gorevler= GorevSerializer.deserialize();
			gorevListView.getItems().addAll(gorevler);
		}
	    catch (Exception e) {
			Alert alert= new Alert(AlertType.ERROR);
			alert.setTitle("TodoApp Hatası");
			alert.setHeaderText("Gorevler yuklenemedi.Dosya sisteminizi kontrol ediniz");
		}	
		
	}
	
	
}
