package application;


import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.DatePicker;
import javafx.scene.control.ListView;
import javafx.scene.control.TextField;

  import model.Modelim;

public class SampleController {
	@FXML
	private Button gorevEkleButton;
	@FXML
	
	private TextField gorevAciklamasiTextField;
	@FXML
	DatePicker tarihSeciciDatePicker;
	@FXML
	private ListView<Modelim> gorevListView;
	
	ObservableList<Modelim> dataModelims=FXCollections.observableArrayList();
	
	@FXML
	  private void butonCalisanKod(ActionEvent e) {
		var yeniGorev= new Modelim(tarihSeciciDatePicker.getValue(),gorevAciklamasiTextField.getText());
	    dataModelims.add(yeniGorev);
	    gorevListView.setItems(dataModelims);
	}
	
}
