/** This classimplements all the methods in Chess Game
 * Has methods to see if a move is geal and you are able to make a move
  * @author Nathan Hsiao
  */

public class EuropeanChess implements ChessGame{
  // a field to store which side it is on (North)
  private ChessGame.Side Player1 = ChessGame.Side.NORTH;
  
// a field to store which side it is on(South)
  private ChessGame.Side Player2 = ChessGame.Side.SOUTH;
  
  int switchSides;
  // a method to move the chess
  @Override
  public boolean legalPieceToPlay(ChessPiece piece, int toRow, int toColumn){
    
    // sees if the odd, if one player1
    if ( switchSides %2 == 0 && piece.getSide() == Player1){
      return true;
    }
    
    // see if even, if even player 2
    if(switchSides % 2 != 0 && piece.getSide() == Player2){
      return true;
    }
    
    //increments it by one everytime method is accessed
    switchSides++;
    return false;
  }
  
  
  // this method takes the turn for the pieces 
  @Override
  public boolean makeMove(ChessPiece piece, int row, int column){
    
    // if statement checks if it is nonlegal capture move
    if(piece.isLegalNonCaptureMove(row, column)){
      piece.setLocation(row,column);
      return true;
    }
       
    // if statmenet checks if it is legal capture move
    if(piece.isLegalMove(row, column)){
      piece.getChessBoard().removePiece(piece.getRow(),piece.getColumn());
      piece.setLocation(row,column);
      return true;
    }
    
    else
      return false; 
  }  
}