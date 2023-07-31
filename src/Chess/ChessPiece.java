package Chess;

import BoardGame.Board;
import BoardGame.Piece;

public class ChessPiece extends Piece {

    private Color color;
    private int moveCount;

    public ChessPiece(Board board, Color color) {
        super(board);
        this.color = color;

    }

    public Color getColor() {
        return color;
    }

}