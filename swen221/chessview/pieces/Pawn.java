package swen221.chessview.pieces;

import swen221.chessview.*;

/**
 * Represents a bishop on the board.
 *
 * @author David J. Pearce
 *
 */
public class Pawn extends PieceImpl implements Piece {
	private boolean wasDoubleStep; // remember whether took double step or not.

	/**
	 * Construct a new bishop.
	 *
	 * @param isWhite True if the bishop is white.
	 */
	public Pawn(boolean isWhite) {
		super(isWhite);
	}

	@Override
	public boolean isValidMove(Position oldPosition, Position newPosition,
			Piece isTaken, Board board) {
		int oldRow = oldPosition.row();
		int oldCol = oldPosition.column();
		int newRow = newPosition.row();
		int newCol = newPosition.column();

		Piece p = board.pieceAt(oldPosition);
		Piece t = board.pieceAt(newPosition);

		// this logic is more complex than for other pieces, since there is a
		// difference between a take and non-take move for pawns.

			if (isTaken != null) {
				if(isWhite){
					return this.equals(p) && isTaken.equals(t) && (oldCol == (newCol + 1) || oldCol == (newCol - 1))
							&& (oldRow + 1) == newRow;
				}
				else return this.equals(p) && isTaken.equals(t) && (oldCol == (newCol - 1) || oldCol == (newCol + 1))
						&& (oldRow - 1) == newRow;

			} else if ((oldRow + 1) == newRow && oldCol == newCol && isWhite) {
				return this.equals(p) && t == null;
			}
			else if ((oldRow -1) == newRow && oldCol == newCol && !isWhite) {
				return this.equals(p) && t == null;
			}
			else if ((oldRow + 2) == newRow && oldCol == newCol && isWhite) {
				if(oldRow==2) {
					return this.equals(p) && t == null;
				}
				}
				else if ((oldRow - 2) == newRow && oldCol == newCol && !isWhite) {
					if(oldRow ==7) {
						return this.equals(p) && t == null;
					}
				}
		return false;
	}

	/**
	 * Return true if the last move made by this piece was a double step.
	 *
	 * @return True if the last step was a double step.
	 */
	public boolean wasDoubleStep() {
		return wasDoubleStep;
	}

	/**
	 * Mark this piece has having made a double step on the last move.
	 *
	 * @param flag True if the last move was a double step, false otherwise.
	 */
	public void setDoubleStep(boolean flag) {
		wasDoubleStep = flag;
	}

	@Override
	public String toString() {
		if(isWhite) {
			return "P";
		} else {
			return "p";
		}
	}
}
