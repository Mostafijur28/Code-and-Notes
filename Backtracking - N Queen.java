class Solution {

    public static boolean isSafe(int row, int col, char[][] board){

        //prev cols of same row
        for(int i=col-1; i>=0; i--){
            if(board[row][i] == 'Q')
            return false;
        }

        //upper lefter diagonal
        for(int i=row-1,j=col-1; i>=0&&j>=0; i--,j--){

            if(board[i][j] == 'Q')
            return false;
        }

        //downward lefter diagonal
        for(int i=row+1,j=col-1; i<board.length && j>=0; i++,j--){

            if(board[i][j] == 'Q')
            return false;
        }

        return true;

    }
    public static void helper(int col, char[][] board,  List<List<String>> ans){

        if(col == board.length){
           
            List<String> L = new ArrayList<>();
            
            for(int i=0; i<board.length; i++){
              
              String s = "";

              for(int j=0; j<board[0].length; j++){
                s += board[i][j];
              }
            
              L.add(s);
            }

            ans.add(L);
            return;
        }

        int n = board.length;

        for(int row = 0; row<n; row++){

            if(isSafe(row,col,board) == true){
                
                board[row][col] = 'Q';
                helper(col+1, board, ans);
                board[row][col] = '.';

            }
        }
    }
    public List<List<String>> solveNQueens(int n) {
        
        char[][] board = new char[n][n];
        List<List<String>> ans = new ArrayList<>();

        for(int i=0; i<n; i++){

            for(int j=0; j<n; j++)
            board[i][j] = '.';
        }

        helper(0, board, ans);

        return ans;

    }
}