package chess.pieces;

import boardgame.Board;
import boardgame.Position;
import chess.ChessPiece;
import chess.Color;

public class Knight extends ChessPiece {

    public Knight(Board board, Color color) {
        super(color, board);
    }
    
    @Override
    public String toString() {
        return "H";
    }

    private boolean canMove(Position position) {
        return istThereOpponentPiece(position);
    }

    @Override
    public boolean[][] possibleMoves() {
        boolean[][] mat = new boolean[getBoard().getRows()][getBoard().getColumn()];
        
        Position p = new Position(0, 0);

        p.setValues(position.getRow() - 1, position.getColumn() - 2);
        if (getBoard().positionExist(p) && !getBoard().thereIsAPiece(p)) {
            mat[p.getRow()][p.getColumn()] = true;
        }
        else if (getBoard().positionExist(p) && canMove(p)) {
            mat[p.getRow()][p.getColumn()] = true;
        }

        p.setValues(position.getRow() - 2, position.getColumn() - 1);
        if (getBoard().positionExist(p) && !getBoard().thereIsAPiece(p)) {
            mat[p.getRow()][p.getColumn()] = true;
        }
        else if (getBoard().positionExist(p) && canMove(p)) {
            mat[p.getRow()][p.getColumn()] = true;
        }
        
        p.setValues(position.getRow() - 2, position.getColumn() + 1);
        if (getBoard().positionExist(p) && !getBoard().thereIsAPiece(p)) {
            mat[p.getRow()][p.getColumn()] = true;
        }
        else if (getBoard().positionExist(p) && canMove(p)) {
            mat[p.getRow()][p.getColumn()] = true;
        }

        p.setValues(position.getRow() - 1, position.getColumn() + 2);
        if (getBoard().positionExist(p) && !getBoard().thereIsAPiece(p)) {
            mat[p.getRow()][p.getColumn()] = true;
        }
        else if (getBoard().positionExist(p) && canMove(p)) {
            mat[p.getRow()][p.getColumn()] = true;
        }

        p.setValues(position.getRow() + 1, position.getColumn() + 2);
        if (getBoard().positionExist(p) && !getBoard().thereIsAPiece(p)) {
            mat[p.getRow()][p.getColumn()] = true;
        }
        else if (getBoard().positionExist(p) && canMove(p)) {
            mat[p.getRow()][p.getColumn()] = true;
        }

        p.setValues(position.getRow() + 2, position.getColumn() + 1);
        if (getBoard().positionExist(p) && !getBoard().thereIsAPiece(p)) {
            mat[p.getRow()][p.getColumn()] = true;
        }
        else if (getBoard().positionExist(p) && canMove(p)) {
            mat[p.getRow()][p.getColumn()] = true;
        }

        p.setValues(position.getRow() + 2, position.getColumn() - 1);
        if (getBoard().positionExist(p) && !getBoard().thereIsAPiece(p)) {
            mat[p.getRow()][p.getColumn()] = true;
        }
        else if (getBoard().positionExist(p) && canMove(p)) {
            mat[p.getRow()][p.getColumn()] = true;
        }

        p.setValues(position.getRow() + 1, position.getColumn() - 2);
        if (getBoard().positionExist(p) && !getBoard().thereIsAPiece(p)) {
            mat[p.getRow()][p.getColumn()] = true;
        }
        else if (getBoard().positionExist(p) && canMove(p)) {
            mat[p.getRow()][p.getColumn()] = true;
        }

        return mat;
    }

}
