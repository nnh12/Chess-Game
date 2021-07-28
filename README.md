# Chess-Game

## Description
This is a chess game that I programmed. It was part of an assignment for my Introduction to Programming in Java course with Professor Harold Connamacher. There are still some issues with it (some of the pieces can't move), so this project still is a work in progress. I implemented the Java Swing library for graphics and designed the chess hireachy for an efficient way to move/ check the pieces. 

## LanuchGame.java
In order to play this game, download all the files. Run the LaunchGame. java fill. This file starts the game and a chess board should pop up. It instantiates an object of a chessboard and adds all the pieces to the board.

## Pieces
All the pieces (PawnPiece.java, BishopPiece.java, KnightPiece.java, RookPiece.java, QueenPiece.java, and KingPiece.java) extend the ChessPiece class which indictates all the traits of what each chess piece should have.

## Interfaces
MoveDiagonal.java and MoveStraight.java are interfaces. The chess pieces implement these interfaces to make allow which pieces can go where based on there function. 






