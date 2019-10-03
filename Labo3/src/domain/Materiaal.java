package domain;

public class Materiaal {
    private MateriaalState state;
    private MateriaalState verwijderd;
    private MateriaalState uitleenbaar;
    private MateriaalState uitgeleend;
    private MateriaalState beschadigd; // zoals Maarten

    public Materiaal(){
        this.verwijderd = new Verwijderd();
        this.uitgeleend = new Uitgeleend();
        this.uitleenbaar = new Uitleenbaar();
        this.beschadigd = new Beschadigd();
        this.state = uitleenbaar;
    }

}
