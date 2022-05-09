package swen221.tests;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.fail;
import swen221.chessview.*;

import java.util.List;

import org.junit.jupiter.api.Test;


public class ChessViewTests {

	// ================================================
	// Valid Tests
	// ================================================

	@Test
	public void testValid_01() {
		String input =
			"a2-a3\n" +
			"";
		String output =
			"8|r|n|b|q|k|b|n|r|\n" +
			"7|p|p|p|p|p|p|p|p|\n" +
			"6|_|_|_|_|_|_|_|_|\n" +
			"5|_|_|_|_|_|_|_|_|\n" +
			"4|_|_|_|_|_|_|_|_|\n" +
			"3|P|_|_|_|_|_|_|_|\n" +
			"2|_|P|P|P|P|P|P|P|\n" +
			"1|R|N|B|Q|K|B|N|R|\n" +
			"  a b c d e f g h";

		check(input,output);
	}

	// ================================================
	// Invalid Tests
	// ================================================

	@Test public void testInvalid_01() {
		String input =
			"a2-a2\n" +
			"";
		String output =
			"8|r|n|b|q|k|b|n|r|\n" +
			"7|p|p|p|p|p|p|p|p|\n" +
			"6|_|_|_|_|_|_|_|_|\n" +
			"5|_|_|_|_|_|_|_|_|\n" +
			"4|_|_|_|_|_|_|_|_|\n" +
			"3|_|_|_|_|_|_|_|_|\n" +
			"2|P|P|P|P|P|P|P|P|\n" +
			"1|R|N|B|Q|K|B|N|R|\n" +
			"  a b c d e f g h";

		check(input,output);
	}
	@Test
	public void testValid_02() {
		String input =
				"a2-a4\n" +
						"";
		String output =
				"8|r|n|b|q|k|b|n|r|\n" +
						"7|p|p|p|p|p|p|p|p|\n" +
						"6|_|_|_|_|_|_|_|_|\n" +
						"5|_|_|_|_|_|_|_|_|\n" +
						"4|P|_|_|_|_|_|_|_|\n" +
						"3|_|_|_|_|_|_|_|_|\n" +
						"2|_|P|P|P|P|P|P|P|\n" +
						"1|R|N|B|Q|K|B|N|R|\n" +
						"  a b c d e f g h";

		check(input,output);
	}
	@Test public void testValid_03() {
		String input =
				"a2-a3 h7-h5\n"+ "";
		String output =
				"8|r|n|b|q|k|b|n|r|\n" +
						"7|p|p|p|p|p|p|p|_|\n" +
						"6|_|_|_|_|_|_|_|_|\n" +
						"5|_|_|_|_|_|_|_|p|\n" +
						"4|_|_|_|_|_|_|_|_|\n" +
						"3|P|_|_|_|_|_|_|_|\n" +
						"2|_|P|P|P|P|P|P|P|\n" +
						"1|R|N|B|Q|K|B|N|R|\n" +
						"  a b c d e f g h";

		check(input,output);
	}
	@Test public void testInValid_02() {
		String input =
				"a2-a3 h7-h5\n"+ "a3-a5";
		String output =
				"8|r|n|b|q|k|b|n|r|\n" +
						"7|p|p|p|p|p|p|p|_|\n" +
						"6|_|_|_|_|_|_|_|_|\n" +
						"5|_|_|_|_|_|_|_|p|\n" +
						"4|_|_|_|_|_|_|_|_|\n" +
						"3|P|_|_|_|_|_|_|_|\n" +
						"2|_|P|P|P|P|P|P|P|\n" +
						"1|R|N|B|Q|K|B|N|R|\n" +
						"  a b c d e f g h";

		check(input,output);
	}
	@Test public void testValid_04() {
		String input =
				"g2-g4 h7-h5\n"+ "g4xh5";
		String output =
				"8|r|n|b|q|k|b|n|r|\n" +
						"7|p|p|p|p|p|p|p|_|\n" +
						"6|_|_|_|_|_|_|_|_|\n" +
						"5|_|_|_|_|_|_|_|P|\n" +
						"4|_|_|_|_|_|_|_|_|\n" +
						"3|_|_|_|_|_|_|_|_|\n" +
						"2|P|P|P|P|P|P|_|P|\n" +
						"1|R|N|B|Q|K|B|N|R|\n" +
						"  a b c d e f g h";

		check(input,output);
	}
	@Test public void testValid_05() {
		String input =
				"g2-g4 h7-h5\n"+ "a2-a3 h5xg4";
		String output =
				"8|r|n|b|q|k|b|n|r|\n" +
						"7|p|p|p|p|p|p|p|_|\n" +
						"6|_|_|_|_|_|_|_|_|\n" +
						"5|_|_|_|_|_|_|_|_|\n" +
						"4|_|_|_|_|_|_|p|_|\n" +
						"3|P|_|_|_|_|_|_|_|\n" +
						"2|_|P|P|P|P|P|_|P|\n" +
						"1|R|N|B|Q|K|B|N|R|\n" +
						"  a b c d e f g h";

		check(input,output);
	}
	@Test public void testValid_06() {
		String input =
				"Nb1-c3 Ng8-f6\n"+ "";
		String output =
				"8|r|n|b|q|k|b|_|r|\n" +
						"7|p|p|p|p|p|p|p|p|\n" +
						"6|_|_|_|_|_|n|_|_|\n" +
						"5|_|_|_|_|_|_|_|_|\n" +
						"4|_|_|_|_|_|_|_|_|\n" +
						"3|_|_|N|_|_|_|_|_|\n" +
						"2|P|P|P|P|P|P|P|P|\n" +
						"1|R|_|B|Q|K|B|N|R|\n" +
						"  a b c d e f g h";

		check(input,output);
	}
	@Test public void testValid_07() {
		String input =
				"Nb1-c3 Ng8-f6\n"+ "a2-a3 d7-d5\n" + "Nc3xd5 Nf6xNd5";
		String output =
				"8|r|n|b|q|k|b|_|r|\n" +
						"7|p|p|p|_|p|p|p|p|\n" +
						"6|_|_|_|_|_|_|_|_|\n" +
						"5|_|_|_|n|_|_|_|_|\n" +
						"4|_|_|_|_|_|_|_|_|\n" +
						"3|P|_|_|_|_|_|_|_|\n" +
						"2|_|P|P|P|P|P|P|P|\n" +
						"1|R|_|B|Q|K|B|N|R|\n" +
						"  a b c d e f g h";

		check(input,output);
	}
	@Test public void testValid_08() {
		String input =
				"Nb1-c3 Ng8-f6\n"+ "a2-a3 d7-d5\n" + "Nc3xd5 Nf6xNd5\n" + "b2-b3 Ke8-d7\n";
		String output =
				"8|r|n|b|q|_|b|_|r|\n" +
						"7|p|p|p|k|p|p|p|p|\n" +
						"6|_|_|_|_|_|_|_|_|\n" +
						"5|_|_|_|n|_|_|_|_|\n" +
						"4|_|_|_|_|_|_|_|_|\n" +
						"3|P|P|_|_|_|_|_|_|\n" +
						"2|_|_|P|P|P|P|P|P|\n" +
						"1|R|_|B|Q|K|B|N|R|\n" +
						"  a b c d e f g h";

		check(input,output);
	}

	@Test public void testValid_09() {
		String input =
				"e2-e4 d7-d5\n"+ "Ke1-e2 h7-h6\n" + "Ke2-d3 d5xe4\n"+"Kd3xe4";
		String output =
				"8|r|n|b|q|k|b|n|r|\n" +
						"7|p|p|p|_|p|p|p|_|\n" +
						"6|_|_|_|_|_|_|_|p|\n" +
						"5|_|_|_|_|_|_|_|_|\n" +
						"4|_|_|_|_|K|_|_|_|\n" +
						"3|_|_|_|_|_|_|_|_|\n" +
						"2|P|P|P|P|_|P|P|P|\n" +
						"1|R|N|B|Q|_|B|N|R|\n" +
						"  a b c d e f g h";

		check(input,output);
	}
	@Test public void testInValid_10() {
		String input =
				"e2-e4 d7-d5\n"+ "Ke1-e2 h7-h6\n" + "Ke2-d3 h6-h5\n"+"Kd3-d4 h5-h4\n"+"Kd4xd5";
		String output =
						"8|r|n|b|q|k|b|n|r|\n" +
						"7|p|p|p|_|p|p|p|_|\n" +
						"6|_|_|_|_|_|_|_|_|\n" +
						"5|_|_|_|p|_|_|_|_|\n" +
						"4|_|_|_|K|P|_|_|p|\n" +
						"3|_|_|_|_|_|_|_|_|\n" +
						"2|P|P|P|P|_|P|P|P|\n" +
						"1|R|N|B|Q|_|B|N|R|\n" +
						"  a b c d e f g h";

		check(input,output);
	}
	@Test public void testValid_10() {
		String input =
				"e2-e4 e7-e6\n"+ "Ke1-e2 h7-h6\n" + "Ke2-d3 h6-h5\n"+"Kd3-d4 e6-e5\n"+"Kd4xe5";
		String output =
						"8|r|n|b|q|k|b|n|r|\n" +
						"7|p|p|p|p|_|p|p|_|\n" +
						"6|_|_|_|_|_|_|_|_|\n" +
						"5|_|_|_|_|K|_|_|p|\n" +
						"4|_|_|_|_|P|_|_|_|\n" +
						"3|_|_|_|_|_|_|_|_|\n" +
						"2|P|P|P|P|_|P|P|P|\n" +
						"1|R|N|B|Q|_|B|N|R|\n" +
						"  a b c d e f g h";

		check(input,output);
	}

	@Test public void testInValid_04() {
		String input =
				"e2-e4 b7-b5\n"+ "Bf1-a6";
		String output =
				"8|r|n|b|q|k|b|n|r|\n" +
						"7|p|_|p|p|p|p|p|p|\n" +
						"6|_|_|_|_|_|_|_|_|\n" +
						"5|_|p|_|_|_|_|_|_|\n" +
						"4|_|_|_|_|P|_|_|_|\n" +
						"3|_|_|_|_|_|_|_|_|\n" +
						"2|P|P|P|P|_|P|P|P|\n" +
						"1|R|N|B|Q|K|B|N|R|\n" +
						"  a b c d e f g h";

		check(input,output);
	}
	@Test public void testValid_12() {
		String input =
				"e2-e4 b7-b5\n"+ "Bf1xb5";
		String output =
				"8|r|n|b|q|k|b|n|r|\n" +
						"7|p|_|p|p|p|p|p|p|\n" +
						"6|_|_|_|_|_|_|_|_|\n" +
						"5|_|B|_|_|_|_|_|_|\n" +
						"4|_|_|_|_|P|_|_|_|\n" +
						"3|_|_|_|_|_|_|_|_|\n" +
						"2|P|P|P|P|_|P|P|P|\n" +
						"1|R|N|B|Q|K|_|N|R|\n" +
						"  a b c d e f g h";

		check(input,output);
	}
	@Test public void testValid_13() {
		String input =
				"e2-e4 b7-b5\n"+ "Bf1xb5";
		String output =
				"8|r|n|b|q|k|b|n|r|\n" +
						"7|p|_|p|p|p|p|p|p|\n" +
						"6|_|_|_|_|_|_|_|_|\n" +
						"5|_|B|_|_|_|_|_|_|\n" +
						"4|_|_|_|_|P|_|_|_|\n" +
						"3|_|_|_|_|_|_|_|_|\n" +
						"2|P|P|P|P|_|P|P|P|\n" +
						"1|R|N|B|Q|K|_|N|R|\n" +
						"  a b c d e f g h";

		check(input,output);
	}
	@Test public void testValid_14() {
		String input =
				"e2-e4 b7-b5\n"+ "Bf1xb5 h7-h5\n" + "g2-g4 Rh8-h6\n" + "g4xh5 Rh6xh5";
		String output =
				"8|r|n|b|q|k|b|n|_|\n" +
						"7|p|_|p|p|p|p|p|_|\n" +
						"6|_|_|_|_|_|_|_|_|\n" +
						"5|_|B|_|_|_|_|_|r|\n" +
						"4|_|_|_|_|P|_|_|_|\n" +
						"3|_|_|_|_|_|_|_|_|\n" +
						"2|P|P|P|P|_|P|_|P|\n" +
						"1|R|N|B|Q|K|_|N|R|\n" +
						"  a b c d e f g h";

		check(input,output);
	}

	@Test public void testValid_15() { // white en passant
		String input =
				"e2-e4 b7-b5\n" + "e4-e5 d7-d5\n" + "e5xd6ep";
		String output =
				"8|r|n|b|q|k|b|n|r|\n" +
						"7|p|_|p|_|p|p|p|p|\n" +
						"6|_|_|_|P|_|_|_|_|\n" +
						"5|_|p|_|_|_|_|_|_|\n" +
						"4|_|_|_|_|_|_|_|_|\n" +
						"3|_|_|_|_|_|_|_|_|\n" +
						"2|P|P|P|P|_|P|P|P|\n" +
						"1|R|N|B|Q|K|B|N|R|\n" +
						"  a b c d e f g h";

		check(input,output);
	}
	@Test public void testValid_17() {
		String input =
				"g2-g4 b7-b5\n" + "Bf1-g2 f7-f6\n" + "Bg2-c6 a7-a5\n" + "Bc6xd7+";
		String output =
						"8|r|n|b|q|k|b|n|r|\n" +
						"7|_|_|p|B|p|_|p|p|\n" +
						"6|_|_|_|_|_|p|_|_|\n" +
						"5|p|p|_|_|_|_|_|_|\n" +
						"4|_|_|_|_|_|_|P|_|\n" +
						"3|_|_|_|_|_|_|_|_|\n" +
						"2|P|P|P|P|P|P|_|P|\n" +
						"1|R|N|B|Q|K|_|N|R|\n" +
						"  a b c d e f g h";

		check(input,output);
	}

	@Test public void testValid_16() { //black en passant
		String input =
				"e2-e4 b7-b5\n" + "e4-e5 d7-d5\n" + "e5xd6ep";
		String output =
				"8|r|n|b|q|k|b|n|r|\n" +
						"7|p|_|p|_|p|p|p|p|\n" +
						"6|_|_|_|P|_|_|_|_|\n" +
						"5|_|p|_|_|_|_|_|_|\n" +
						"4|_|_|_|_|_|_|_|_|\n" +
						"3|_|_|_|_|_|_|_|_|\n" +
						"2|P|P|P|P|_|P|P|P|\n" +
						"1|R|N|B|Q|K|B|N|R|\n" +
						"  a b c d e f g h";

		check(input,output);
	}

	@Test public void testInValid_17() { //invalid en passant
		String input =
				"e2-e4 b7-b5\n" + "e4-e5 d7-d5\n" + "h2-h4 d5xe4ep";
		String output =
				"8|r|n|b|q|k|b|n|r|\n" +
						"7|p|_|p|_|p|p|p|p|\n" +
						"6|_|_|_|_|_|_|_|_|\n" +
						"5|_|p|_|p|P|_|_|_|\n" +
						"4|_|_|_|_|_|_|_|P|\n" +
						"3|_|_|_|_|_|_|_|_|\n" +
						"2|P|P|P|P|_|P|P|_|\n" +
						"1|R|N|B|Q|K|B|N|R|\n" +
						"  a b c d e f g h";

		check(input,output);
	}
	@Test public void testInvalid_06() {
		String input =
				"e2-e4 b7-b5\n"+ "Bf1xb5 h7-h5\n" + "h2-h4 Rh8-h3";
		String output =
				"8|r|n|b|q|k|b|n|r|\n" +
						"7|p|_|p|p|p|p|p|_|\n" +
						"6|_|_|_|_|_|_|_|_|\n" +
						"5|_|B|_|_|_|_|_|p|\n" +
						"4|_|_|_|_|P|_|_|P|\n" +
						"3|_|_|_|_|_|_|_|_|\n" +
						"2|P|P|P|P|_|P|P|_|\n" +
						"1|R|N|B|Q|K|_|N|R|\n" +
						"  a b c d e f g h";

		check(input,output);
	}
	@Test public void testInvalid_05() {
		String input =
				"a2-a3 h7-h5\n"+ "a3-a5";
		String output =
				"8|r|n|b|q|k|b|n|r|\n" +
						"7|p|p|p|p|p|p|p|_|\n" +
						"6|_|_|_|_|_|_|_|_|\n" +
						"5|_|_|_|_|_|_|_|p|\n" +
						"4|_|_|_|_|_|_|_|_|\n" +
						"3|P|_|_|_|_|_|_|_|\n" +
						"2|_|P|P|P|P|P|P|P|\n" +
						"1|R|N|B|Q|K|B|N|R|\n" +
						"  a b c d e f g h";

		check(input,output);
	}
	@Test public void testInValid_03() {
		String input =
				"e2-e4 d7-d5\n"+ "Ke1-e3"+"";
		String output =
				"8|r|n|b|q|k|b|n|r|\n" +
						"7|p|p|p|_|p|p|p|p|\n" +
						"6|_|_|_|_|_|_|_|_|\n" +
						"5|_|_|_|p|_|_|_|_|\n" +
						"4|_|_|_|_|P|_|_|_|\n" +
						"3|_|_|_|_|_|_|_|_|\n" +
						"2|P|P|P|P|_|P|P|P|\n" +
						"1|R|N|B|Q|K|B|N|R|\n" +
						"  a b c d e f g h";

		check(input,output);
	}
	@Test
	public void testValid_18() { // pawn promotion
		String input =
				"a2-a4 h7-h5\n" +
						"a4-a5 h5-h4\n" + "a5-a6 h4-h3\n" + "a6xb7 h3xg2\n" + "b7xRa8";
		String output =
						"8|Q|n|b|q|k|b|n|r|\n" +
						"7|p|_|p|p|p|p|p|_|\n" +
						"6|_|_|_|_|_|_|_|_|\n" +
						"5|_|_|_|_|_|_|_|_|\n" +
						"4|_|_|_|_|_|_|_|_|\n" +
						"3|_|_|_|_|_|_|_|_|\n" +
						"2|_|P|P|P|P|P|p|P|\n" +
						"1|R|N|B|Q|K|B|N|R|\n" +
						"  a b c d e f g h";

		check(input,output);
	}


	// The following provides a simple helper method for all tests.
	public static void check(String input, String expectedOutput) {
		try {
			ChessGame game = new ChessGame(input);
			List<Board> boards = game.boards();
			if (boards.isEmpty()) {
				fail("test failed with insufficient boards on input: " + input);
			}
			String actualOutput = boards.get(boards.size() - 1).toString();
			assertEquals(expectedOutput, actualOutput);
		} catch (Exception e) {
			fail("test failed because of exception on input: " + input);
		}
	}
}
