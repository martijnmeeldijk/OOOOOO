package application;
	
import domain.Spel;
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
		spel.add(1,pv1);
		spel.add(2,pv2);
		spel.add(3,pv3);

		pv1.getSpeler().add(2,pv2);
		pv1.getSpeler().add(1,pv1);
		pv1.getSpeler().add(3,pv3);
		pv1.getSpeler().add(99,spel);

		pv2.getSpeler().add(1,pv1);
		pv2.getSpeler().add(2,pv2);
		pv2.getSpeler().add(3,pv3);
		pv2.getSpeler().add(99,spel);

		pv3.getSpeler().add(1,pv1);
		pv3.getSpeler().add(3,pv3);
		pv3.getSpeler().add(2,pv2);
		pv3.getSpeler().add(99,spel);



		pv1.isAanBeurt(true);

	}
	
	public static void main(String[] args) {
		launch(args);
	}
}
