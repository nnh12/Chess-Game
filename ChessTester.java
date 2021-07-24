// This is a class that tests my code
// Nathan Hsiao

import org.junit.*;
import static org.junit.Assert.*;
public class ChessTester{
  // a field to store the board
  ChessBoard board;
  // this method is testing isLegalNonCapture Move
  @Test
  public void testIsLegalNonCaptureMove(){

  RookPiece b = new RookPiece( "R" , board, ChessGame.Side.NORTH, 1, 1);
  BishopPiece a = new BishopPiece("B", board,ChessGame.Side.SOUTH, 4,5);
  QueenPiece q = new QueenPiece("Q", board, ChessGame.Side.NORTH, 6,6);
  KingPiece k = new KingPiece("K", board, ChessGame.Side.NORTH, 7,7);
  BishopPiece b2 = new BishopPiece("B1", board, ChessGame.Side.SOUTH, 8,8);
  PawnPiece p = new PawnPiece("P", board,ChessGame.Side.SOUTH, 5,5);
  assertTrue("fails to move to 1,2", b.isLegalNonCaptureMove(1,2));
  assertTrue("fails to move to point 4,5", a.isLegalNonCaptureMove(4,5));
  assertTrue("fails to move to point 6,6", q.isLegalNonCaptureMove(6,6));
  assertTrue("fails to move to point 7,7", k.isLegalNonCaptureMove(7,7));
  assertTrue("fails to move to point 8.8", b2.isLegalNonCaptureMove(8,8));
  assertTrue("fails to move to point 5,5", p.isLegalNonCaptureMove(5,5)); 
  }
  
  // this method is testing is legal move
  @Test
  public void testIsLegalMove(){
  RookPiece b = new RookPiece( "R" , board,ChessGame.Side.NORTH, 1, 1);
  BishopPiece a = new BishopPiece("B",board, ChessGame.Side.SOUTH, 4,5);
  QueenPiece q = new QueenPiece("Q",board, ChessGame.Side.NORTH, 6,6);
  KingPiece k = new KingPiece("K", board, ChessGame.Side.NORTH, 7,7);
  BishopPiece b2 = new BishopPiece("B1",board, ChessGame.Side.SOUTH, 8,8);
  PawnPiece p = new PawnPiece("P", board,ChessGame.Side.SOUTH, 5,5);
  assertEquals("fails to move to 1,2",false, b.isLegalNonCaptureMove(1,2));
  assertTrue("fails to move to point 4,5", a.isLegalMove(4,5));
  assertTrue("fails to move to point 6,6", q.isLegalMove(6,6));
  assertTrue("fails to move to point 7,7", k.isLegalMove(7,7));
  assertTrue("fails to move to point 8.8", b2.isLegalMove(8,8));
  assertTrue("fails to move to point 5,5", p.isLegalMove(5,5)); 
  }
  
  // this method is testing is Legal Caputre Move
  @Test
  public void testIsLegalCaptureMove(){
  RookPiece b = new RookPiece( "R" , board, ChessGame.Side.NORTH, 1, 1);
  BishopPiece a = new BishopPiece("B", board,ChessGame.Side.SOUTH, 4,5);
  QueenPiece q = new QueenPiece("Q", board,ChessGame.Side.NORTH, 6,6);
  KingPiece k = new KingPiece("K",board, ChessGame.Side.NORTH, 7,7);
  BishopPiece b2 = new BishopPiece("B1", board, ChessGame.Side.SOUTH, 8,8);
  PawnPiece p = new PawnPiece("P", board, ChessGame.Side.SOUTH, 5,5);
  assertEquals("fails to move to 1,2",false, b.isLegalCaptureMove(1,2));
  assertTrue("fails to move to point 4,5", a.isLegalCaptureMove(4,5));
  assertTrue("fails to move to point 6,6", q.isLegalCaptureMove(6,6));
  assertTrue("fails to move to point 7,7", k.isLegalCaptureMove(7,7));
  assertTrue("fails to move to point 8.8", b2.isLegalCaptureMove(8,8));
  assertTrue("fails to move to point 5,5", p.isLegalCaptureMove(5,5)); 
  }
  
  //this method is testing getRow()
  @Test
  public void testGetRow(){
  RookPiece b = new RookPiece( "R" , board, ChessGame.Side.NORTH, 1, 1);
  BishopPiece a = new BishopPiece("B", board, ChessGame.Side.SOUTH, 4,5);
  QueenPiece q = new QueenPiece("Q", board,ChessGame.Side.NORTH, 6,6);
  KingPiece k = new KingPiece("K", board,ChessGame.Side.NORTH, 7,7);
  BishopPiece b2 = new BishopPiece("B1", board,ChessGame.Side.SOUTH, 8,8);
  PawnPiece p = new PawnPiece("P", board,ChessGame.Side.SOUTH, 5,5);
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
  RookPiece b = new RookPiece( "R" , board,ChessGame.Side.NORTH, 1, 1);
  BishopPiece a = new BishopPiece("B", board, ChessGame.Side.SOUTH, 4,5);
  QueenPiece q = new QueenPiece("Q", board,ChessGame.Side.NORTH, 6,6);
  KingPiece k = new KingPiece("K", board,ChessGame.Side.NORTH, 7,7);
  BishopPiece b2 = new BishopPiece("B1", board,ChessGame.Side.SOUTH, 8,8);
  PawnPiece p = new PawnPiece("P", board,ChessGame.Side.SOUTH, 5,5);
  assertEquals("fails to move to 1,2",1, b.getRow());
  assertEquals("fails to move to point 4,5",5,a.getRow());
  assertEquals("fails to move to point 6,6",6, q.getRow());
  assertEquals("fails to move to point 7,7",7, k.getRow());
  assertEquals("fails to move to point 8.8",8, b2.getRow());
  assertEquals("fails to move to point 5,5",5, p.getRow()); 
  }
  
  
 
  
  }


  