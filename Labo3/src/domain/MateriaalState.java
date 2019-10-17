package domain;

import domain.NotPossibleException;

public abstract class MateriaalState {
    private Materiaal materiaal;
    public double leenUit() {
        throw new NotPossibleException();
    }
    public double brengTerug(boolean beschadigd) {
        throw new NotPossibleException();
    }
    public void verwijder() {
        throw new NotPossibleException();
    }
    public void herstel() {
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
