// package org.example.domains;

// import org.example.domains.enums.CardSuit;
// import org.example.domains.enums.CardValue;
// import org.junit.Before;
// import org.junit.Test;

// import java.util.List;

// import static org.junit.Assert.assertEquals;

// public class PlayerTest {

//     private Player player;
//     private List<Card> cards;

//     @Before
//     public void setUp() {
//         player = new Player("Richard");
//         cards = List.of(new Card(CardValue.FIVE, CardSuit.Club),
//                         new Card(CardValue.EIGHT, CardSuit.Diamond),
//                          new Card(CardValue.ACE,CardSuit.Spade));
//         player.addCards(cards);
//     }

//     @Test
//     public void testGetName() {
//         String actual = player.getName();
//         assertEquals("Richard",actual);
//     }
//     @Test
//     public void testSetName() {
//         player.setName("Obed");
//         String actual = player.getName();
//         assertEquals("Obed",actual);
//     }

//     @Test
//     public void testgetCards() {
//         List<Card> actual = player.getCards();
//         assertEquals(cards, actual);
//     }

//     @Test
//     public void testgetScore() {
//         int actual = player.getScore();
//         assertEquals(24, actual);
//     }
// }
