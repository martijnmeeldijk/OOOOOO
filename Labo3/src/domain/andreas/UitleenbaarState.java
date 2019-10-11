package domain.andreas;

public class UitleenbaarState extends ArtikelState {
    private FeestArtikel artikel;

    public UitleenbaarState(FeestArtikel artikel) {
        this.artikel = artikel;
    }

    @Override
    public double leenUit() {
        artikel.setCurrentState(artikel.getUitgeleendState());
        return artikel.getAanschafprijs() / 5;
    }

    @Override
    public void verwijder() {
        artikel.setCurrentState(artikel.getVerwijderdState());
    }
}
