package Mission2;

public class NegativeTextAnalyzer extends AbstractKeywordAnalyzer implements TextAnalyzer {
    private String[] keywords = new String[]{":(", "=(", ":|"};

    @Override
    public String[] getKeywords() {
        return this.keywords;
    }

    @Override
    public Label getLabel() {
        return Label.NEGATIVE_TEXT;
    }


}
