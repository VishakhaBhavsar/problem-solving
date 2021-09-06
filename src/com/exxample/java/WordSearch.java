package com.exxample.java;

public class WordSearch {

	public static void main(String[] args) {
		char[][] board = {{'A','B','C','E'}, {'S','F','C','S'}, {'A','D','E','E'}};
		System.out.println(exists(board, "ABCB"));
		
	}
	
	public static boolean exists(char[][] board, String word) {
		for(int i = 0; i  < board.length; i++) {
			for(int j = 0; j < board[0].length; j++) {
				if(board[i][j] == word.charAt(0) && dfs(board, word, 0, i, j))
					return true;
			}
		}
		return false;
	}
	
	public static boolean dfs(char[][] board, String word, int count, int i, int j) {
		if(count == word.length())
			return true;
		
		if(i == -1 || i >= board.length || j == -1 || j >= board[0].length || board[i][j] != word.charAt(count))
			return false;
		
		char temp = board[i][j];
		board[i][j] = '*';
		
		boolean found = dfs(board, word, count + 1, i - 1, j) ||
						dfs(board, word, count + 1, i + 1, j) ||
						dfs(board, word, count + 1, i, j - 1) ||
						dfs(board, word, count + 1, i, j + 1);
		
		board[i][j] = temp;
		return found;
	}
}
