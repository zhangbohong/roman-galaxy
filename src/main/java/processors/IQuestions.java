package processors;

import exceptions.UnknownSymbolException;

public interface IQuestions {

    void processor(String commandLine) throws UnknownSymbolException;
}
