package com.faervel.calculus;

import com.faervel.calculus.parser.Lexer;
import com.faervel.calculus.parser.Parser;
import com.faervel.calculus.parser.Token;
import com.faervel.calculus.parser.ast.Expression;

import java.util.List;

public class Main {
    public static void main(String args[]) {
        final String input = "3 + 2 * 2  * #f";
        final String input2 = "PI + 1";
        final List<Token> tokens = new Lexer(input2).tokenize();
        for (Token token : tokens) {
            System.out.println(token);
        }

        final List<Expression> expressions = new Parser(tokens).parse();
        for (Expression expr : expressions) {
            System.out.println(expr + " = " + expr.eval());
        }
    }
}
