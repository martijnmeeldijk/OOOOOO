package domain;

public enum CodeerEnum {


    CAESAR ("Caesar", "domain.ConcreteStrategyCaesar"),
    SPIEGEL ("Spiegel", "domain.ConcreteStrategySpiegel"),
    RANDOM ("Random", "domain.ConcreteStrategyRandomAdapter");
    private final String omschrijving, klasse;

    CodeerEnum(String omschrijving, String klasse) {
        this.omschrijving = omschrijving;
        this.klasse = klasse;
    }

    public String getOmschrijving() {
        return omschrijving;
    }

    public String getKlasse() {
        return klasse;
    }
}
