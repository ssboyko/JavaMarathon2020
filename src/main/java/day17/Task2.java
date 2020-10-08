package day17;

import static day17.ChessPiece.*;

public class Task2 {
    public static void main(String[] args) {
        ChessPiece[][] chessPieces = new ChessPiece[8][8];
        chessPieces[0][0] = ROOK_BLACK;
        chessPieces[0][1] = EMPTY;
        chessPieces[0][2] = EMPTY;
        chessPieces[0][3] = EMPTY;
        chessPieces[0][4] = EMPTY;
        chessPieces[0][5] = ROOK_BLACK;
        chessPieces[0][6] = KING_BLACK;
        chessPieces[0][7] = EMPTY;

        chessPieces[1][0] = EMPTY;
        chessPieces[1][1] = ROOK_WHITE;
        chessPieces[1][2] = EMPTY;
        chessPieces[1][3] = EMPTY;
        chessPieces[1][4] = PAWN_BLACK;
        chessPieces[1][5] = PAWN_BLACK;
        chessPieces[1][6] = EMPTY;
        chessPieces[1][7] = PAWN_BLACK;


        chessPieces[2][0] = PAWN_BLACK;
        chessPieces[2][1] = EMPTY;
        chessPieces[2][2] = KNIGHT_BLACK;
        chessPieces[2][3] = EMPTY;
        chessPieces[2][4] = EMPTY;
        chessPieces[2][5] = EMPTY;
        chessPieces[2][6] = PAWN_BLACK;
        chessPieces[2][7] = EMPTY;

        chessPieces[3][0] = QUEEN_WHITE;
        chessPieces[3][1] = EMPTY;
        chessPieces[3][2] = EMPTY;
        chessPieces[3][3] = BISHOP_WHITE;
        chessPieces[3][4] = EMPTY;
        chessPieces[3][5] = EMPTY;
        chessPieces[3][6] = EMPTY;
        chessPieces[3][7] = EMPTY;

        chessPieces[4][0] = EMPTY;
        chessPieces[4][1] = EMPTY;
        chessPieces[4][2] = EMPTY;
        chessPieces[4][3] = BISHOP_BLACK;
        chessPieces[4][4] = PAWN_WHITE;
        chessPieces[4][5] = EMPTY;
        chessPieces[4][6] = EMPTY;
        chessPieces[4][7] = EMPTY;

        chessPieces[5][0] = EMPTY;
        chessPieces[5][1] = EMPTY;
        chessPieces[5][2] = EMPTY;
        chessPieces[5][3] = EMPTY;
        chessPieces[5][4] = BISHOP_WHITE;
        chessPieces[5][5] = PAWN_WHITE;
        chessPieces[5][6] = EMPTY;
        chessPieces[5][7] = EMPTY;

        chessPieces[6][0] = PAWN_WHITE;
        chessPieces[6][1] = EMPTY;
        chessPieces[6][2] = EMPTY;
        chessPieces[6][3] = QUEEN_WHITE;
        chessPieces[6][4] = EMPTY;
        chessPieces[6][5] = PAWN_WHITE;
        chessPieces[6][6] = EMPTY;
        chessPieces[6][7] = PAWN_WHITE;

        chessPieces[7][0] = EMPTY;
        chessPieces[7][1] = EMPTY;
        chessPieces[7][2] = EMPTY;
        chessPieces[7][3] = EMPTY;
        chessPieces[7][4] = EMPTY;
        chessPieces[7][5] = ROOK_WHITE;
        chessPieces[7][6] = KING_WHITE;
        chessPieces[7][7] = EMPTY;


        ChessBoard chessBoard = new ChessBoard(chessPieces);
        chessBoard.print(chessPieces);
    }
}
