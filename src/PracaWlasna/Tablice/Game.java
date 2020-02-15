package PracaWlasna.Tablice;

import java.util.Scanner;

public class Game {
    public static int row, col;
    public static Scanner scan = new Scanner(System.in);
    public static char[][] board = new char[3][3];
    public static char turn = 'X';

    public static void main(String[] args) {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                board[i][j] = '_';

            }
        }

        Play();


    }

    public static void Play() {
        boolean playing = true;
        while (playing) {
            row = scan.nextInt() - 1;
            col = scan.nextInt() - 1;
            board[row][col] = turn;
            if (GameOver(row, col)) {
                playing = false;
                System.out.println("Game over! Player "  + turn + " wins!");
            }

            PrintBoard();

            if (turn == 'X')
                turn = '0';
            else
                turn = 'X';
        }
    }

    public static void PrintBoard() {
        for (int i = 0; i < 3; i++) {
            System.out.println();

            for (int j = 0; j < 3; j++) {
                if (j == 0)
                    System.out.print("| ");
                System.out.print(board[i][j] + " | ");
            }

        }
        System.out.println();
    }

    public static boolean GameOver(int rMove, int cMove) {
        // Check perpendicular victory
        if (board[0][cMove] == board[1][cMove]
                && board[0][cMove] == board[rMove][2])
            return true;
        if (board[rMove][0] == board[rMove][1]
                && board[rMove][0] == board[rMove][2])
            return true;
        // check diagonal victory
        if (board[0][0] == board[1][1] && board[0][0] == board[2][2]
                && board[1][1] != '_')
            return true;
        if (board[0][2] == board[1][1] && board[0][2] == board[2][0]
                && board[1][1] != '_')
            return true;
        return false;

    }
}
//Pierwsze co wczytuje nazwy graczy, potem tworze pole gry czyli tablice3x3
//Następnie pytam gracza pierwszego o jego ruch, musi podać go w formie pozycji na danym macierzu które pozniej zmienie np na wartość 1 ?
//To samo z graczem numer 2 , musze to jakos zapetlic aby najpierw pytalo pierwszego gracza o ruch, pozniej drugiego
//Nastepnie musze przeanalizowac czy w macierzu wystepuje np wlasnie 1 w wierszu po kolei, albo w kolumnie albo
// ukosie macierza czyli 00,11,22 itp
// Potem po wystapieniu wlasnie takiego ciagu wyrzucam napis "you win" i który gracz, jezeli nie to "draw"