package domain;

public class CodeerContext {
    private String text;
    private String result;
    private  CodingStrategy codingStrategy;

    public CodeerContext(String text, CodingStrategy codingStrategy) {
        this.text = text;
        this.codingStrategy=codingStrategy;
    }

    public void codeer(){
       result=  codingStrategy.codeer(text);
    }
    public void decodeer(){
        result= codingStrategy.decodeer(text);
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public String getResult() {
        return result;
    }

    public void setResult(String result) {
        this.result = result;
    }

    public CodingStrategy getCodingStrategy() {
        return codingStrategy;
    }

    public void setCodingStrategy(CodingStrategy codingStrategy) {
        this.codingStrategy = codingStrategy;
    }
}
