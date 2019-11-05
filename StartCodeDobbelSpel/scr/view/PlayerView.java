package view;
import domain.Observer;
import domain.Spel;
import domain.Speler;
import domain.Subject;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
public class PlayerView implements Observer {
	private Stage stage = new Stage();
	private Speler speler;
	private Scene playerScene;
	private Label diceLabel; 
	private Button playButton; 
	private Label messageLabel;
	private Label messageLabe2;
	private Spel spel;

	public PlayerView(int spelerNummer, Spel spel){
		this.spel= spel;
		this.speler = new Speler(spelerNummer);
		diceLabel = new Label("beurt 1: ");
		playButton = new Button("Werp dobbelstenen");
		playButton.setOnAction(new ThrowDicesHandler());
		playButton.setDisable(true);
		messageLabel = new Label("Spel nog niet gestart");
		messageLabe2 = new Label("nog niemand heeft geworpen");


		layoutComponents();
		stage.setScene(playerScene);
		stage.setTitle("Speler "+spelerNummer);
		stage.setResizable(false);		
		stage.setX(100+(spelerNummer-1) * 350);
		stage.setY(200);
		stage.show();
	}

	private void layoutComponents() {
		VBox root = new VBox(10);
		playerScene = new Scene(root,250,140);
		root.getChildren().add(playButton);
		root.getChildren().add(diceLabel);
		root.getChildren().add(messageLabel);
		root.getChildren().add(messageLabe2);
	}
	
	public void isAanBeurt(boolean aanBeurt){
		playButton.setDisable(!aanBeurt);		
	}

	@Override
	public void update(int spelersNummer) {
		messageLabe2.setText("speler "+ spelersNummer+ " heeft score "+ ((PlayerView)speler.getObservers().get(spelersNummer)).getSpeler().getPunten() );
		if(spelersNummer==speler.getSpelersnr()-1){
			isAanBeurt(true);
		}
		//spel.update(spelersNummer);
	}

	class ThrowDicesHandler implements EventHandler<ActionEvent> {
        @Override
        public void handle(ActionEvent event) {
        	speler.gooi();
        	messageLabel.setText(Integer.toString(speler.berekenScore()));
        	isAanBeurt(false);
			speler.notifyObserver();

		}
    }

	public Speler getSpeler() {
		return speler;
	}
}
