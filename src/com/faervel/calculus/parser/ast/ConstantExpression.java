package com.faervel.calculus.parser.ast;

import com.faervel.calculus.lib.Constants;

public class ConstantExpression implements Expression {

    private final String name;

    public ConstantExpression(String name) {
        this.name = name;
    }

    @Override
    public double eval() {
        if (!Constants.isExists(name)) throw new RuntimeException("No constant");
        return Constants.get(name);
    }

    @Override
    public String toString() {
        return String.format("%s [%f]", name, Constants.get(name));
    }
}
