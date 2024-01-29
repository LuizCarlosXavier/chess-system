package boardgame;

public class Board {

    private int rows;
    private int column;
    private Piece[][] pieces;
    
    public Board(int rows, int column) {
        this.rows = rows;
        this.column = column;
        pieces = new Piece[rows][column];
    }

    public int getRows() {
        return rows;
    }

    public void setRows(int rows) {
        this.rows = rows;
    }

    public int getColumn() {
        return column;
    }

    public void setColumn(int column) {
        this.column = column;
    }

    public Piece piece(int rows, int column) {
        return pieces[rows][column];
    }
    
    public Piece piece(Position position) {
        return pieces[position.getRow()][position.getColumn()];
    }
    
}
