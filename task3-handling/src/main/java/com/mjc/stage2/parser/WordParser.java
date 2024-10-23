package com.mjc.stage2.parser;


import com.mjc.stage2.entity.AbstractTextComponent;
import com.mjc.stage2.entity.SymbolLeaf;

public class WordParser extends AbstractTextParser{
    @Override
    public void parse(AbstractTextComponent abstractTextComponent, String string) {
        char[] charAr = string.toCharArray();

        for (char ch : charAr){
            abstractTextComponent.add(new SymbolLeaf(ch));
        }
    }
}
