package boardgame;

public abstract class Piece {
    
    protected Position position;
    private Board board;

    public Piece(Board board) {
        this.board = board;
        position = null;
    }

    protected Board getBoard() {
        return board;
    }

    public abstract boolean[][] possibleMoves();

    public boolean possibleMove(Position position) {
        return possibleMoves()[position.getRow()][position.getColumn()]; // Hook
    }

    public boolean isThereAnyPossibleMove() {
        boolean[][] mat = possibleMoves();
        boolean key = false;
        
        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat.length; j++) {
                if (mat[i][j] == true) {
                    key = true;
                }
             }
        }
        return key;
    }

}
