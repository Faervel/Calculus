package com.faervel.calculus.parser.ast;

import com.faervel.calculus.lib.Value;
import com.faervel.calculus.lib.Variables;

public class VariableExpression implements Expression {

    private final String name;

    public VariableExpression(String name) {
        this.name = name;
    }

    @Override
    public Value eval() {
        if (!Variables.isExists(name)) throw new RuntimeException("Constant does not exists");
        return Variables.get(name);
    }

    @Override
    public String toString() {
//        return String.format("%s [%f]", name, Constants.get(name));
        return String.format("%s", name);
    }
}
