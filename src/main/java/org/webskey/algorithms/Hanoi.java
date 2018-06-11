package org.webskey.algorithms;

public class Hanoi {
	public static void solve(int numOfDiscs, int startPeg, int endPeg) {
		if (numOfDiscs == 0)
			return;
		
		int intermediatePole = 6 - startPeg - endPeg;
		solve(numOfDiscs - 1, startPeg, intermediatePole);
		System.out.println("Moving disc nr " + numOfDiscs + " from " + startPeg + ". peg to " + endPeg + ". peg");
		solve(numOfDiscs - 1, intermediatePole, endPeg);
	}

	public static void main(String[] args) {
		int numOfDiscs = 4;
		int startPeg = 1;
		int endPeg = 2;
		solve(numOfDiscs, startPeg, endPeg);
	}
}