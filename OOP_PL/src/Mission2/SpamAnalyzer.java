package Mission2;

public class SpamAnalyzer extends AbstractKeywordAnalyzer implements TextAnalyzer {
    private String[] keywords;

    public SpamAnalyzer(String[] words) {
    }

    @Override
    public String[] getKeywords() {
        return this.keywords;

    }

    @Override
    public Label getLabel() {
        return Label.SPAM;
    }
}
