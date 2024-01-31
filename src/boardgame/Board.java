package boardgame;

public class Board {

    private int rows;
    private int column;
    private Piece[][] pieces;
    
    public Board(int rows, int column) {
        this.rows = rows;
        this.column = column;
        pieces = new Piece[rows][column];

        if (rows < 1 || column < 1) {
            throw new BoardException("Error creating board: there must be at least 1 row and 1 column");
        }

    }

    public int getRows() {
        return rows;
    }

    public int getColumn() {
        return column;
    }

    public Piece piece(int rows, int column) {
        if (!positionExist(rows, column)) {
            throw new BoardException("Position not on the board");
        }
        return pieces[rows][column];
    }
    
    public Piece piece(Position position) {
        if (!positionExist(position)) {
            throw new BoardException("Position not on the board");
        }
        return pieces[position.getRow()][position.getColumn()];
    }

    public void placePiece(Piece piece, Position position) {
        if (thereIsAPiece(position)) {
            throw new BoardException("There is already a piece on position: " + position);
        }
        pieces[position.getRow()][position.getColumn()] = piece;
        piece.position = position;
    }
    
    public Piece removePiece(Position position) {
        if (!positionExist(position)) {
            throw new BoardException("Position not on the board");
        }
        if (piece(position) == null) {
            return null;
        }
        Piece aux = piece(position);
        pieces[position.getRow()][position.getColumn()] = null;
        return aux;
    }

    public boolean positionExist(int row, int columns) {
        return row >= 0 && row < rows && columns >= 0 && columns < column; 
    }

    public boolean positionExist(Position position) {
        return positionExist(position.getRow(), position.getColumn()); 
    }

    public boolean thereIsAPiece(Position position) {
        if (!positionExist(position)) {
            throw new BoardException("Position not on the board");
        }
        return piece(position) != null;
    }
    
}
