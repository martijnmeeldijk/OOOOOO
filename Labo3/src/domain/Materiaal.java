package domain;

public class Materiaal {
    private MateriaalState currentState;
    private MateriaalState verwijderd;
    private MateriaalState uitleenbaar;
    private MateriaalState uitgeleend;
    private MateriaalState beschadigd;
    private String naam;
    private double aanschafprijs;


    public Materiaal(String naam, double aanschafprijs){
        this.verwijderd = new Verwijderd(this);
        this.uitgeleend = new Uitgeleend(this);
        this.uitleenbaar = new Uitleenbaar(this);
        this.beschadigd = new Beschadigd(this);
        this.currentState = uitleenbaar;
        this.naam= naam;
        this.aanschafprijs=aanschafprijs;
    }

    public double leenUit(){
        return currentState.leenUit();
    }
    public void verwijder(){
        currentState.verwijder();
    }
    public void herstel(){
        currentState.herstel();
    }
    public double brengTerug(Boolean beschadigd){
        return currentState.brengTerug(beschadigd);
    }

    //setters
    public void setCurrentState(MateriaalState state){
        this.currentState = state;
    }



    //getters
    public MateriaalState getCurrentState() {return currentState;}
    public MateriaalState getVerwijderd() {
        return verwijderd;
    }

    public MateriaalState getUitleenbaar() {
        return uitleenbaar;
    }

    public MateriaalState getUitgeleend() {
        return uitgeleend;
    }

    public MateriaalState getBeschadigd() {
        return beschadigd;
    }

    public String getNaam() {
        return naam;
    }

    public double getAanschafprijs() {
        return aanschafprijs;
    }
}
