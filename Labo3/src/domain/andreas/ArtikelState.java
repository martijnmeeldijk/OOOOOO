package domain.andreas;

import java.io.Serializable;

public abstract class ArtikelState implements Serializable {
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
