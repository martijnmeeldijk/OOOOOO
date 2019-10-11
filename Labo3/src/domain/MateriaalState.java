package domain;

import domain.andreas.NotPossibleException;

public abstract class MateriaalState {
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
}
