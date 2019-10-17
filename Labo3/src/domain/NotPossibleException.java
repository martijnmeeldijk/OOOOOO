package domain;


public class NotPossibleException extends IllegalArgumentException {

    public NotPossibleException(){
        super("Kan dit niet uitvoeren in deze state");
    }
}
