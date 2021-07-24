// Nathan Hsiao
//  This class controls the movement for the Queen 

public class QueenPiece extends ChessPiece implements MoveStraight{
  
  // a constructor to set the values in constructor
  public QueenPiece(String label, ChessBoard board, ChessGame.Side side, int row, int column){
    super(label,board, side, row,column );
  }
  
  // this method checks is a queen is allowed to go straight or sideways
  @Override
  public boolean isLegalMove(int toRow, int toColumn){
    
    // if statement check row
    if (MoveStraight.checkRow(this, toRow, toColumn) ){
      return true;
    }
    
    // if statement check column
    else if (MoveStraight.checkColumn(this, toRow, toColumn)){
      return true;
    }
    
    // if statement check diagonal
    else if (MoveDiagonal.checkDiagonal(this, toRow, toColumn)){
      return true;
    }
    
    return false;
  }
  
  // method checks if the move is legal
  @Override
  public boolean isLegalCaptureMove(int row, int column){
    // if statement check if piece same row
    if ( MoveStraight.checkRowPiece(this, row, column)){
      return true;
    }
    
    // if stateme check peice in column
    if(MoveStraight.checkColumnPiece(this,row, column)){
      return true;
    }
    
    else
      return false;
  }
  
  // method check non capture move
  @Override
  public boolean isLegalNonCaptureMove(int row, int column){
    
    // if statement check row 
    if (MoveStraight.checkRow(this, row, column) ){
      return true;
    }
    
    // if statement check column
    else if (MoveStraight.checkColumn(this, row, column)){
      return true;
    }
    
    // if statement diagonal
    else if (MoveDiagonal.checkDiagonal(this, row, column)){
      return true;
    }
    
    return false;
  }
  
  // method to get row
  @Override
  public int getRow(){
    return getRow();
  }
  
  @Override 
  // method to get column
  public int getColumn(){
  return getColumn();
  }
  
  //@Override
  //method to get ChessBoard
  //public ChessBoard getChessBoard(){
  //return team;
  
   // method to finsih move
  @Override
  public void getDone(){
  }
  
  
}
  
 
  