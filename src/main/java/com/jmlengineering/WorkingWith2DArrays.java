package com.jmlengineering;

import java.util.Arrays;

public class WorkingWith2DArrays {
    public static void main(String[] args) {
        char[][] board = new char[3][3];
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                board[i][j] = '-';
            }
        }

        board[0][0] = 'O';
        board[0][1] = 'X';
        board[1][0] = 'O';
        board[1][1] = 'O';
        board[1][2] = 'X';
        board[2][0] = 'O';
        board[2][2] = 'X';
        System.out.println(Arrays.deepToString(board));
    }
}
