package com.faervel.calculus;

import com.faervel.calculus.parser.Lexer;
import com.faervel.calculus.parser.Parser;
import com.faervel.calculus.parser.Token;
import com.faervel.calculus.parser.ast.Statement;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

public class Main {
    public static void main(String[] args) throws IOException {
        final String input = new String( Files.readAllBytes(Paths.get("prog.txt")), "UTF-8");
        final List<Token> tokens = new Lexer(input).tokenize();
        for (Token token : tokens) {
            System.out.println(token);
        }

        final List<Statement> statements = new Parser(tokens).parse();
//        for (Statement statement : statements) {
//            System.out.println(statement);
//        }
        for (Statement statement : statements) {
            statement.execute();
        }
    }
}
