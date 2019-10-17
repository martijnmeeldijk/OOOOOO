package domain;

public class Beschadigd extends MateriaalState {

    public Beschadigd(Materiaal materiaal) {
        super(materiaal);
    }

    @Override
    public void herstel() {
        getMateriaal().setCurrentState(getMateriaal().getUitleenbaar());
    }

    @Override
    public void verwijder() {
        getMateriaal().setCurrentState(getMateriaal().getVerwijderd());

    }
}
