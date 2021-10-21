package application;

import java.time.LocalDate;

import javafx.application.Application;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.DatePicker;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextField;
import javafx.scene.control.ToggleGroup;
import javafx.scene.layout.GridPane;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class NextPage extends Application  {

	Stage window;
	Scene scene;
	
	public NextPage() {
	
		window= new Stage();
		window.setTitle("Add User (H_R_S)");
		window.setHeight(370);
		window.setWidth(400);
		window.setResizable(false);
		
		addcomponents();
		
		window.setScene(scene);
		window.show();
	
	}
	
	private void addcomponents() {
		//Text heading = new Text("Add User");
		
		Label name= new Label("Name");
		TextField ntext= new TextField();
		
		Label email= new Label("Email");
		TextField etext= new TextField();

		Label gender= new Label("Gender");
		ToggleGroup group= new ToggleGroup();
		RadioButton rmale= new RadioButton("Male");
		RadioButton rfemale= new RadioButton("Female");
		rmale.setToggleGroup(group);
		rfemale.setToggleGroup(group);
		
		Label edu= new Label("Education");
		ObservableList<String> items= FXCollections.observableArrayList(
				"Phd", "Master", "Graduate", "Intermediate", "Matric", "Secondary", "Primaray");

		ListView<String> eduList= new ListView<String>(items);
		eduList.setPrefHeight(40);
		
		
		Label loc= new Label("Location");
		ComboBox<String> locList= new ComboBox<String>();
		locList.getItems().add("Karachi");
		locList.getItems().add("Islamabad");
		locList.getItems().add("Multan");
		locList.getItems().add("Lahore");
		locList.getItems().add("Peshawer");
		locList.getItems().add("Other");
		
		Label dob= new Label("DOB");
		DatePicker date= new DatePicker();
		date.setValue(LocalDate.now());
		
		Button btnsignup= new Button("Add User");
		Button btnclear= new Button("Clear");
				
		GridPane layout= new GridPane();
		layout.setPadding(new Insets(20));
		layout.setVgap(10);
		layout.add(name, 0, 1);
		layout.add(ntext, 1, 1);
		layout.add(email, 0, 2);
		layout.add(etext, 1, 2);
		layout.add(gender, 0, 3);
		layout.add(rmale, 1, 3);
		layout.add(rfemale, 1, 3);
		layout.setMargin(rfemale, new Insets(0, 0, 0 , 80));
		
		layout.add(edu, 0, 4);
		layout.add(eduList, 1, 4);
		layout.add(loc, 0, 5);
		layout.add(locList, 1, 5);
		layout.add(dob, 0, 6);
		layout.add(date, 1, 6);
		layout.add(btnsignup, 1, 7);
		layout.add(btnclear, 1, 7);
		layout.setMargin(btnclear, new Insets(0, 0, 0 , 80));
	
		
		btnsignup.setOnAction(new EventHandler<ActionEvent>() {
			
			public void handle(ActionEvent arg0) {
				Alert alert= new Alert(AlertType.INFORMATION);
				alert.setHeaderText(null);
				alert.setContentText("Added successfully!!");
				alert.show();
			}
		});
		
		 scene= new Scene(layout);	
	}

	@Override
	public void start(Stage arg0) throws Exception {
		// TODO Auto-generated method stub
		
	}
}