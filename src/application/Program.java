/**
 * 
 */
package application;

import chess.ChessMatch;

/**
 * @author Ot�vio Cavalcanti
 *
 */
public class Program {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		ChessMatch chessMatch = new ChessMatch();
		
		UI.printBoard(chessMatch.getPieces());
	}
}