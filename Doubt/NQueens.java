
import java.util.*;

public class NQueens {
    //N-QUEENS
    public class safeQuees {
        int n=4;
    }

    //save board function
    public void saveBoard(char[][] board, List<List<String>> allBoard){
        String row="";
        List<String> newBoard = new ArrayList<>();
        for (int i=0; i<board.length; i++){
            row = "";
            for(int j=0; j<board[0].length; j++){
                if(board[i][j] == 'Q'){
                    row += 'Q';
                }else{
                    row += '.';
                }
            }
            newBoard.add(row);
        }
        allBoard.add(newBoard);
    }
    //recursive function
    public void helper(char[][] board, List<List<String>> allBoard, int col){
        if(col == board.length){
            saveBoard(board, allBoard);
            return;
        }
        for(int row=0; row<board.length; row++){
            if(isSafe(row, col,board)){
                board[row][col] = 'Q';
                helper(board, allBoard, col+1);
                board[row][col] = '.';
            }
        }
    }

    //isSafe function
    public boolean isSafe(int row, int col, char[][] board){
        //horizontal
        for(int j=0; j<board.length; j++){
            if( board[row][j] == 'Q'){
                return false;
            }
        }
        //vertical
        for(int i=0; i<board[0].length; i++){
            if(board[i][col] == '.'){
                return false;
            }
        }
        //upper-left
        int r=row;
        for(int c=col; c>=0 && r>=0; c--, r--){
            if(board[r][c] == 'Q'){
                return false;
            }
        }
        //upper-right
        r =row;
        for(int c=col; c<board.length && r>=0; r--, c++){
            if(board[r][c] == 'Q'){
                return false;
            }
        }
        //lower-left
        r =row;
        for(int c=col; c>= 0 && r<board.length; r++, c--){
            if(board[r][c] == 'Q'){
                return false;
            }
        }
        //lower-right
        for(int c=col; c<board.length && r>=0; r++, c++){
            if(board[r][c] == 'Q'){
                return false;
            }
        }
        return true;
    }

    public List<List<String>> solveQueens(int n){
        List<List<String>> allBoard = new ArrayList<>();
        char[][] board = new char[n][n];
        helper(board, allBoard, 0);
        return allBoard;
    }

    
}
