package com.zsgs.dungeon;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

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
		System.out.println(" 1->Level \n 2->level2 \n 3->level3 \n 4->level4 \n 5->level5 \n 6->level6");
		Scanner scan = new Scanner(System.in);
		int level = scan.nextInt();
		switch (level) {
		case 1: {
			System.out.println("Enter the Array row");
			int row = scan.nextInt();
			System.out.println("Enter the Array col");
			int col = scan.nextInt();
			System.out.println("Position of adventure:");
			int adventurerRow = scan.nextInt() - 1;
			int adventurerCol = scan.nextInt() - 1;
			System.out.println("Position of Gold:");
			int goldRow = scan.nextInt() - 1;
			int goldCol = scan.nextInt() - 1;
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
			int adventurerRow = scan.nextInt() - 1;
			int adventurerCol = scan.nextInt() - 1;
			System.out.println("Position of Monster:");
			int monsterRow = scan.nextInt() - 1;
			int monsterCol = scan.nextInt() - 1;
			System.out.println("Position of Gold:");
			int goldRow = scan.nextInt() - 1;
			int goldCol = scan.nextInt() - 1;
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
			int adventurerRow = scan.nextInt() - 1;
			int adventurerCol = scan.nextInt() - 1;
			System.out.println("Position of Monster:");
			int monsterRow = scan.nextInt() - 1;
			int monsterCol = scan.nextInt() - 1;
			System.out.println("Position of Gold:");
			int goldRow = scan.nextInt() - 1;
			int goldCol = scan.nextInt() - 1;
			char[][] charArray = new char[row][col];
			int adventurer = numberOfSteps(charArray, adventurerRow, adventurerCol, goldRow, goldCol);
			int monster = numberOfSteps(charArray, monsterRow, monsterCol, goldRow, goldCol);
			if (adventurer >= monster) {
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
			int adventurerRow = scan.nextInt() - 1;
			int adventurerCol = scan.nextInt() - 1;
			System.out.println("Position of Monster:");
			int monsterRow = scan.nextInt() - 1;
			int monsterCol = scan.nextInt() - 1;
			System.out.println("Position of Gold:");
			int goldRow = scan.nextInt() - 1;
			int goldCol = scan.nextInt() - 1;
			System.out.println("Position of Trigger:");
			int triggerRow = scan.nextInt();
			int triggerCol = scan.nextInt();
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
			int[] adventurer = new int[2];
			System.out.println("Position of adventure:");
			adventurer[0] = scan.nextInt() - 1;
			adventurer[1] = scan.nextInt() - 1;
//			int adventurerRow = ;
//			int adventurerCol = scan.nextInt();

			System.out.println("Position of Gold:");
			int[] gold = new int[2];
			gold[0] = scan.nextInt() - 1;
			gold[1] = scan.nextInt() - 1;
			char[][] charArray = new char[row][col];
			System.out.println("Enter the Number of bit");
			int NumOfBit = scan.nextInt();
//			charArray[adventurerRow - 1][adventurerCol - 1] = 'A';
//			charArray[goldRow - 1][goldCol - 1] = 'G';
			ArrayList<String> pits = new ArrayList<>();
			for (int i = 0; i < NumOfBit; i++) {
				System.out.println("Enter the Bit row");
				int bitRow = scan.nextInt() - 1;
				System.out.println("Enter the Bit col");
				int bitCol = scan.nextInt() - 1;
				pits.add(bitRow + "," + bitCol);
				charArray[bitRow][bitCol] = 'P';
			}
			int n = numberOfStepss(charArray, adventurer, gold, pits);
			if (n == -1) {
				System.out.println("No possible");
			} else {
				System.out.println(n + " level");
			}
			break;

		}
		case 6: {
			System.out.println("Enter the Array row");
			int row = scan.nextInt();
			System.out.println("Enter the Array col");
			int col = scan.nextInt();
			int[] adventurer = new int[2];
			System.out.println("Position of adventure:");
			adventurer[0] = scan.nextInt() - 1;
			adventurer[1] = scan.nextInt() - 1;
//			int adventurerRow = ;
//			int adventurerCol = scan.nextInt();

			System.out.println("Position of Gold:");
			int[] gold = new int[2];
			gold[0] = scan.nextInt() - 1;
			gold[1] = scan.nextInt() - 1;

			System.out.println("Position of Monster:");
			int[] monster = new int[2];
			monster[0] = scan.nextInt() - 1;
			monster[1] = scan.nextInt() - 1;

			char[][] charArray = new char[row][col];

			System.out.println("Enter the Number of bit");
			int NumOfBit = scan.nextInt();
//			charArray[adventurerRow - 1][adventurerCol - 1] = 'A';
//			charArray[goldRow - 1][goldCol - 1] = 'G';

			ArrayList<String> pits = new ArrayList<>();
			for (int i = 0; i < NumOfBit; i++) {
				System.out.println("Enter the Bit row");
				int bitRow = scan.nextInt() - 1;
				System.out.println("Enter the Bit col");
				int bitCol = scan.nextInt() - 1;
				pits.add(bitRow + "," + bitCol);
				charArray[bitRow][bitCol] = 'P';
			}
			int adventurerStep = numberOfSteps(charArray, adventurer[0], adventurer[1], gold[0], gold[1]);
			int monsterStep = numberOfSteps(charArray, monster[0], monster[1], gold[0], gold[1]);
			if (monsterStep <= adventurerStep) {
				System.out.println("No possible solution");
			} else {
				System.out.println(adventurerStep);
			}
			break;

		}
		case 7: {
			System.out.println("Enter the Array row");
			int row = scan.nextInt();
			System.out.println("Enter the Array col");
			int col = scan.nextInt();
			int[] adventurer = new int[2];
			System.out.println("Position of adventure:");
			adventurer[0] = scan.nextInt() - 1;
			adventurer[1] = scan.nextInt() - 1;
//			int adventurerRow = ;
//			int adventurerCol = scan.nextInt();

			System.out.println("Position of Gold:");
			int[] gold = new int[2];
			gold[0] = scan.nextInt() - 1;
			gold[1] = scan.nextInt() - 1;

			System.out.println("Position of Monster:");
			int[] monster = new int[2];
			monster[0] = scan.nextInt() - 1;
			monster[1] = scan.nextInt() - 1;

			System.out.println("Position of Trigger:");
			int[] trigger = new int[2];
			trigger[0] = scan.nextInt();
			trigger[1] = scan.nextInt();

			char[][] charArray = new char[row][col];

			System.out.println("Enter the Number of bit");
			int NumOfBit = scan.nextInt();
//			charArray[adventurerRow - 1][adventurerCol - 1] = 'A';
//			charArray[goldRow - 1][goldCol - 1] = 'G';

			ArrayList<String> pits = new ArrayList<>();
			for (int i = 0; i < NumOfBit; i++) {
				System.out.println("Enter the Bit row");
				int bitRow = scan.nextInt() - 1;
				System.out.println("Enter the Bit col");
				int bitCol = scan.nextInt() - 1;
				pits.add(bitRow + "," + bitCol);
				charArray[bitRow][bitCol] = 'P';
			}
//			int adventurerStep = numberOfSteps(charArray, adventurer[0], adventurer[1], gold[0], gold[1]);
			int adventurerToGold = numberOfStepss(charArray, adventurer, gold, pits);
			int monsterToGold = numberOfSteps(charArray, monster[0], monster[1], gold[0], gold[1]);
			int triggerToGold;
			if (monsterToGold <= adventurerToGold) {
//				System.out.println("No possible solution");
				int adventurerToTrigger = numberOfStepss(charArray, adventurer, trigger, pits);
				triggerToGold = numberOfSteps(charArray, trigger[0], trigger[1], gold[0], gold[1]);
//				System.out.println();

				int totalSteps = adventurerToTrigger + triggerToGold;

				System.out.println("Number of steps :" + totalSteps);

			} else {
				System.out.println(adventurerToGold);
			}
			break;

		}

		}
	}

	public static int numberOfStepss(char[][] charArray, int[] adventurer, int[] gold, ArrayList<String> pits) {

		int n = 5;
		int m = 4;

		int[] rowInc = { 1, 0, -1, 0 };
		int[] colInc = { 0, 1, 0, -1 };

		Deque<int[]> q = new ArrayDeque<>();
		ArrayList<String> visited = new ArrayList<>();

		if (adventurer[0] == gold[0] && adventurer[1] == gold[1]) {
			return 0;
		}

		q.add(adventurer);

		int count = 1;
		int next = 0;
		int level = 1;

		while (!q.isEmpty()) {
			int[] curr = q.poll();
			visited.add(curr[0] + "," + curr[1]);
			count--;

			for (int i = 0; i < 4; i++) {

				int row = curr[0] + rowInc[i];
				int col = curr[1] + colInc[i];

				if (row >= n || row < 0 || col >= m || col < 0) {
					continue;
				}

				if (row == gold[0] && col == gold[1]) {
					return level;
				}

				String key = String.valueOf(row + "," + col);
				if (visited.contains(key) || pits.contains(key)) {
					continue;
				}

				q.add(new int[] { row, col });
				next++;

			}

			if (count == 0) {
				count = next;
				next = 0;
				level++;
			}

		}

		return -1;

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
