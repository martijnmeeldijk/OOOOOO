package domain;

public class CodeerContext {
    private String text;
    private  CodingStrategy codingStrategy;

    public CodeerContext(String text, CodingStrategy codingStrategy) {
        this.text = text;
        this.codingStrategy=codingStrategy;
    }

    public String Codeer(){
        return null;

    }
    public String Decodeer(){
        return null;
    }
}
