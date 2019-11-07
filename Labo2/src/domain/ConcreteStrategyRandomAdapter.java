package domain;

public class ConcreteStrategyRandomAdapter implements CodingStrategy {
    RandomCypher cypher;

    public ConcreteStrategyRandomAdapter() {
        cypher = new RandomCypher();
    }

    @Override
    public String decodeer(String message) {
        return String.valueOf(cypher.decypher(message.toCharArray()));
    }

    @Override
    public String codeer(String message) {
        return String.valueOf(cypher.encypher(message.toCharArray()));
    }
}
