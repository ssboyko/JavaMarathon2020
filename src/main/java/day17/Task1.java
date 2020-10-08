package day17;

import java.util.ArrayList;
import java.util.Arrays;

public class Task1 {
    public static void main(String[] args) {
        ArrayList<ChessPiece> chessPieces = new ArrayList<>();
        chessPieces.add(ChessPiece.PAWN_WHITE);
        chessPieces.add(ChessPiece.PAWN_WHITE);
        chessPieces.add(ChessPiece.PAWN_WHITE);
        chessPieces.add(ChessPiece.PAWN_WHITE);
        chessPieces.add(ChessPiece.ROOK_BLACK);
        chessPieces.add(ChessPiece.ROOK_BLACK);
        chessPieces.add(ChessPiece.ROOK_BLACK);
        chessPieces.add(ChessPiece.ROOK_BLACK);
        chessPieces.add(ChessPiece.ROOK_BLACK);
        System.out.println(chessPieces.toString());


    }
}
