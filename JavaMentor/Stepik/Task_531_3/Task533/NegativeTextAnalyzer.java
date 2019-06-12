package JavaMentor.Stepik.Task_531_3.Task533;

class NegativeTextAnalyzer extends KeywordAnalyzer {
    private String[] smiles = new String[]{":(", "=(", ":|"};

    @Override
    protected String[] getKeywords() {
        return smiles;
    }

    @Override
    protected Label getLabel() {
        return Label.NEGATIVE_TEXT;
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