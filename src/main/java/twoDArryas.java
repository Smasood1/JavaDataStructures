import java.util.Arrays;

public class twoDArryas {
    public static void main(String[] args) {

        //building a tic tac toe game using 2d arrays

        char[][] board = new char [3][3];

        //fill the array board
        for(int i = 0; i <3; i++){
            for (int j = 0; j < 3; j++){
                board[i][j] = '-';
            }

        }
        //another way to create the board above

        char [][] boardTwo = new char[][]{
                new char []{'0','-','-'},
                new char []{'0','-','-'},
                new char []{'0','-','-'},
        };

        System.out.println(Arrays.deepToString(boardTwo));
        //print out the array
        //since the array is 2d we have to use .deeptostring
        board[0][0] = '0';
        board[1][0] = '0';
        board[2][0] = '0';
        System.out.println(Arrays.deepToString(board));
    }
}
