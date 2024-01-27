package boardgame;

public class Piece {
    
    protected Position position;
    private Board board;

    public Piece(Board board) {
        this.board = board;
        position = null;
    }

    // protecd para não ser acessado por outra camada
    protected Board getBoard() {
        return board;
    }

}
