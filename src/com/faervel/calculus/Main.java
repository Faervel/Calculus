package com.faervel.calculus;

import com.faervel.calculus.parser.Lexer;
import com.faervel.calculus.parser.Token;

import java.util.List;

public class Main {
    public static void main(String args[]) {
        final String input = "2 + 2";
        final List<Token> tokens = new Lexer(input).tokenize();
        for (Token token : tokens) {
            System.out.println(token);
        }
    }
}
