// Nathan Hsiao
// This is an interface class that checks if the piece is able to move in the same column and direction

public interface MoveStraight{
   
   // this checks if the method is in the same row with no piece blocking
   public static boolean checkRow(ChessPiece piece, int column, int row){
    
     // this checks if the method checks if it is in the same row
    if(piece.getRow() == row && piece.getColumn() != column){
    
      return true;
    }
    
    return false;
  }
   
   // method checks if there is  a piece in front of it
   public static boolean checkRowPiece(ChessPiece piece, int column, int row){
     // this loop if it checks horiziontally
     if ( piece.getRow() == row){
      
     // loop checks if checks left to right
     for ( int i = piece.getColumn() +1; i >= column; i++) {
       if (piece.getChessBoard().hasPiece(row,i)){
       return true;
       }
       else
         return false;
          
     }
     
     for(int i = piece.getColumn() -1 ; i <= column; i--){
       // loop checks if right to left
      if (piece.getChessBoard().hasPiece(row,i)){
       return true;
       }
      
      else
        return false;
         
     }
          
   }
     
       return false;
   }
 
   // this method checks the column
   public static boolean checkColumnPiece( ChessPiece piece, int column, int row){
     if ( piece.getColumn() == column){
     
     // loop checks if checks left to right
     for ( int i = piece.getRow() +1; i >= row; i++) {
       if (piece.getChessBoard().hasPiece(i,column)){
       return true;
       }
          else 
             return false;
     }
     
     for(int i = piece.getColumn() -1 ; i <= column; i--){
       // loop checks if right to left
      if (piece.getChessBoard().hasPiece(i, column)){
       return true;
       }
          else 
             return false;
     }
          
   }
     return false;
   }
   
   // this checks if the method is in the same column with no pieces blocking
  public static boolean checkColumn(ChessPiece piece, int column, int row){
   
    // this if statement checks to see if it is in the same column
    if (piece.getRow() != row && piece.getColumn() == column){
    
    return true;
    }
    
    return false;
  }
  
  public static boolean checkRowMove1(ChessPiece piece, int column, int row){
    
    // the method checks if it the pieces moves up by one with no pieces blocking
    if (piece.getRow() == row &&  piece.getColumn() == column +1){
    return true;
    }
    
    // the method checks if the pieces move horizonatlly by one with no pieces blocking
    if( piece.getRow() == row +1 && piece.getColumn() == column){
    return true;
    }
    
    else
      return false;
  }
  
  // checks the method for the movement of a knight with no pieces blocking
  public static boolean moveKnight(ChessPiece piece, int column, int row){
   
    // 
    if(piece.getRow() == row + 1 && piece.getColumn()== column + 2){
    return true;
    }
    
    if (piece.getRow() == row+2 && piece.getColumn()== column+1){
    return true;
    }
    
    else 
      return true;
  }
  
  }
