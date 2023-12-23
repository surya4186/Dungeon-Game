package com.zsgs.dungeon;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class DungeonGame {
	public static int numberOfSteps(char[][] charArray, int row, int col, int goldRow, int goldCol) {
		int step1 = Math.abs(row - goldRow);
		int step2 = Math.abs(col - goldCol);
//		System.out.println(step1 + step2);
		return step1 + step2;
	}

//	public static int numberOfStepsTrigger(char[][] charArray, int row, int col, int triggerRow, int triggerCol) {
//		int step1 = Math.abs(row - triggerRow);
//		int step2 = Math.abs(col - triggerCol);
//		return step1 + step2;
//
//	}

	public static void main(String[] args) {
		System.out.println(" 1->Level \n 2->level2 \n 3->level3 \n 4->level4 \n 5->level5 \n");
		Scanner scan = new Scanner(System.in);
		int level = scan.nextInt();
		switch (level) {
		case 1: {
			System.out.println("Enter the Array row");
			int row = scan.nextInt();
			System.out.println("Enter the Array col");
			int col = scan.nextInt();
			System.out.println("Position of adventure:");
			int adventurerRow = scan.nextInt();
			int adventurerCol = scan.nextInt();
			System.out.println("Position of Gold:");
			int goldRow = scan.nextInt();
			int goldCol = scan.nextInt();
			char[][] charArray = new char[row][col];
			int adventurer = numberOfSteps(charArray, adventurerRow, adventurerCol, goldRow, goldCol);
			System.out.println("Level 1 Min Number of Steps: " + adventurer);
			break;

		}
		case 2: {
			System.out.println("Enter the Array row");
			int row = scan.nextInt();
			System.out.println("Enter the Array col");
			int col = scan.nextInt();
			System.out.println("Position of adventure:");
			int adventurerRow = scan.nextInt();
			int adventurerCol = scan.nextInt();
			System.out.println("Position of Monster:");
			int monsterRow = scan.nextInt();
			int monsterCol = scan.nextInt();
			System.out.println("Position of Gold:");
			int goldRow = scan.nextInt();
			int goldCol = scan.nextInt();
			char[][] charArray = new char[row][col];
			int adventurer = numberOfSteps(charArray, adventurerRow, adventurerCol, goldRow, goldCol);
			int monster = numberOfSteps(charArray, monsterRow, monsterCol, goldRow, goldCol);
			if (adventurer > monster) {
				System.out.println("No possible solution"); // level 2
			} else {
				System.out.println("Min Number of steps: " + adventurer);

			}
			break;

		}
		case 3: {
			System.out.println("Enter the Array row");
			int row = scan.nextInt();
			System.out.println("Enter the Array col");
			int col = scan.nextInt();
			System.out.println("Position of adventure:");
			int adventurerRow = scan.nextInt();
			int adventurerCol = scan.nextInt();
			System.out.println("Position of Monster:");
			int monsterRow = scan.nextInt();
			int monsterCol = scan.nextInt();
			System.out.println("Position of Gold:");
			int goldRow = scan.nextInt();
			int goldCol = scan.nextInt();
			char[][] charArray = new char[row][col];
			int adventurer = numberOfSteps(charArray, adventurerRow, adventurerCol, goldRow, goldCol);
			int monster = numberOfSteps(charArray, monsterRow, monsterCol, goldRow, goldCol);
			if (adventurer > monster) {
				System.out.println("No possible solution"); // level 3
			} else {
				System.out.println("Min Number of steps: " + adventurer);
				List<List<Integer>> list = minimumStepPaths(charArray, adventurerRow, adventurerCol, goldRow, goldCol);
				System.out.println(list); // level 3
			}
			break;

		}
		case 4: {
			System.out.println("Enter the Array row");
			int row = scan.nextInt();
			System.out.println("Enter the Array col");
			int col = scan.nextInt();
			System.out.println("Position of adventure:");
			int adventurerRow = scan.nextInt();
			int adventurerCol = scan.nextInt();
			System.out.println("Position of Monster:");
			int monsterRow = scan.nextInt();
			int monsterCol = scan.nextInt();
			System.out.println("Position of Gold:");
			int goldRow = scan.nextInt();
			int goldCol = scan.nextInt();
			int triggerRow = 4;
			int triggerCol = 4;
			char[][] charArray = new char[row][col];
			int adventurer = numberOfSteps(charArray, adventurerRow, adventurerCol, goldRow, goldCol);
			int monster = numberOfSteps(charArray, monsterRow, monsterCol, goldRow, goldCol);
			if (adventurer > monster) {
//				System.out.println("No possible solution"); // level 3
				int trigger = numberOfSteps(charArray, adventurerRow, adventurerCol, triggerRow, triggerCol);
				int triggerToGold = numberOfSteps(charArray, triggerRow, triggerCol, goldRow, goldCol);
				System.out.print("level 4 output: ");
				System.out.println(trigger + triggerToGold);
			}
			break;

		}
		case 5: {
			System.out.println("Enter the Array row");
			int row = scan.nextInt();
			System.out.println("Enter the Array col");
			int col = scan.nextInt();
			System.out.println("Position of adventure:");
			int adventurerRow = scan.nextInt();
			int adventurerCol = scan.nextInt();

			System.out.println("Position of Gold:");
			int goldRow = scan.nextInt();
			int goldCol = scan.nextInt();
			char[][] charArray = new char[row][col];
			System.out.println("Enter the Number of bit");
			int NumOfBit = scan.nextInt();
			charArray[adventurerRow - 1][adventurerCol - 1] = 'A';
			charArray[goldRow - 1][goldCol - 1] = 'G';

			for (int i = 0; i < NumOfBit; i++) {
				System.out.println("Enter the Bit row");
				int bitRow = scan.nextInt();
				System.out.println("Enter the Bit row");
				int bitCol = scan.nextInt();
				charArray[bitRow][bitCol] = 'P';
			}
			break;

		}
		}

//		System.out.println("Enter the Array row");
//		int row = scan.nextInt();
//		System.out.println("Enter the Array col");
//		int col = scan.nextInt();
//		System.out.println("Position Of adventure:");
//		int adventurerRow = scan.nextInt();
//		int adventurerCol = scan.nextInt();
//		System.out.println("Position Of Monster:");
//		int monsterRow = scan.nextInt();
//		int monsterCol = scan.nextInt();
//		System.out.println("Position Of Gold:");
//		int goldRow = scan.nextInt();
//		int goldCol = scan.nextInt();
//		char[][] charArray = new char[row][col];
//
//		charArray[adventurerRow - 1][adventurerCol - 1] = 'A';
//		charArray[goldRow - 1][goldCol - 1] = 'G';
//		charArray[monsterRow - 1][monsterCol - 1] = 'M';
//
//		int adventurer = numberOfSteps(charArray, adventurerRow, adventurerCol, goldRow, goldCol);
//
//		System.out.println("Level 1 Min Number of Steps: " + adventurer);// level 1
//
//		int monster = numberOfSteps(charArray, monsterRow, monsterCol, goldRow, goldCol);
//
//		if (adventurer > monster) {
//			System.out.println("No possible solution"); // level 2
//		} else {
//			System.out.println("Min Number of steps: " + adventurer);
//			List<List<Integer>> list = minimumStepPaths(charArray, adventurerRow, adventurerCol, goldRow, goldCol);
//			System.out.println(list); // level 3
//		}
//		int triggerRow = 4;
//		int triggerCol = 4;
//		adventurer = numberOfSteps(charArray, adventurerRow, adventurerCol, goldRow, goldCol);
//		monster = numberOfSteps(charArray, monsterRow, monsterCol, goldRow, goldCol);
//		if (adventurer > monster) {
////			System.out.println("No possible solution");
//			int trigger = numberOfSteps(charArray, adventurerRow, adventurerCol, triggerRow, triggerCol);
//			int triggerToGold = numberOfSteps(charArray, triggerRow, triggerCol, goldRow, goldCol);
//			System.out.print("level 3 output: ");
//			System.out.println(trigger + triggerToGold);
//			System.out.println("total");
//
//		}

	}

	private static List<List<Integer>> minimumStepPaths(char[][] charArray, int adventurerRow, int adventurerCol,
			int goldRow, int goldCol) {
		List<List<Integer>> result = new ArrayList<List<Integer>>();
		List<Integer> path = new ArrayList<Integer>();
		path.add(adventurerRow);
		path.add(adventurerCol);
		result.add(new ArrayList<Integer>(path));
		while (adventurerRow != goldRow || adventurerCol != goldCol) {
			if (adventurerRow < goldRow) {
				adventurerRow++;
			} else if (adventurerRow > goldRow) {
				adventurerRow--;
			} else if (adventurerCol < goldCol) {
				adventurerCol++;
			} else if (adventurerCol > goldCol) {
				adventurerCol--;
			}
			path.clear();
			path.add(adventurerRow);
			path.add(adventurerCol);
			result.add(new ArrayList<Integer>(path));

		}

		return result;
	}

}
