// This is a class that tests my code
// Nathan Hsiao
import org.junit.*;
import static org.junit.Assert.*;
public class ChessTester{
// this method is testing isLegalNonCapture Move
@Test
public void testIsLegalNonCaptureMove(){
// i am making instance of rook piece
RookPiece b = new RookPiece( "R" , ChessGame.Side.NORTH, 1, 1);
// I am making instance of Bishop
BishopPiece a = new BishopPiece("B", ChessGame.Side.SOUTH, 4,5);
// i amking instance of Queen piece
QueenPiece q = new QueenPiece("Q", ChessGame.Side.NORTH, 6,6);
// I am making instance of king piece
KingPiece k = new KingPiece("K", ChessGame.Side.NORTH, 7,7);
// i am making instance of BIshop Piece
BishopPiece b2 = new BishopPiece("B1", ChessGame.Side.SOUTH, 8,8);
// I am making instance of Pawn
PawnPiece p = new PawnPiece("P", ChessGame.Side.SOUTH, 5,5);
// testing legal noncaputere, should be false
assertTrue("fails to move to 1,2", b.isLegalNonCaptureMove(1,2));
// testing legalnon caputer move, shoule be false
assertTrue("fails to move to point 4,5", a.isLegalNonCaptureMove(4,5));
// testing legal non caputer emove, should be false
assertTrue("fails to move to point 6,6", q.isLegalNonCaptureMove(6,6));
// testing legal noncaputer test for king , should be false
assertTrue("fails to move to point 7,7", k.isLegalNonCaptureMove(7,7));
// testing legal non capture move , should be false
assertTrue("fails to move to point 8.8", b2.isLegalNonCaptureMove(8,8));
//testing legal non capture move, should be false
assertTrue("fails to move to point 5,5", p.isLegalNonCaptureMove(5,5));
}
// this method is testing is legal move
@Test
public void testIsLegalMove(){
Creating instance of took
RookPiece b = new RookPiece( "R" , ChessGame.Side.NORTH, 1, 1);
// creating instance of bishopBishopPiece a = new BishopPiece("B", ChessGame.Side.SOUTH, 4,5);
// creating instance of QUeen
QueenPiece q = new QueenPiece("Q", ChessGame.Side.NORTH, 6,6);
//creating instance of king piece
KingPiece k = new KingPiece("K", ChessGame.Side.NORTH, 7,7);
// creaitng instance of Bishop
BishopPiece b2 = new BishopPiece("B1", ChessGame.Side.SOUTH, 8,8);
// creating instance of pawn
PawnPiece p = new PawnPiece("P", ChessGame.Side.SOUTH, 5,5);
// test should be false
assertEquals("fails to move to 1,2",false, b.isLegalNonCaptureMove(1,2));
//testing should be false
assertTrue("fails to move to point 4,5", a.isLegalMove(4,5));
//testing should be false
assertTrue("fails to move to point 6,6", q.isLegalMove(6,6));
//testing should be false
assertTrue("fails to move to point 7,7", k.isLegalMove(7,7));
//testing should be false
assertTrue("fails to move to point 8.8", b2.isLegalMove(8,8));
//testing should be false
assertTrue("fails to move to point 5,5", p.isLegalMove(5,5));
}
// this method is testing is Legal Caputre Move
@Test
public void testIsLegalCaptureMove(){
//cereating instance of rook
RookPiece b = new RookPiece( "R" , ChessGame.Side.NORTH, 1, 1);
///creaitn instance of bishop
BishopPiece a = new BishopPiece("B", ChessGame.Side.SOUTH, 4,5);
//creating instance of Queen
QueenPiece q = new QueenPiece("Q", ChessGame.Side.NORTH, 6,6);
//creating instance of King piece
KingPiece k = new KingPiece("K", ChessGame.Side.NORTH, 7,7);//creating instance of bishop
BishopPiece b2 = new BishopPiece("B1", ChessGame.Side.SOUTH, 8,8);
// creating instance of Pawn
PawnPiece p = new PawnPiece("P", ChessGame.Side.SOUTH, 5,5);
//should be false
assertEquals("fails to move to 1,2",false, b.isLegalCaptureMove(1,2));
//Should be false
assertTrue("fails to move to point 4,5", a.isLegalCaptureMove(4,5));
//Should be false
assertTrue("fails to move to point 6,6", q.isLegalCaptureMove(6,6));
//Shouldbe false
assertTrue("fails to move to point 7,7", k.isLegalCaptureMove(7,7));
//should be false
assertTrue("fails to move to point 8.8", b2.isLegalCaptureMove(8,8));
//should be false
assertTrue("fails to move to point 5,5", p.isLegalCaptureMove(5,5));
}
//this method is testing getRow()
@Test
public void testGetRow(){
RookPiece b = new RookPiece( "R" , ChessGame.Side.NORTH, 1, 1);
BishopPiece a = new BishopPiece("B", ChessGame.Side.SOUTH, 4,5);
QueenPiece q = new QueenPiece("Q", ChessGame.Side.NORTH, 6,6);
KingPiece k = new KingPiece("K", ChessGame.Side.NORTH, 7,7);
BishopPiece b2 = new BishopPiece("B1", ChessGame.Side.SOUTH, 8,8);
PawnPiece p = new PawnPiece("P", ChessGame.Side.SOUTH, 5,5);
assertEquals("fails to move to 1,2",1, b.getRow());
assertEquals("fails to move to point 4,5",4,a.getRow());
assertEquals("fails to move to point 6,6",6, q.getRow());
assertEquals("fails to move to point 7,7",7, k.getRow());
assertEquals("fails to move to point 8.8",8, b2.getRow());
assertEquals("fails to move to point 5,5",5, p.getRow());
}
// this method is testing getColumn()
@Test
public void testGetColumn(){
//creaitng instances for all piece, rook, bishop, king, Pawn
RookPiece b = new RookPiece( "R" , ChessGame.Side.NORTH, 1, 1);
BishopPiece a = new BishopPiece("B", ChessGame.Side.SOUTH, 4,5);QueenPiece q = new QueenPiece("Q", ChessGame.Side.NORTH, 6,6);
KingPiece k = new KingPiece("K", ChessGame.Side.NORTH, 7,7);
BishopPiece b2 = new BishopPiece("B1", ChessGame.Side.SOUTH, 8,8);
PawnPiece p = new PawnPiece("P", ChessGame.Side.SOUTH, 5,5);
//should eb false
assertEquals("fails to move to 1,2",1, b.getColumn());
//should be false
assertEquals("fails to move to point 4,5",5,a.getColumn());
//should be false
assertEquals("fails to move to point 6,6",6, q.getColumn());
//should be false
assertEquals("fails to move to point 7,7",7, k.getColumn());
//should be false
assertEquals("fails to move to point 8.8",8, b2getColumn());
//should be false
assertEquals("fails to move to point 5,5",5, p.getColumn());
}
}