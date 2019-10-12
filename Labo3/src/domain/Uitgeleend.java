package domain;

public class Uitgeleend extends MateriaalState {
    public Uitgeleend(Materiaal materiaal) {
        super(materiaal);
    }

    @Override
    double brengTerug(boolean beschadigd) {
        if (beschadigd) {
            getMateriaal().setCurrentState(getMateriaal().getBeschadigd());
            return getMateriaal().getAanschafprijs() / 3;
        } else {
            getMateriaal().setCurrentState(getMateriaal().getUitleenbaar());
            return 0;
        }
    }
}
