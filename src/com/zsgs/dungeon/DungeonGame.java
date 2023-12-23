package com.zsgs.dungeon;

import java.util.Scanner;

public class DungeonGame {
	public static void numberOfSteps(char[][] charArray, int addventurerRow, int addventurercol, int goldRow,
			int goldCol) {
		int step1 = Math.abs(addventurerRow - goldRow);
		int step2 = Math.abs(addventurercol - goldCol);
		System.out.print("min steps :");
		System.out.println(step1 + step2);

	}

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the Array row");
		int row = scan.nextInt();
		System.out.println("Enter the Array col");
		int col = scan.nextInt();
		System.out.println("Position Of adventure:");
		int addventurerRow = scan.nextInt();
		int addventurercol = scan.nextInt();
		System.out.println("Position Of Gold:");
		int goldRow = scan.nextInt();
		int goldCol = scan.nextInt();
		char[][] charArray = new char[row][col];

		charArray[addventurerRow - 1][addventurercol - 1] = 'A';
		charArray[goldRow - 1][goldCol - 1] = 'G';

		numberOfSteps(charArray, addventurerRow, addventurercol, goldRow, goldCol);

	}

}
