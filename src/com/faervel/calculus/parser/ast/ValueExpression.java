package com.faervel.calculus.parser.ast;

import com.faervel.calculus.lib.NumberValue;
import com.faervel.calculus.lib.StringValue;
import com.faervel.calculus.lib.Value;

public class ValueExpression implements Expression {

    private final Value value;

    public ValueExpression(double value) {
        this.value = new NumberValue(value);
    }

    public ValueExpression(String value) {
        this.value = new StringValue(value);
    }

    @Override
    public Value eval() {
        return value;
    }

    @Override
    public String toString() {
        return value.asString();
    }
}
