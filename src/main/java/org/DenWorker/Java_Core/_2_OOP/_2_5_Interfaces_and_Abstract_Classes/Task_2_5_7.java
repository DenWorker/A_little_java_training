package org.DenWorker.Java_Core._2_OOP._2_5_Interfaces_and_Abstract_Classes;

public class Task_2_5_7 {
    public static void main(String[] args) {
        Task_2_5_7 task_2_5_7 = new Task_2_5_7();
        SpamAnalyzer spamAnalyzer = task_2_5_7.new SpamAnalyzer(new String[]{"башка", "дурак", "блин"});
        NegativeTextAnalyzer negativeTextAnalyzer = task_2_5_7.new NegativeTextAnalyzer();
        TooLongTextAnalyzer tooLongTextAnalyzer = task_2_5_7.new TooLongTextAnalyzer(6);

        TextAnalyzer[] analyzers1 = new TextAnalyzer[]{spamAnalyzer, negativeTextAnalyzer, tooLongTextAnalyzer};
        System.out.println(task_2_5_7.checkLabels(analyzers1, "башка Привет :( Денис"));
        System.out.println(task_2_5_7.checkLabels(analyzers1, "Денис"));
    }

    public Label checkLabels(TextAnalyzer[] analyzers, String text) {
        for (TextAnalyzer analyzer : analyzers) {
            Label resultLabel = analyzer.processText(text);
            if (resultLabel != Label.OK) {
                return resultLabel;
            }
        }
        return Label.OK;
    }

    enum Label {
        SPAM, NEGATIVE_TEXT, TOO_LONG, OK
    }

    interface TextAnalyzer {
        Label processText(String text);
    }

    abstract public class KeywordAnalyzer implements TextAnalyzer {
        protected abstract String[] getKeywords();

        protected abstract Label getLabel();

        @Override
        public Label processText(String text) {
            for (String word : getKeywords()) {
                if (text.contains(word)) {
                    return getLabel();
                }
            }
            return Label.OK;
        }
    }

    public class SpamAnalyzer extends KeywordAnalyzer {
        private final String[] keywords;
        private final Label label = Label.SPAM;

        public SpamAnalyzer(String[] keywords) {
            this.keywords = keywords;
        }

        @Override
        protected String[] getKeywords() {
            return this.keywords;
        }

        @Override
        protected Label getLabel() {
            return this.label;
        }
    }

    public class NegativeTextAnalyzer extends KeywordAnalyzer {
        private final String[] keywords;
        private final Label label = Label.NEGATIVE_TEXT;

        public NegativeTextAnalyzer() {
            this.keywords = new String[]{":(", "=(", ":|"};
        }

        @Override
        protected String[] getKeywords() {
            return this.keywords;
        }

        @Override
        protected Label getLabel() {
            return this.label;
        }
    }

    public class TooLongTextAnalyzer implements TextAnalyzer {
        private final int maxLength;

        public TooLongTextAnalyzer(int maxLength) {
            this.maxLength = maxLength;
        }

        @Override
        public Label processText(String text) {
            return (text.length() > this.maxLength) ? (Label.TOO_LONG) : (Label.OK);
        }
    }
}
