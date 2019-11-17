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

    private int spelersnr;

    private Scene playerScene;
    private Label diceLabel;
    private Button playButton;
    private Label messageLabel;
    private Label messageLabe2;

    private Spel spel;

    public PlayerView(int spelerNummer, Spel spel) {
        //link playerview aan spel
        this.spel = spel;

        //zet spelersnr
        this.spelersnr = spelerNummer;

        //layout
        //creeer componenten
        diceLabel = new Label("score: ");
        playButton = new Button("Werp dobbelstenen");
        playButton.setOnAction(new ThrowDicesHandler());
        playButton.setDisable(true);
        messageLabel = new Label("nog niet geworpen");
        messageLabe2 = new Label("spel nog niet begonnen");

        //plaats componenten
        layoutComponents();

        //creeer en toon
        stage.setScene(playerScene);
        stage.setTitle("Speler " + spelerNummer);
        stage.setResizable(false);
        stage.setX(100 + (spelerNummer - 1) * 350);
        stage.setY(200);
        stage.show();
    }

    private void layoutComponents() {
        VBox root = new VBox(10);
        playerScene = new Scene(root, 250, 140);
        root.getChildren().add(playButton);
        root.getChildren().add(diceLabel);
        root.getChildren().add(messageLabel);
        root.getChildren().add(messageLabe2);
    }

    public void isAanBeurt(boolean aanBeurt) {
        playButton.setDisable(!aanBeurt);
    }

    @Override
    public void update(int nummer) {
        messageLabe2.setText("speler " + nummer + " heeft " + spel.getSpeler(nummer).getScore()+" geworpen");
        if (nummer == spel.getSpeler(spelersnr).getSpelersnr() -1) {
            isAanBeurt(true);
        }
        //beurt eindigt
        if(nummer==spel.aantalSpelers()&& spelersnr==1){
            isAanBeurt(true);
        }
        if(spel.getBeurt()==4) isAanBeurt(false);
    }

    class ThrowDicesHandler implements EventHandler<ActionEvent> {
        @Override
        public void handle(ActionEvent event) {
            spel.getSpeler(spelersnr).gooi();
            spel.getSpeler(spelersnr).berekenScore();
            messageLabel.setText(spel.getSpeler(spelersnr).getScore());
            isAanBeurt(false);
            spel.update(spelersnr);
            spel.getSpeler(spelersnr).notifyObserver();
        }
    }
}
