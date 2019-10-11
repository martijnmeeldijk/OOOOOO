package domain;

public class Beschadigd extends MateriaalState {

    public Beschadigd(Materiaal materiaal) {
        super(materiaal);
    }

    @Override
    void herstel() {
        getMateriaal().setState(getMateriaal().getUitleenbaar());
    }

    @Override
    void verwijder() {
        getMateriaal().setState(getMateriaal().getVerwijderd());

    }
}
