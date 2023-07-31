package Chess.pieces;

import BoardGame.Board;
import Chess.ChessPiece;
import Chess.Color;

public class king extends ChessPiece {

    public king(Board board, Color color) {
        super(board, color);
        // TODO Auto-generated constructor stub
    }

    @Override
    public String toString() {
        return "k";
    }

}
