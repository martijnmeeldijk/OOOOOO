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
		PlayerView pv4 = new PlayerView(4,spel);
		PlayerView pv3 = new PlayerView(3,spel);
		PlayerView pv2 = new PlayerView(2,spel);
		PlayerView pv1 = new PlayerView(1,spel);
		Speler speler1= new Speler(1);
		Speler speler2= new Speler(2);
		Speler speler3= new Speler(3);
		Speler speler4= new Speler(4);
		spel.add(1,speler1);
		spel.add(2,speler2);
		spel.add(3,speler3);
		spel.add(4,speler4);

		speler1.add(1,pv1);
		speler1.add(2,pv2);
		speler1.add(3,pv3);
		speler1.add(4,pv4);

		speler2.add(1,pv1);
		speler2.add(2,pv2);
		speler2.add(3,pv3);
		speler2.add(4,pv4);

		speler3.add(1,pv1);
		speler3.add(2,pv2);
		speler3.add(3,pv3);
		speler3.add(4,pv4);

		speler4.add(1,pv1);
		speler4.add(2,pv2);
		speler4.add(3,pv3);
		speler4.add(4,pv4);

		pv1.isAanBeurt(true);

	}
	
	public static void main(String[] args) {
		launch(args);
	}
}
