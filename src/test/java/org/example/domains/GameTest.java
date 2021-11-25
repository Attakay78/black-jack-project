// package org.example.domains;

// import org.example.domains.enums.CardSuit;
// import org.example.domains.enums.CardValue;
// import org.junit.Before;
// import org.junit.Test;

// import java.util.ArrayList;
// import java.util.List;
// import java.util.stream.Collectors;

// import static org.junit.Assert.assertEquals;
// import static org.junit.Assert.assertTrue;

// public class GameTest {

//     private Player player1;
//     private Player player2;
//     private Player player3;
//     private Player player4;
//     private List<Card> cards;
//     private Game game;
//     private List<Player> players;

//     @Before
//     public void setUp() {
//         player1 = new Player("Richard");
//         player2 = new Player("Obed");
//         player3 = new Player("Test");
//         player4 = new Player("Test1");

//         cards = List.of(new Card(CardValue.FIVE, CardSuit.Club),
//                 new Card(CardValue.EIGHT, CardSuit.Diamond),
//                 new Card(CardValue.SIX,CardSuit.Heart));
//         player1.addCards(cards);

//         cards = List.of(new Card(CardValue.KING, CardSuit.Spade),
//                 new Card(CardValue.QUEEN, CardSuit.Heart),
//                 new Card(CardValue.TWO,CardSuit.Diamond));
//         player2.addCards(cards);

//         cards = List.of(new Card(CardValue.TEN, CardSuit.Heart),
//                 new Card(CardValue.JACK, CardSuit.Spade),
//                 new Card(CardValue.THREE,CardSuit.Diamond));
//         player3.addCards(cards);

//         String[] strings = {"dffsfd","dfdfd"};
//         game = new Game(strings);
//         players = new ArrayList<>(List.of(player1,player2,player3));

//         game.addPlayer(player1);
//         game.addPlayer(player2);
//         game.addPlayer(player3);
//     }

//     @Test
//     public void testGetPlayers() {
//             List<Player> actual = game.getPlayers();
//             assertEquals(players, actual);
//     }

//     @Test
//     public void testAddPlayer() {
//             game.addPlayer(player4);
//             assertTrue(game.getPlayers().contains(player4));
//     }

//     @Test
//     public void testGetWinner() {
//         Player actual = game.getWinner();
//         assertEquals(player1,actual);
//     }

//     @Test
//     public void testGetHighestScore() {
//         int actual = game.getHighestScore();
//         assertEquals(19,actual);
//     }

//     @Test
//     public void testDeckCreation() {
//         int actual = game.getDeck().size();
//         assertEquals(52,actual);
//     }

// }
