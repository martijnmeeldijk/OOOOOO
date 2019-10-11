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
        if (beschadigd) {
            getMateriaal().setState(getMateriaal().getBeschadigd());
            return getMateriaal().getAanschafprijs() / 3;
        } else {
            getMateriaal().setState(getMateriaal().getUitleenbaar());
            return 0;
        }
    }
}
