package application;
	
import domain.Spel;
import domain.Speler;
import javafx.application.Application;
import javafx.stage.Stage;
import view.PlayerView;
import view.ScoreView;

public class Main extends Application {
	@Override
	public void start(Stage primaryStage) {
		Spel spel = new Spel();
		PlayerView pv3 = new PlayerView(3,spel);
		PlayerView pv2 = new PlayerView(2,spel);
		PlayerView pv1 = new PlayerView(1,spel);
		Speler speler1= new Speler(1);
		Speler speler2= new Speler(2);
		Speler speler3= new Speler(3);
		spel.add(1,speler1);
		spel.add(2,speler2);
		spel.add(3,speler3);

		speler1.add(99,pv1);
		speler1.add(98,pv2);
		speler1.add(97,pv3);

		speler2.add(99,pv1);
		speler2.add(98,pv2);
		speler2.add(97,pv3);

		speler3.add(99,pv1);
		speler3.add(98,pv2);
		speler3.add(97,pv3);

		pv1.isAanBeurt(true);

	}
	
	public static void main(String[] args) {
		launch(args);
	}
}
