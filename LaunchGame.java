// Nathan Hsiao
// main method to launch the game

public class LaunchGame{
  public static void main (String[] args){
     
   ChessBoard board = new ChessBoard(8, 8, new EuropeanChessDisplay(), new EuropeanChess());
    board.addPiece(new BishopPiece("Bishop", board, ChessGame.Side.SOUTH, 0,2), 0, 2);
    board.addPiece(new BishopPiece("Bishop", board, ChessGame.Side.SOUTH, 0,5), 0, 5);
    board.addPiece(new BishopPiece("Bishop", board, ChessGame.Side.NORTH, 7,2), 7, 2);
    board.addPiece(new BishopPiece("Bishop", board, ChessGame.Side.NORTH, 7,5), 7, 5);
    board.addPiece(new RookPiece("Rook", board, ChessGame.Side.SOUTH, 0,0), 0,0);
    board.addPiece(new RookPiece("Rook", board, ChessGame.Side.SOUTH, 0,7), 0, 7);
    board.addPiece(new RookPiece("Rook", board, ChessGame.Side.NORTH, 7,0), 7, 0);
    board.addPiece(new RookPiece("Rook", board, ChessGame.Side.NORTH, 7,7), 7, 7);
    
    board.addPiece(new KnightPiece("Knight", board, ChessGame.Side.SOUTH, 0,1), 0,1);
    board.addPiece(new KnightPiece("Knight", board, ChessGame.Side.SOUTH, 0,6), 0, 6);
    board.addPiece(new KnightPiece("Knight", board, ChessGame.Side.NORTH, 7,1), 7, 1);
    board.addPiece(new KnightPiece("Knight", board, ChessGame.Side.NORTH, 7,6), 7, 6);
    
    board.addPiece(new KingPiece("King", board, ChessGame.Side.SOUTH, 0,3), 0, 3);
    board.addPiece(new KingPiece("King", board, ChessGame.Side.NORTH, 7,3), 7, 3);
    board.addPiece(new QueenPiece("Queen", board, ChessGame.Side.SOUTH, 0,4), 0, 4);
    board.addPiece(new QueenPiece("Queen", board, ChessGame.Side.NORTH, 7,4), 7, 4);
   
    board.addPiece(new PawnPiece("Pawn", board, ChessGame.Side.SOUTH, 1,0), 1, 0);
    board.addPiece(new PawnPiece("Pawn", board, ChessGame.Side.SOUTH, 1,1), 1, 1);
    board.addPiece(new PawnPiece("Pawn", board, ChessGame.Side.SOUTH, 1,2), 1, 2);
    board.addPiece(new PawnPiece("Pawn", board, ChessGame.Side.SOUTH, 1,3), 1, 3);
    board.addPiece(new PawnPiece("Pawn", board, ChessGame.Side.SOUTH, 1,4), 1, 4);
    board.addPiece(new PawnPiece("Pawn", board, ChessGame.Side.SOUTH, 1,5), 1, 5);
    board.addPiece(new PawnPiece("Pawn", board, ChessGame.Side.SOUTH, 1,6), 1, 6);
    board.addPiece(new PawnPiece("Pawn", board, ChessGame.Side.SOUTH, 1,7), 1, 7);
    
     board.addPiece(new PawnPiece("Pawn", board, ChessGame.Side.NORTH, 6,0), 6, 0);
    board.addPiece(new PawnPiece("Pawn", board, ChessGame.Side.NORTH, 6,1), 6, 1);
    board.addPiece(new PawnPiece("Pawn", board, ChessGame.Side.NORTH, 6,2), 6, 2);
    board.addPiece(new PawnPiece("Pawn", board, ChessGame.Side.NORTH, 6,3), 6, 3);
    board.addPiece(new PawnPiece("Pawn", board, ChessGame.Side.NORTH, 6,4), 6, 4);
    board.addPiece(new PawnPiece("Pawn", board, ChessGame.Side.NORTH, 6,5), 6, 5);
    board.addPiece(new PawnPiece("Pawn", board, ChessGame.Side.NORTH, 6,6), 6, 6);
    board.addPiece(new PawnPiece("Pawn", board, ChessGame.Side.NORTH, 6,7), 6, 7);
    
  }
}