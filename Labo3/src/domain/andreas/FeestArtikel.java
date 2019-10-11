package domain.andreas;


import java.io.Serializable;

public class FeestArtikel implements Serializable {
    private ArtikelState beschadigdState;
    private ArtikelState uitgeleendState;
    private ArtikelState uitleenbaarState;
    private ArtikelState verwijderdState;
    private String naam;
    private ArtikelState currentState = uitleenbaarState;
    private double aanschafprijs;

    public FeestArtikel(String naam, double aanschafprijsprijs) {
        beschadigdState = new BeschadigdState(this);
        uitgeleendState = new UitgeleendState(this);
        uitleenbaarState = new UitleenbaarState(this);
        verwijderdState = new VerwijderdState();
        setNaam(naam);
        setAanschafprijs(aanschafprijsprijs);
    }

    // STATE METHODES
    public double leenUit() {
        return currentState.leenUit();
    }

    public double brengTerug(boolean beschadigd) {
        return currentState.brengTerug(beschadigd);
    }

    public void verwijder() {
        currentState.verwijder();
    }

    public void herstel() {
        currentState.herstel();
    }

    // GETTERS
    public ArtikelState getCurrentState() {
        return currentState;
    }

    public ArtikelState getBeschadigdState() {
        return beschadigdState;
    }

    public ArtikelState getUitgeleendState() {
        return uitgeleendState;
    }

    public ArtikelState getUitleenbaarState() {
        return uitleenbaarState;
    }

    public ArtikelState getVerwijderdState() {
        return verwijderdState;
    }

    public double getAanschafprijs() {
        return aanschafprijs;
    }

    // SETTERS
    public void setCurrentState(ArtikelState state) {
        this.currentState = state;
    }

    private void setAanschafprijs(double aanschafprijs) {
        this.aanschafprijs = aanschafprijs;
    }

    private void setNaam(String naam) {
        this.naam = naam;
    }

    @Override
    public String toString() {
        return naam;
    }
}
