package com.zsgs.dungeon;

import java.util.Scanner;

public class DungeonGame {
	public static int numberOfSteps(char[][] charArray, int row, int col, int goldRow, int goldCol) {
		int step1 = Math.abs(row - goldRow);
		int step2 = Math.abs(col - goldCol);
		return step1 + step2;

	}

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the Array row");
		int row = scan.nextInt();
		System.out.println("Enter the Array col");
		int col = scan.nextInt();
		System.out.println("Position Of adventure:");
		int adventurerRow = scan.nextInt();
		int adventurercol = scan.nextInt();
		System.out.println("Position Of Monster:");
		int monsterRow = scan.nextInt();
		int monsterCol = scan.nextInt();
		System.out.println("Position Of Gold:");
		int goldRow = scan.nextInt();
		int goldCol = scan.nextInt();
		char[][] charArray = new char[row][col];

		charArray[adventurerRow - 1][adventurercol - 1] = 'A';
		charArray[goldRow - 1][goldCol - 1] = 'G';
		charArray[monsterRow - 1][monsterCol - 1] = 'M';

		int adventurer = numberOfSteps(charArray, adventurerRow, adventurercol, goldRow, goldCol);
		int monster = numberOfSteps(charArray, monsterRow, monsterCol, goldRow, goldCol);
		if (adventurer >= monster) {
			System.out.println("No possible solution");
		} else {
			System.out.println(" Min Number of steps: " + adventurer);
		}

	}

}
