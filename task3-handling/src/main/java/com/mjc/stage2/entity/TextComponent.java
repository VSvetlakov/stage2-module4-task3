package com.mjc.stage2.entity;

import java.util.ArrayList;
import java.util.List;

public class TextComponent extends AbstractTextComponent{
    protected List<AbstractTextComponent> componentList = new ArrayList<>();
    private int size = 0;

    public TextComponent(TextComponentType componentType) {
        super(componentType);
    }

    @Override
    public String operation() {

        StringBuilder result = new StringBuilder();

        for (AbstractTextComponent com: componentList){
            result.append(com.operation());
            result.append(getComponentType().getDelimiter());
        }

        return result.toString();
    }

    @Override
    public void add(AbstractTextComponent textComponent) {
        componentList.add(textComponent);
        size = componentList.size();
    }

    @Override
    public void remove(AbstractTextComponent textComponent) {
        componentList.remove(textComponent);
        size = componentList.size();
    }

    @Override
    public int getSize() {
        return size;
    }
}
