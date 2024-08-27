package ht.dataStructures;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

//Card shuffling and dealing with Collections method shuffle.

// class to represent a Card in a deck of cards
class Card{
	public static enum Face { Ace, Deuce, Three, Four, Five, Six, Seven, Eight, Nine, Ten, Jack, Queen, King };
	public static enum Suit { Clubs, Diamonds, Hearts, Spades }; 
	
	private final Face face; // face of card
	private final Suit suit; // suit of card
	
	// two argument constructor
	public Card(Face cardFace, Suit cardSuit) {
		face = cardFace; // initialize face of card
		suit = cardSuit; // initialize suit of card
	}
	
	// return face of the card
	public Face getFace() {
		return face;
	}
	
	// return suit of Card
	public Suit getSuit() {
		return suit;
	}
	
	// return String representation of Card
	public String toString() {
		return String.format("%s of %s", face, suit);
	}
}

// calss deckOfCard declaration
public class DeckOfCards {

	private List<Card> list; // declare list that will store Cards
	
	// set up deck of cards and shuffle
	public DeckOfCards() {
		// TODO Auto-generated constructor stub
		Card[] deck = new Card[52];
		int count = 0; // number of cards
		
		// populate deck with Card ojects
		for(Card.Suit suit : Card.Suit.values()) {
			for(Card.Face face : Card.Face.values()) {
				deck[count]  = new Card(face, suit);
				count++;
			}
		}
		
		list = Arrays.asList(deck); // get list
		Collections.shuffle(list); // shuffle deck
	}
	
	// output deck
	public void printCards(){
		// display 52 cards in two columns
		for(int i = 0; i < list.size(); i++)
			System.out.printf("%-19s%s", list.get(i), ((i + 1) % 4 == 0) ? "\n" : "");
	}

	public static void main(String[] args) {
		DeckOfCards cards = new DeckOfCards();
		cards.printCards();
	}
}
