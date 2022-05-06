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
	@Test public void testValid_10() {
		String input =
				"e2-e4 d7-d5\n"+ "Ke1-e2 h7-h6\n" + "Ke2-d3 h6-h5\n"+"Kd3-d4 h5-h4\n"+"Kd4xd5";
		String output =
				"8|r|n|b|q|k|b|n|r|\n" +
						"7|p|p|p|_|p|p|p|_|\n" +
						"6|_|_|_|_|_|_|_|_|\n" +
						"5|_|_|_|K|_|_|_|_|\n" +
						"4|_|_|_|_|P|_|_|p|\n" +
						"3|_|_|_|_|_|_|_|_|\n" +
						"2|P|P|P|P|_|P|P|P|\n" +
						"1|R|N|B|Q|_|B|N|R|\n" +
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
