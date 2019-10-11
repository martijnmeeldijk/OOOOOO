package domain;

import domain.andreas.NotPossibleException;

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

    public Materiaal getArtikel() {
        return materiaal;
    }

    public void setArtikel(Materiaal materiaal) {
        this.materiaal = materiaal;
    }
}
