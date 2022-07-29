package com.tlglearning.cards;

import com.tlglearning.cards.model.Card;
import com.tlglearning.cards.model.Deck;
import java.security.SecureRandom;
import java.util.Random;

public class TestMain {

  public static void main(String[] args) {
    Deck deck = new Deck();
    Random rng = new SecureRandom();
    //the reference type is the most general possible
    //that still gives you access to all the behavior you need
    System.out.println(deck);
    for(Card card: deck){

    }
    //when you pass an object to print, if its not already
    //a string, its toString method will be printed
  }

}
