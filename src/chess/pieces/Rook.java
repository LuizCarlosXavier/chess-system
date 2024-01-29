package chess.pieces;

import boardgame.Board;
import chess.ChessPiece;
import chess.Color;

public class Rook extends ChessPiece {

    public Rook(Color color, Board board) {
        super(color, board);
    }
    
    @Override
    public String toString() {
        return "R";
    }

}
