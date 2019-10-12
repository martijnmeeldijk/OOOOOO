package domain;

public class Beschadigd extends MateriaalState {

    public Beschadigd(Materiaal materiaal) {
        super(materiaal);
    }

    @Override
    void herstel() {
        getMateriaal().setCurrentState(getMateriaal().getUitleenbaar());
    }

    @Override
    void verwijder() {
        getMateriaal().setCurrentState(getMateriaal().getVerwijderd());

    }
}
