package com.faervel.calculus.parser;

public enum TokenType {

    NUMBER,
    HEX_NUMBER,
    WORD,
    TEXT,

    // keywords
    PRINT,

    PLUS,
    MINUS,
    STAR,
    SLASH,
    EQ,

    LPAREN,
    RPAREN,

    EOF
}