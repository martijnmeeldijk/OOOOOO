package domain.andreas;

public class BeschadigdState extends ArtikelState {
    private FeestArtikel artikel;

    public BeschadigdState(FeestArtikel artikel) {
        this.artikel = artikel;
    }

    @Override
    public void verwijder() {
        artikel.setCurrentState(artikel.getVerwijderdState());
    }

    @Override
    public void herstel() {
        artikel.setCurrentState(artikel.getUitleenbaarState());
    }
}
