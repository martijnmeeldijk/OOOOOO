package domain;

public class Uitleenbaar extends MateriaalState {
    public Uitleenbaar(Materiaal marteriaal) {
        super(marteriaal);
    }

    @Override
    double leenUit() {
        return super.leenUit();
    }

    @Override
    void verwijder() {
        super.verwijder();
    }
}
