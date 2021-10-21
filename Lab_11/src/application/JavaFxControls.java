package application;
import javafx.application.Application;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.ComboBox;
import javafx.scene.control.DatePicker;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import javafx.scene.control.RadioButton;
import javafx.scene.control.ToggleGroup;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.text.Font;
import javafx.stage.Stage;

public class JavaFxControls extends Application{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		launch(args);
	}

	@Override
	public void start(Stage stage) throws Exception {
		
		Label  heading= new Label("JavaFx Controls Lab 11");
		heading.setFont(Font.font ("Verdana", 30));
		//heading.setFont(Fon);
		
		//A button with an empty text caption.
		Button button1 = new Button("Wrong");
		//A button with the specified text caption.
		Button button2 = new Button("Accept");
		
		// Using radio buttons

		RadioButton radioButton1 = new RadioButton("Left");
        RadioButton radioButton2 = new RadioButton("Right");
        RadioButton radioButton3 = new RadioButton("Up");
        RadioButton radioButton4 = new RadioButton("Down");

        // using toggle group for single selection of radio buttons
        ToggleGroup radioGroup = new ToggleGroup();

        radioButton1.setToggleGroup(radioGroup);
        radioButton2.setToggleGroup(radioGroup);
        radioButton3.setToggleGroup(radioGroup);
        radioButton4.setToggleGroup(radioGroup);

        // Using CheckBox
        Label l = new Label("What do you listen:     ");  
        CheckBox c1 = new CheckBox("Radio 1");  
        CheckBox c2 = new CheckBox("Radio 106");  
        CheckBox c3 = new CheckBox("Radio");  
        CheckBox c4 = new CheckBox("FM GOLD");  
   
        //using ComboBOx
        Label l2 = new Label("Where do you live:     ");  
        ComboBox<String> comboBox = new ComboBox<String>();

        comboBox.getItems().add("Karachi");
        comboBox.getItems().add("Lahore");
        comboBox.getItems().add("Islamabd");
        comboBox.getItems().add("Peshawar");
        comboBox.getItems().add("Other...");
        
        // using date picker
        Label l3 = new Label("Date : ");  
        DatePicker datePicker = new DatePicker();

     // using ListView
        Label edu= new Label("Education");
		ObservableList<String> items= FXCollections.observableArrayList(
				"Phd", "Master", "Graduate", "Intermediate", "Matric");

		ListView<String> eduList= new ListView<String>(items);
		eduList.setPrefHeight(40);
        
        // adding button
        HBox h = new HBox(20);
		h.getChildren().addAll(button1, button2);
		
		// adding radio button 
        HBox h1 = new HBox(10,radioButton1, radioButton2, radioButton3, radioButton4);
        
        // adding check box
        HBox h2 = new HBox(10);  
        h2.getChildren().addAll(l,c1,c2,c3,c4);  
		// adding Combo box
        HBox h3 = new HBox(10);  
        h3.getChildren().addAll( l2,comboBox); 
		//adding date picker
        HBox h4 = new HBox(10, l3, datePicker);
        
        //adding list view
        HBox h5 = new HBox(10, edu, eduList);
        
        
        VBox v = new VBox(20);
        v.setPadding(new Insets(20));
		v.getChildren().addAll(heading, h1, h2, h3, h4, h5, h);
		
		Scene s = new Scene(v, 500, 500);
		
		stage.setScene(s);
		stage.show();
	}

}
