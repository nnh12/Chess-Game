// Nathan Hsiao
// this is a class that controls the PawnPiece 

public class PawnPiece extends ChessPiece implements  MoveStraight, MoveDiagonal{
  
  // a construcotr to set all the fields
  public PawnPiece(String label, ChessBoard board, ChessGame.Side side,int row, int column){
    super(label, board, side,row, column);
  }
  
  //private ChessGame.side;
  @Override
  public  boolean isLegalMove(int toRow, int toColumn){
    // this loops tracks if it is on the first move
    // returns true if it can move up by one space, or two (if first move)
    int i = 0;
    // this while loop only allows pawn move up one
    while (i >=1){
      if ( toRow == getRow() + 2){
        return true;
      }
      i++;
    }
    
    // adds one step to column
    if ( toRow == getRow()+1){
      return true;
    }
    else
      return false;  
  }
  
  // a method to check if the move is not a capture move 
  @Override
  public boolean isLegalNonCaptureMove(int row, int column){
    // this if statement checks if it is in the same row
    if (MoveStraight.checkRow(this, row, column) ){
      return true;
    }
    
    // this if statement checks if it is in the same column
    else if ( MoveStraight.checkColumn(this, row, column)){
      return true;
    }
    
    else
      return false; 
  }
  
  
  // checks to see if a legal capture move is true
  @Override 
  public boolean isLegalCaptureMove(int row, int column){
    // if statemnet checks diagonal
    if(MoveDiagonal.checkDiagonalPiece(this,row,column) && MoveDiagonal.checkDiagonal1(this,row,column)){
    return true;
    }
       else
         return false;
  }
  
  // method return the row
  @Override
  public int getRow(){
  return getRow();
  }
  
  // a method to return the column
  @Override
  public int getColumn(){
  return getColumn();
  }
  
  //a method to finsih the move
  @Override
  public void getDone(){
  }
  // a method to get the chessboard
  //@Override
  // public CHessBoard getCHessBoard(){
  //}
}