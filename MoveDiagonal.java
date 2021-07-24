// Nathan Hsiao
// this class checks if a move is Diagoanl
public interface MoveDiagonal{
  
  
  // this method checks if the move is diagonal
  public static boolean checkDiagonal( ChessPiece piece, int column, int row){
    // this variable finds change in column
    int newColumn =  column - piece.getColumn();
    
    // this variable finds the change in row
    int newRow = row - piece.getRow();
    
    // this variable finds the slope and sees if it is a whole number
    double slope = (newColumn/ newRow);
    
    // this if statement checks if the slope is a whole number
    if ( slope % 1  ==  0){
      return true;
    }
    
    else
      return false;
  }
  
  
  public static boolean checkDiagonal1(ChessPiece piece, int column, int row){
    // this variable finds change in column
    int newColumn =  column - piece.getColumn();
    
    // this variable finds the change in row
    int newRow = row - piece.getRow();
    
    // this variable finds the slope and sees if it is a whole number
    double line = (newColumn/ newRow);
    
    // this if statement checks if the slope is a whole number
    if ( line % 1  ==  0 && (line >0 || line <0)){
      return true;
    }
    
    else
      return false;
  }
  
  public static boolean checkDiagonalPiece(ChessPiece piece, int column, int row){
    // this variable finds change in column
    int newColumn =  column - piece.getColumn();
    
    // this variable finds the change in row
    int newRow = row - piece.getRow();
    
    // this variable finds the slope and sees if it is a whole number
    double line = (newColumn/ newRow);
    
    // this if statement checks if the slope is a whole number to see if it is on the same diagonal
    //if ( line % 1  ==  0 && (line >0 || line <0 )){
      // loop checks if move northeast
      for ( int i = piece.getColumn() +1 , b = piece.getRow()+1;  i  <=  column && b <= row; i ++, b++){
        if (piece.getChessBoard().hasPiece(b, i)){
          return true;
        }
        
        else
          return false;
      }
      
      // loop checks is move southeast
      for ( int i = piece.getColumn() +1 , b = piece.getRow() -1 ; i <= column && b >= row; i ++, b--){
        if (piece.getChessBoard().hasPiece(b, i)){
          return true;
        }
        
        else
          return false;
      }
      
      // loop checks if move south west
      for ( int i = piece.getColumn() -1 , b = piece.getRow() -1 ; i >= column && b >= row; i --, b--){
        if (piece.getChessBoard().hasPiece(b, i)){
          return true;
        }
        else 
          return false;
      }
      
      // loop checks if move is northwest
      for ( int i = piece.getColumn() -1, b = piece.getRow()+1; i <=column && b>=row; i--, b++){
         if (piece.getChessBoard().hasPiece(b, i)){
          return true;
        }
        
        else
        return false;
      }
    
      return false;
  }
 
}


  

  
 