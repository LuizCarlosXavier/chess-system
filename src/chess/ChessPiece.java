package chess;

import boardgame.Board;
import boardgame.Piece;
import boardgame.Position;

public abstract class ChessPiece extends Piece {
    
    private Color color;
    
    public ChessPiece(Color color, Board board) {
        super(board);
        this.color = color;
    }

    public Color getColor() {
        return color;
    }

    protected boolean istThereOpponentPiece(Position position) {
        ChessPiece piece = (ChessPiece) getBoard().piece(position.getRow(), position.getColumn());
        return piece != null && color != piece.getColor();
    }

    public ChessPosition getChessPosition() {
        return ChessPosition.fromProsition(position);
    }

}
