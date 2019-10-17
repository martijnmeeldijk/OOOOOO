package domain;

import domain.NotPossibleException;

public abstract class MateriaalState {
    private Materiaal materiaal;
    double leenUit() {
        throw new NotPossibleException();
    }
    double brengTerug(boolean beschadigd) {
        throw new NotPossibleException();
    }
    void verwijder() {
        throw new NotPossibleException();
    }
    void herstel() {
        throw new NotPossibleException();
    }

    public MateriaalState(Materiaal materiaal) {
        this.materiaal = materiaal;
    }

    public Materiaal getMateriaal() {
        return materiaal;
    }

    public void setMateriaal(Materiaal materiaal) {
        this.materiaal = materiaal;
    }
}
