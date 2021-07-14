/** This class represents the Knight piece
 * Contains all the moves for the Knight piece
 * Has methods to see if a move is legal or not legal
  * @author Nathan Hsiao
  */

public class KnightPiece extends ChessPiece implements MoveStraight{
  
  // a construoctr to set all the field
  public KnightPiece( String label, ChessGame.Side side, int row, int column){
    super(label, side, row, column);
  }
  
  // a methiod to check if a method is legal
  @Override                 
  public  boolean isLegalMove(int toRow, int toColumn){
    // if statement to checkif the knight moves or not
    if( MoveStraight.moveKnight(this, toRow, toColumn)){
      return true;
    }
    
    else
      return false;
  }
  
  // a method to check if non legal capture move is legal
  @Override
  public boolean isLegalNonCaptureMove(int row, int column){
    // if statement to check if thte knihgt moves or not
    if( MoveStraight.moveKnight(this, row, column)){
      return true;
    }
    
    else
      return false;
  }
  
  // a method to check if a legal caputure move is legal
  @Override 
  public boolean isLegalCaptureMove(int row, int column){
   // if statement to check if the knight moves or not
    if(MoveStraight.moveKnight(this,row, column)){
    return true;
    }
    
    else
      return false;
  }
  
  // a method to get row
  @Override
  public int getRow(){
  return getRow();
  }
  
  // a method to get column
  @Override
  public int getColumn(){
  return getColumn();
  }
  
  // a method to finsih the move
  @Override 
  public void getDone(){
  }
}