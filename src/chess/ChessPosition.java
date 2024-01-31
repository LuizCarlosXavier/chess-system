package chess;

import boardgame.Position;

public class ChessPosition {
    private int row;
    private char column;
   
    
    public ChessPosition(char column, int row) { 
        if (column < 'a' || column > 'h' || row < 1 || row > 8) {
            throw new ChessException("Error instantiating ChessPosition. Valid values are from a1 to h8");
        }
        this.column = column;
        this.row = row;
    }

    public char getColumn() {
        return column;
    }

    public int getRow() {
        return row;
    }

    protected Position toPosition() {
        int matriz_row = 8 - row;
        int matriz_column = column - 'a';

        return new Position(matriz_row, matriz_column);
    }

    // Static, pois está sublinhada
    protected static ChessPosition fromProsition(Position position) {
        return new ChessPosition((char)(position.getColumn() + 'a'), position.getRow() + 8);
    }

    @Override
    public String toString(){
        return "" + column + row;
    }

}
