package utils;

public enum QuestionTypes {
    HOW_MUCH_QUESTION("how much is"),
    HOW_MANY_QUESTION("how many Credits is");

    String questionStr;

    QuestionTypes(String question) {
        this.questionStr = question;
    }

    public String getQuestionStr() {
        return questionStr;
    }
}
