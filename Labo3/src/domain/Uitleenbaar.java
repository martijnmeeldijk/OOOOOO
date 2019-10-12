package domain;

public class Uitleenbaar extends MateriaalState {
    public Uitleenbaar(Materiaal materiaal) {
        super(materiaal);
    }

    @Override
    double leenUit() {
        this.getMateriaal().setCurrentState(getMateriaal().getUitgeleend());
        return getMateriaal().getAanschafprijs() / 5;
    }
    @Override
    void verwijder() {
        this.getMateriaal().setCurrentState(this.getMateriaal().getVerwijderd());
    }
}
