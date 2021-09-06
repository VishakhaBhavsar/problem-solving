package com.exxample.java;

import java.util.HashMap;
import java.util.HashSet;

public class ValidSudoku {

	public static void main(String[] args) {
		
		char[][] matrix = new char[][] {
				new char[] {'8','3','.','.','7','.','.','.','.'},
				new char[] {'6','.','.','1','9','5','.','.','.'},
				new char[] {'.','9','8','.','.','.','.','6','.'},
				new char[] {'8','.','.','.','6','.','.','.','3'},
				new char[] {'4','.','.','8','.','3','.','.','1'},
				new char[] {'7','.','.','.','2','.','.','.','6'},
				new char[] {'.','.','6','.','.','.','2','8','.'},
				new char[] {'.','.','.','4','1','9','.','.','5'},
				new char[] {'.','.','.','.','8','.','.','7','9'}
		};
		
		
		System.out.println(isValidSudoku(matrix));
	}

	public static boolean isValidSudoku(char[][] board) {
		
		HashSet<String> seen = new HashSet<String>();
		
		for (int i = 0; i < board.length; i++) {
			for (int j = 0; j < board.length; j++) {
				char current_val = board[i][j];
				if(current_val != '.') {
					if(!seen.add(current_val + " found in row " + i) ||
							!seen.add(current_val + " found in column " + j) ||
							!seen.add(current_val + " found in sub box " + i/3 + " - " + j/3))
								return false;
				}
			}
		}
        return true;
    }
}
