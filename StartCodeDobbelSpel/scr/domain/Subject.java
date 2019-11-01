package domain;

public interface Subject {
    void add(int key,Observer observer);
    void remove(int key, Observer observer);
    void notifyObserver();
}
