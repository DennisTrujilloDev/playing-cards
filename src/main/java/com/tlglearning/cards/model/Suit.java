package com.tlglearning.cards.model;

public enum Suit {

  CLUBS('\u2663'),
  DIAMONDS('\u2662'),
  HEARTS('\u2661'),
  SPADES('\u2660');
//each of these instances is being plugged into ctor
  private final char symbol;

  Suit(char symbol) {
    this.symbol = symbol;
  }

  public char getSymbol() {
    return symbol;
  }
}
