package domain;

public interface Subject {
    void addObserver(Actie type,Observer observer);
    void removeObserver(Observer observer);
    void notifyObserver(Rekening rekening);
}
