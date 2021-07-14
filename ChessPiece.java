
/** This is an abstract class that allows other pieces to extend
 * Contains all the  fields (which side the piece is on) and methods required for each Chess piece, such as getting the side, row, column, and label
  * @author Nathan Hsiao
  */


public abstract class ChessPiece{

  // this fields stores thenumber of sides
  private ChessGame.Side NORTH;
  
  // this field stores which side it is on
  private ChessGame.Side SOUTH;
  
  // this field stores side
  private ChessGame.Side side;
  
  // this field stores the String Label
  private String label;
  
  // this field stores the icon
  private Object icon;
  
  // the field stores the number of rows
  private int row;
  
  // this field stores the column
  private int column;
    
  // this field stores which team it is on
  private ChessBoard team;
  
  // this constructor assigns all the fields together
  public ChessPiece(String label, ChessGame.Side side, int row, int column){
    this.label = label;
    this.side = side;
    this.icon = icon;
    this.team = team;
    setLocation(row, column);
  }
  
  // this method sets the side it is on
  public void setSide(ChessGame.Side side){
  this.side = side;
  }
  
  // this method returns the side it is on
  public ChessGame.Side getSide(){
  return side;
  }
  
  // theis method gets the label
  public String getLabel(){
    return label;
  }
  
  // this method sets the label
  public void setLabel(){
    this.label = label;
  }
  
  // this method gets the row
  public int getRow(){
    return row;
  }
  
  // this method gets the column 
  public int getColumn(){
    return column;
  }
  
  // this method sets the row
  public void setRow( int row){
    this.row = row;
  }
  
  // this method sets the column
  public void setColumn(int column){
    this.column = column;
  }
  
  // this methiod sets the location
  public void setLocation(int row, int column){
    this.row = row;
    this.column = column;
  }
  
  // this method checks if the move is lega;
  public abstract boolean isLegalMove(int toRow, int toColumn);
  
  // this method get the icon
  public Object getIcon(){
    return null;
  }
  
  // this method gets the chessboard to see where the piece is on
  public ChessBoard getChessBoard(){
  return team;
  }
  
  // this method checks if a capture move is legal
  public abstract boolean isLegalCaptureMove(int row, int column);
  
  // this methods checks if a non capture move is nonlegal
  public abstract boolean isLegalNonCaptureMove(int toRow, int toColumn);
  
  // method to finish move
  public void getDone(){
  }

}