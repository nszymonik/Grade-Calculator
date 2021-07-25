package Menus;

import java.util.ArrayList;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.text.Text;
import javafx.stage.Stage;

import External.MainDirectoryInfo;
import Files.ReadingWriting;
import Math.Grade;


public class GUI extends Application {
	
	private String baseFolder;
	
	private ReadingWriting fileHandler;
	
	private void save (ArrayList<Grade> grades)
	{
		//TO DO
	}
	
	private void startGUI ()
	{
		//baseFolder = MainDirectoryInfo.getMainDirectory() + "Grade-Calculator/";
		//fileHandler = new ReadingWriting(baseFolder);
		
		// MDI's getMainDirectory() has to be static for this to work
		// baseFolder cannot be private for the constructor to work?
		
		// Creates the scene
		Stage s = new Stage();
        s.setTitle("Start GUI");
        VBox vb = new VBox();
        
        //********** Example GUI, has Header, Textfield, and Button
        //HBox hb = new HBox(new Text(""));
        //TextField waitField = new TextField("0");
        //hb.getChildren().addAll(waitField);
        //Button submit = new Button("Submit Instruction");
        //submit.setOnMouseClicked(event -> s.hide());
        //vb.getChildren().addAll(hb, submit);
        //********** End of Example
        
        // Buttons Created
        Button create = new Button("Create New Class");
        Button load = new Button("Update/View Existing Class");
        create.setOnMouseClicked(event -> createClassGUI() );
        load.setOnMouseClicked(event -> System.out.print("Loading a class"));
        
        // All Scenes added to VBox and Scene Set
        vb.getChildren().addAll(create, load);
        s.setScene(new Scene(vb, 520, 620));
        s.show();
		
		System.out.println("Ensuring everything is working.");
	}
	
	private void createClassGUI ()
	{
		// Rather than recreating a stage,
		// we should pass the stage as a param
		// and set the scene instead
		
		// Creates the Stage
		Stage s = new Stage();
		s.setTitle("Create Class GUI");
		VBox vb = new VBox();
		
		// All Scenes added to VBox and Scene Set
        s.setScene(new Scene(vb, 520, 620));
        s.show();
		
		System.out.println("Ensuring everything is working.");
	}
	
	private void mainGUI (ArrayList<Grade> grades)
	{
		//TO DO
	}
	
	@Override
	/**
	 * Method to run the GUI.
	 * 
	 * @param arg0 A stage we will not be using.
	 * @throws any relevant exception that may come up.
	 */
	public void start(Stage arg0) throws Exception {
		GUI runProgram = new GUI();
		runProgram.startGUI();
	}

	/**
	 * The main method. Runs the program.
	 * For JavaFX, this is a fallback method.
	 * 
	 * @param args Commandline arguments
	 */
	public static void main(String[] args) {
		launch(args);
	}

}
