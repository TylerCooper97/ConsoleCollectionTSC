package edu.saintjoe.cs.tcooper.consoledriver;

public class ConsoleDriver {

	public static void main(String[] args) {
		Console xboxOne = new Console("myXboxOne", 2);
		Console playStation4 = new Console("myPS4", 1);
		
		xboxOne = new Console("Tyler's Xbox", 5);
		playStation4 = new Console("Brian's PS4", 5);
		
		System.out.println(xboxOne.toString());
		System.out.println(playStation4.toString());

	}

}
