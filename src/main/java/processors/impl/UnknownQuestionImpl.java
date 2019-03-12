package processors.impl;

import processors.IQuestions;

public class UnknownQuestionImpl implements IQuestions {
    @Override
    public void processor(String commandLine) {
        System.out.println("I have no idea what you are talking about");
    }
}
