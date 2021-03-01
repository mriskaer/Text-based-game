// Marie Margrethe Riskær Povlsen 66708
// Mikkel Iuel 66443
// Nanna Holst Larsen 66438

public class Option {
    private String keyword;
    private Situation consequence;

    public String getKeyword (){
        return keyword;
    }

    public Situation getConsequence(){
        return consequence;
    }

    public Option (String keyword, Situation consequence){
        this.keyword = keyword;
        this.consequence = consequence;
    }
}
