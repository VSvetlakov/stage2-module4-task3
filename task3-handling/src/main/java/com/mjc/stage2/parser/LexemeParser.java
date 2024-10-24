package com.mjc.stage2.parser;

import com.mjc.stage2.entity.AbstractTextComponent;
import com.mjc.stage2.entity.SymbolLeaf;
import com.mjc.stage2.entity.TextComponent;
import com.mjc.stage2.entity.TextComponentType;

public class LexemeParser extends AbstractTextParser {
    private static final String LEXEME_REGEX = "\\s+";
    private static final String WORD_REGEX = "\\w[\\w!=?():]+";
    private AbstractTextComponent word;

    @Override
    public void parse(AbstractTextComponent abstractTextComponent, String string) {

        String[] lexemes = string.split(LEXEME_REGEX);

        for (String lexeme : lexemes) {
            AbstractTextComponent word = new TextComponent(TextComponentType.WORD);
            abstractTextComponent.add(word);
            nextParser.parse(word, lexeme);
        }
    }
}
