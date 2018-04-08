package com.faervel.calculus;

import com.faervel.calculus.parser.Lexer;
import com.faervel.calculus.parser.Parser;
import com.faervel.calculus.parser.Token;
import com.faervel.calculus.parser.ast.Statement;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

public final class Main {

    public static void main(String[] args) throws IOException {
        final String input = new String( Files.readAllBytes(Paths.get("prog.txt")), "UTF-8");
        final List<Token> tokens = new Lexer(input).tokenize();
        for (Token token : tokens) {
            System.out.println(token);
        }

        final Statement program = (Statement) new Parser(tokens).parse();
        System.out.println(program.toString());
        program.execute();
    }
}
