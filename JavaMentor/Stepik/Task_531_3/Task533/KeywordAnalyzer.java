package JavaMentor.Stepik.Task_531_3.Task533;

abstract class KeywordAnalyzer implements TextAnalyzer {

    protected abstract String[] getKeywords();

    protected abstract Label getLabel();

    @Override
    public Label processText(String text) {
        for (String keyword : getKeywords()) {
            if (text.contains(keyword)) {
                return getLabel();
            }
        }
        return Label.OK;
    }
}