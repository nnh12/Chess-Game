/** This class represents that allows the user to launch the game
 * It instianties an instance of each of the chess piece and the chess board display
  * @author Nathan Hsiao
  */


public class LaunchGame{
  public static void maint(String[] args){
  RookPiece b = new RookPiece( "R" , ChessGame.Side.NORTH, 1, 1);
  BishopPiece a = new BishopPiece("B", ChessGame.Side.SOUTH, 2,2);
  QueenPiece q = new QueenPiece("Q", ChessGame.Side.NORTH, 6,6);
  KingPiece k = new KingPiece("K", ChessGame.Side.NORTH, 7,7);
  BishopPiece b2 = new BishopPiece("B1", ChessGame.Side.SOUTH, 8,8);
  PawnPiece p = new PawnPiece("P", ChessGame.Side.SOUTH, 5,5);
  EuropeanChess e = new EuropeanChess();
  EuropeanChessDisplay t = new EuropeanChessDisplay();
   
  
  }
}