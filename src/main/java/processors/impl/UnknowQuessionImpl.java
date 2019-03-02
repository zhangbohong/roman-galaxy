package processors.impl;

import processors.IQuestions;

public class UnknowQuessionImpl implements IQuestions {
    @Override
    public void processor(String commandLine) {
        System.out.println("I have no idea what you are talking about");
    }
}
