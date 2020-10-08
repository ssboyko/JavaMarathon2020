package day17;


import java.lang.reflect.Array;


public class ChessBoard {
    ChessBoard(ChessPiece[][] chessPieces) {
    }

    public void print(ChessPiece[][] chessPieces) {
        for (int i = 0; i < chessPieces.length; i++) {
            for (int j = 0; j < chessPieces[i].length; j++) {
                System.out.print(chessPieces[i][j]);
            }
            System.out.println();
        }
    }
}
