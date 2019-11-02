package view;

import domain.Observer;
import domain.Speler;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

import java.util.HashMap;
import java.util.Map;

public class ScoreView implements Observer {
	private Stage stage = new Stage();
	private Scene scoreScene;
	private Label scoreLabel;
	Map<Integer, Speler> spelers;



	public ScoreView(){
		spelers= new HashMap<Integer,Speler>();
		scoreLabel = new Label();
		scoreLabel.setStyle("-fx-font-family: \"Courier new\"; -fx-font-size: 12; -fx-text-fill: darkred;");

		layoutComponents();
		stage.setScene(scoreScene);
		stage.setTitle("Overzicht scores");
		stage.setResizable(false);		
		stage.setX(100);
		stage.setY(400);
		stage.show();
	}
	public void add(int key,Speler speler) {
		spelers.put(key,speler);
	}

	private void layoutComponents() {
		VBox root = new VBox();
		scoreScene = new Scene(root,400,200);
		root.getChildren().add(scoreLabel);
	}
	
	private void voegScoreLijnToe(String scoreLijn){
		scoreLabel.setText(scoreLabel.getText()+"\n"+scoreLijn);
	}

	@Override
	public void update(int spelersNummer) {
		scoreLabel.setText(scoreLabel.getText() + "\n" + "speler: "+ spelersNummer+ " heeft score");
		//scoreLabel.setText(scoreLabel.getText() + "\n" + "speler "+ spelersNummer+ " heeft score "+ (spelers.get(spelersNummer).getPunten()));

	}
}
