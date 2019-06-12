package JavaMentor.Stepik.Task_531_3.Task533;

//import JavaMentor.Stepik.Task_531_3.Task533.Label;
//import JavaMentor.Stepik.Task_531_3.Task533.TextAnalyzer;

class SpamAnalyzer extends KeywordAnalyzer {
    private String[] keywords;

    public SpamAnalyzer(String[] array) {
        keywords = array;
    }

    @Override
    protected String[] getKeywords() {
        return keywords;
    }

    @Override
    protected Label getLabel() {
        return Label.SPAM;
    }

    @Override
    public Label processText(String text) {
        String[] keywords = getKeywords();
        for (String temp : keywords) {
            if (text.contains(temp)) {
                return getLabel();
            }
        }
        return Label.OK;
    }
}