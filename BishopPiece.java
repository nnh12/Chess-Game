// Nathan Hsiao
// this class represetns the Bishop Piece

public class BishopPiece extends ChessPiece implements MoveDiagonal{
  
  // a contructor to set the values in BishopPiece
  public BishopPiece(String label, ChessBoard board, ChessGame.Side side, int row, int column){
    super(label, board, side,row,column);
  }
  
  // the method checks if the piece moves diagonally
  @Override
  public boolean isLegalMove(int toRow, int toColumn){
    
    // this if statement checks if the piece moves diagonally
    if(MoveDiagonal.checkDiagonal(this, toRow, toColumn)){
      
      return true;
    }
    
    else 
      
      return false;
    
  }
  
  // method to check the nonlegal move
  public boolean isLegalNonCaptureMove(int toRow, int toColumn){
    // this if statement checks if the piece moves diagonally
    if(MoveDiagonal.checkDiagonal(this, toRow, toColumn)){
      
      return true;
    }
    
    else 
      
      return false;
  }
  
  // a method to check if there is a piece there
  public boolean isLegalCaptureMove( int toRow, int toColumn){
    // this if statement checks if the pieces moves diagonally 
    if(MoveDiagonal.checkDiagonalPiece(this, toRow, toColumn)){
      return true;
    }
    
    else
      return false;
  }
  
  // a method to finsih the move
  @Override
  public void getDone(){
  }
  
  // a method to get the row
  @Override
  public int getRow(){
    return getRow();
  }
  
  // a method to get the column
  @Override
  public int getColumn(){
    return getColumn();
  }
  
  //a method to get the chessboard
  //@Override
  // public ChessBoard getChessBoard(){
  //}
}