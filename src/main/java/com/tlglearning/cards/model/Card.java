package com.tlglearning.cards.model;

import java.util.Objects;

public class Card implements Comparable<Card>{
  //implements ability to be comparable to cards
  private final Rank rank;
  private final Suit suit;

  private final String rep;
  private final int hash;
  //you dont want to assign them above b/c then all
  //cards would have the same values for those fields

  public Card(Rank rank, Suit suit) {
    this.rank = rank;
    this.suit = suit;
    rep = rank.getSymbol() + suit.getSymbol();
    hash = Objects.hash(rank, suit);
    //Objects.hash takes the number 31 then the .hash on first object then multiples by 31
    //then adds hash code for next object
  }

  public Rank getRank() {
    return rank;
  }

  public Suit getSuit() {
    return suit;
  }

  @Override
  public int hashCode() {
    return super.hashCode();
  }

  @Override
  public boolean equals(Object obj) {
  boolean result;
  if(this == obj){
    result = true;
    //checking if the instance being called is the same object
    //its being compared to (pointing to same place in memory)
  }else if(obj instanceof Card){
    Card other = (Card) obj;
    //even if we know its an instance of Card,
    //its reference type is still Object
    result = (rank == other.rank && suit == other.suit);
    }else{
    result = false;
  }
  return result;
  }

  @Override
  public String toString() {
    return rep;
  }

  @Override
  public int compareTo(Card other) {
    int comparison = suit.compareTo(other.suit);
    if (comparison == 0){
      //if they have the same suit, we then
      //have to compare the ranks
      comparison = rank.compareTo(other.rank);
    }
    return comparison;
  }
}
