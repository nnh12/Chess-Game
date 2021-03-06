// Nathan Hsiao
// class to check the king

public class KingPiece extends ChessPiece implements MoveDiagonal, MoveStraight {
 
  // a constructor that sets the values of the field
  public KingPiece(String label, ChessBoard board, ChessGame.Side side, int row, int column){
  super(label, board, side,row, column);
  }
  
  // method to check if the move is legal
  @Override
  public  boolean isLegalMove(int toRow, int toColumn){
    
    // if statement to chek row
    if(MoveStraight.checkRowMove1(this, toRow, toColumn)){
    return true;
    }
    
    // if statemtnto check diagonal one
    else if
    (MoveDiagonal.checkDiagonal1(this, toRow, toColumn)){
    return true;
    }
    
    else
      return false;
  }
  
  // method to check capture move
  @Override
  public boolean isLegalCaptureMove(int toRow, int toColumn){
    
    // if statement to check row
    if (MoveStraight.checkRowPiece(this, toRow, toColumn)){
    return true;
    }
    
    // if statemt to check column
    if (MoveStraight.checkColumnPiece(this, toRow, toColumn)){
    return true;
    }
    
    // if statement to check diagonal
    if (MoveDiagonal.checkDiagonalPiece(this,toRow, toColumn)){
    return true;
    }
        
    else
      return false;
  }
  
  // method to check if a non caputre move, basically moving to a white space
  @Override
  public boolean isLegalNonCaptureMove(int toRow, int toColumn){
   // statement check is there is no piece
    if(MoveStraight.checkRowMove1(this, toRow, toColumn)){
    return true;
    }
    
    // statemetnt check is there is a piece diagonoall.;y
    else if
    (MoveDiagonal.checkDiagonal1(this, toRow, toColumn)){
    return true;
    }
    
    else
      return false;
  }
  
  // method to return the row
  @Override
  public int getRow(){
  return getRow();
  }
  
  // a method to return the column
  @Override
  public int getColumn(){
  return getColumn();
  }
  
  // method to get the chessBoard
  //@Override
  //public ChessBoard getChessBoard(){
  // return chessBoard()}
  //}
  
}
  