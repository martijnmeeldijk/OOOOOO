package domain;

public class Rekening {
    private final String nummer;
    private double saldo;

    public Rekening(String nummer){
        this.nummer = nummer;
    }
    public Rekening(String nummer, double saldo){
        this.nummer = nummer;
        this.saldo = saldo;
    }

    public String getNummer() {
        return nummer;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
}
