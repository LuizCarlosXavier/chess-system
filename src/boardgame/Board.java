package boardgame;

import java.util.ArrayList;
import java.util.List;

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
    
}
