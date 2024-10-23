package com.mjc.stage2.parser;

import java.util.ArrayList;
import java.util.List;

public class ChainParserBuilder {
    private List<AbstractTextParser> parsers = new ArrayList<>();

    public ChainParserBuilder() {
    }

    public ChainParserBuilder setParser(AbstractTextParser abstractTextParser) {
        parsers.add(abstractTextParser);
        return this;
    }

    public AbstractTextParser build() {

        if (parsers.size() == 0)
            return null;

        AbstractTextParser parser = parsers.get(0);

        for (int i = 1; i < parsers.size(); i++) {
            parser.setNextParser(parsers.get(i));
        }

        return parsers.get(0);
    }
}
