package domain;

public interface CodingStrategy {
    public String decode(String message);
    public String encode(String message);
}
