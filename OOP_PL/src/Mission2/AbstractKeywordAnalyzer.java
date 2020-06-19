package Mission2;


public abstract class AbstractKeywordAnalyzer implements TextAnalyzer {
    public abstract String[] getKeywords();

    public abstract Label getLabel();

    public Label processText(String text) {

        for (String keyword : getKeywords()) {
            if (text.contains(keyword))
                return getLabel();
        }
        return Label.OK;


    }
}
