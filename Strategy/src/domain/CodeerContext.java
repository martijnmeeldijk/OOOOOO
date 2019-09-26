package domain;

public class CodeerContext {
    private String text;
    private  CodingStrategy codingStrategy;

    public CodeerContext(String text, CodingStrategy codingStrategy) {
        this.text = text;
        this.codingStrategy=codingStrategy;
    }

    public String codeer(){
        codingStrategy.codeer(text);
        return null;

    }
    public String decodeer(){
        codingStrategy.decodeer(text);
        return null;
    }

}
