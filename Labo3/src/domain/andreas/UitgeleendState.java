package domain.andreas;


public class UitgeleendState extends ArtikelState {
    private FeestArtikel artikel;

    public UitgeleendState(FeestArtikel artikel) {
        this.artikel = artikel;
    }

    @Override
    public double brengTerug(boolean beschadigd) {
        if (beschadigd) {
            artikel.setCurrentState(artikel.getBeschadigdState());
            return artikel.getAanschafprijs() / 3;
        }
        else {
            artikel.setCurrentState(artikel.getUitleenbaarState());
            return 0;
        }
    }
}
