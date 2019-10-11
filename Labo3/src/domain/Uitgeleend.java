package domain;

public class Uitgeleend extends MateriaalState {
    public Uitgeleend(Materiaal materiaal) {
        super(materiaal);
    }

    @Override
    double leenUit() {
        return super.leenUit();
    }

    @Override
    double brengTerug(boolean beschadigd) {
        return super.brengTerug(beschadigd);
    }

    @Override
    void herstel() {
        super.herstel();
    }
}
