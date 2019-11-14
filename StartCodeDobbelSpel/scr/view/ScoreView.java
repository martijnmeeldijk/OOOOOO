package view;

import domain.Observer;
import domain.Speler;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

import java.util.HashMap;
import java.util.Map;

public class ScoreView implements Observer{
	private Stage stage = new Stage();
	private Scene scoreScene;
	private Label scoreLabel;
	private Label testLabel;



	public ScoreView(){
		scoreLabel = new Label("");
		testLabel = new Label("beurt 1");
		//scoreLabel.setStyle("-fx-font-family: \"Courier new\"; -fx-font-size: 12; -fx-text-fill: darkred;"); verandert niets

		layoutComponents();
		stage.setScene(scoreScene);
		stage.setTitle("Overzicht scores");
		stage.setResizable(false);		
		stage.setX(100);
		stage.setY(400);
		stage.show();
	}


	private void layoutComponents() {
		VBox root = new VBox();
		scoreScene = new Scene(root,400,200);
		root.getChildren().add(testLabel);
		root.getChildren().add(scoreLabel);
	}
	
	public void voegScoreLijnToe(String scoreLijn){
		scoreLabel.setText(scoreLabel.getText()+"\n"+scoreLijn);
	}

	public void updateLabel(String string){
		testLabel.setText(string);
	}
	public String getlabel(){
		return  testLabel.getText();
	}

	@Override
	public void update(int beurtnr) {
		scoreLabel.setText("");
		System.out.println(beurtnr);
		testLabel.setText("beurt "+beurtnr);
	}
}
