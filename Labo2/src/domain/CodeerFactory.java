package domain;

public class CodeerFactory {
    public static CodingStrategy createCoding(String codeerNaam){
        CodeerEnum codeerEnum = CodeerEnum.valueOf(codeerNaam);
        String klasseNaam = codeerEnum.getKlasse();
        CodingStrategy codingStrategy = null;
        try{
            Class dbClass = Class.forName(klasseNaam);
            Object dbObject = dbClass.newInstance();
            codingStrategy = (CodingStrategy) dbObject;
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        return codingStrategy;

    }
}
