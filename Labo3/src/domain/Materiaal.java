package domain;

public class Materiaal {
    private MateriaalState currentState;
    private MateriaalState verwijderd;
    private MateriaalState uitleenbaar;
    private MateriaalState uitgeleend;
    private MateriaalState beschadigd;

    public Materiaal(){
        this.verwijderd = new Verwijderd();
        this.uitgeleend = new Uitgeleend();
        this.uitleenbaar = new Uitleenbaar();
        this.beschadigd = new Beschadigd();
        this.currentState = uitleenbaar;
    }

    private void setState(MateriaalState state){
        this.currentState = state;
    }




}
