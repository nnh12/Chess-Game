/** This class represents the rook piece
 * Contains all the moves for the rook piece
 * Has methods to see if a move is legal or not legal
  * @author Nathan Hsiao
  */

public class RookPiece extends ChessPiece implements MoveStraight {
  
  // constructor to set everything together
  public RookPiece(String label, ChessGame.Side side, int row, int column){
    super(label, side,row, column);
  }
  
  // this method checks is a Rock is allowed to go straight or sideways
  @Override
  public boolean isLegalMove(int toRow, int toColumn){
    
    // this if statement checks if it is in the same row
    if (MoveStraight.checkRow(this, toRow, toColumn)){
      return true;
    }
    
    // this if statement checks if it is in the same column
    else if ( MoveStraight.checkColumn(this, toRow, toColumn)){
      return true;
    }
    
    else
      return false; 
  }
  
  // this method checks to see if a piece can caputre another piece
  @Override
  public boolean isLegalCaptureMove(int toRow, int toColumn){
    
    // check see if smae peice in same row 
    if (MoveStraight.checkRowPiece(this,toRow, toColumn)){
      return true;
    }
    
    // check see if same peice in same column
    if(MoveStraight.checkColumnPiece(this,toRow, toColumn)){
      return true;
    }
    
    else 
      return false;
  }
    
  // this method ends the game
  @Override
  public void getDone(){
  }
  
  // this method checks if there is no piece
  @Override
  public boolean isLegalNonCaptureMove(int toRow, int toColumn){
    // this if statement checks if it is in the same row
    if (MoveStraight.checkRow(this, toRow, toColumn) && MoveStraight.checkRow(this, toRow, toColumn)){
      return true;
    }
    
    
    
    // this if statement checks if it is in the same column
    if ( MoveStraight.checkColumn(this, toRow, toColumn)){
      return true;
    }
    
    else
      return false; 
  }
   
  // return the row 
  @Override
  public int getRow(){
  return getRow();
  }
  
  // return the column
  @Override 
  public int getColumn(){
  return getColumn();
  }
  
  //getChessBoard().HasPiece
  
}