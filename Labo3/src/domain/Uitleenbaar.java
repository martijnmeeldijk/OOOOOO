package domain;

public class Uitleenbaar extends MateriaalState {
    public Uitleenbaar(Materiaal materiaal) {
        super(materiaal);
    }

    @Override
    double leenUit() {
        this.getMateriaal().setState(getMateriaal().getUitgeleend());
        return getMateriaal().getAanschafprijs() / 5;
    }
    @Override
    void verwijder() {
        this.getMateriaal().setState(this.getMateriaal().getVerwijderd());
    }
}
