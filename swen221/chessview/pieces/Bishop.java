package swen221.chessview.pieces;

import swen221.chessview.*;

/**
 * Represents a bishop on the board.
 *
 * @author David J. Pearce
 *
 */
public class Bishop extends PieceImpl implements Piece {
	/**
	 * Construct a new bishop.
	 *
	 * @param isWhite True if the bishop is white.
	 */
	public Bishop(boolean isWhite) {
		super(isWhite);
	}

	@Override
	public boolean isValidMove(Position oldPosition, Position newPosition,
			Piece isTaken, Board board) {
		return true;
	}

	@Override
	public String toString() {
		if(isWhite) {
			return "B";
		} else {
			return "b";
		}
	}
}
