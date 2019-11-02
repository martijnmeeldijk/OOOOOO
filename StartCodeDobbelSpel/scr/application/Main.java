package application;
	
import javafx.application.Application;
import javafx.stage.Stage;
import view.PlayerView;
import view.ScoreView;

public class Main extends Application {
	@Override
	public void start(Stage primaryStage) {
		ScoreView scoreView= new ScoreView();
		PlayerView pv3 = new PlayerView(3,scoreView);
		PlayerView pv2 = new PlayerView(2,scoreView);
		PlayerView pv1 = new PlayerView(1,scoreView);

		pv1.getSpeler().add(2,pv2);
		pv1.getSpeler().add(1,pv1);
		pv1.getSpeler().add(3,pv3);
		pv2.getSpeler().add(1,pv1);
		pv2.getSpeler().add(2,pv2);
		pv2.getSpeler().add(3,pv3);
		pv3.getSpeler().add(1,pv1);
		pv3.getSpeler().add(3,pv3);
		pv3.getSpeler().add(2,pv2);
		pv1.isAanBeurt(true);



		//dit moet nog veranderd worden te dependant
		scoreView.add(1,pv1.getSpeler());
		scoreView.add(2,pv2.getSpeler());
		scoreView.add(1,pv3.getSpeler());

	}
	
	public static void main(String[] args) {
		launch(args);
	}
}
