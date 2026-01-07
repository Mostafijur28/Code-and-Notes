class Solution {
    
    public static boolean isValid(int r, int c, char[][]board, char ch){

        for(int col = 0; col<9; col++){

            if(col == c)
            continue;

            if(board[r][col] == ch)
            return false;
        }

        for(int row = 0; row<9; row++){

            if(row == r)
            continue;

            if(board[row][c] == ch)
            return false;
        }

        int r1 = (r/3)*3;
        int r2 = r1+2;
        int c1 = (c/3)*3;
        int c2 = c1+2;

        for(int i=r1; i<=r2; i++){
            for(int j=c1; j<=c2; j++){

                if(board[i][j] == ch){
                    return false;
                }
            }
        }

        return true;
    }
    public static boolean helper(int r, int c, char[][]board){
         
         if(r == 9)
         return true;

         if(board[r][c] != '.'){

            if(c+1 < 9){
                return helper(r,c+1,board);
            }
            else
                return helper(r+1,0,board);
         }

         for(char ch='1'; ch<='9'; ch++){

            //System.out.println(ch);

            if(isValid(r,c,board,ch) == true){
                board[r][c] = ch;

                if(c+1 < 9){
                    if(helper(r,c+1,board) == true)
                    return true;
                }
                else{
                    if(helper(r+1,0,board) == true)
                    return true;
                }

                board[r][c] = '.';
                
            }
         }

         return false;
    }

    public void solveSudoku(char[][] board) {
        
        helper(0,0, board);
    }
}