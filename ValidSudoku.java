package practice;

import java.util.HashSet;
import java.util.Set;

public class ValidSudoku {
	/*
	 * Determine if a Sudoku is valid, according to: Sudoku Puzzles - The Rules.
The Sudoku board could be partially filled, where empty cells are filled with the character '.'.
Note:
A valid Sudoku board (partially filled) is not necessarily solvable. 
Only the filled cells need to be validated.
	 */
 public boolean isValidSudoku(char[][] board) {
	Set haveadded=new HashSet();
    boolean flag=true;
    for(int i=0;i<9;i++){
      for(int j=0;j<9;j++) {
    	  if(board[i][j]!='.') {
    		  String b="("+board[i][j]+")";
    		  if(!haveadded.add(b+i)||!haveadded.add(j+b)||!haveadded.add(i/3+b+j/3))
    			  return false;
    	  }
      }
    }
    return flag;
 }
   public static void main(String[]args) {
	   char[][]board={{5,3,'.','.',7,'.','.','.','.'},
			          {'6','.','.','1','9','5','.','.','.'},
			          {'.','9','8','.','.','.','.','6','.'},
			          {'8','.','.','.','6','.','.','.','3'},
			          {'4','.','.','8','.','3','.','.','1'},
			          {'7','.','.','.','2','.','.','.','6'},
			          {'.','6','.','.','.','.','2','8','.'},
			          {'.','.','.','4','1','9','.','.','5'},
			          {'.','.','.','.','8','.','.','7','9'}
			          };
	   ValidSudoku v1=new ValidSudoku();
	   System.out.print(v1.isValidSudoku(board));
   }
}
