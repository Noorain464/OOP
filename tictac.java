package OOP;

import java.util.Scanner;

public class tictac {
    @SuppressWarnings("resource")
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = 3;
        
        char board[][] = new char[n][n];
        System.out.println("Enter");
        String p1 = sc.nextLine();
        System.out.println("Enter");
        String p2 = sc.nextLine();

        Boolean turn  = true;

        for(int i =0;i<n;i++){
            for(int j = 0;j<n;j++){
                board[i][j] = '-';
            }
        }

        
        int countofmoves = 0;
        while(true){
            char sym;
            while(true){
                if(turn){
                    System.out.println("Player1,please make your turn");
                }
                else{
                    System.out.println("Player2,please make your turn");
                }
                
                if(turn){
                    sym = '0';
                }
                else{
                    sym = 'X';
                }
                System.out.println("please input the row");
                int r = sc.nextInt();
                System.out.println("please input the column");
                int c = sc.nextInt();
                if(r<0 || r>=n || c<0 || c>=n){
                    System.out.println("Invalid move");
                }
                else if(board[r][c] != '-'){
                    System.out.println("This cell is already occupied");
                }
                else{
                    board[r][c] = sym;
                    countofmoves++;
                    break;
                }
            }
            if(Winner(board, sym)){
                System.out.println("Winner is " + sym);
                break;
            }
            else if(countofmoves == 9){
                System.out.println("Draw");
            }
            turn = !turn;
        }

        displayBoard(board);
    }
    public static void displayBoard(char[][] board){
        for(int i = 0; i<board.length;i++){
            for(int j = 0;j<board.length;j++){
                System.out.println(board[i][j]);
            }
            System.out.println();
        }
    }
    // n^2 complexity
    public static boolean Winner(char[][] board,char sym){
        for(int i = 0;i<board.length;i++){
            if(board[i][0] == sym && board[i][0] == board[i][1] && board[i][1] == board[i][2]){
                return true;
            }else if(board[0][i] == sym && board[0][i] == board[1][i] && board[1][i] == board[2][i]){
                return true;
            }
            else if(board[i][i] == sym){
                return true;
            }
        }

        return false;
    }
}