package domain;

public class CodeerContext {
    private String test1;
    private  CodingStrategy codingStrategy;

    public CodeerContext(String text, CodingStrategy codingStrategy) {
        this.test1 = text;
        this.codingStrategy=codingStrategy;
    }

    public String codeer(){
        codingStrategy.codeer(test1);
        return null;

    }
    public String decodeer(){
        codingStrategy.decodeer(test1);
        return null;
    }

}
