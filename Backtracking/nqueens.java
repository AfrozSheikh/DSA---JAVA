public class nqueens {

  static  boolean isSafe(char [][] board , int row, int col){
        //check row
        int n = board.length ;
        for(int j= 0 ; j< n ; j++){
            if(board[row][j] == 'q') return false ; 
        }
        for(int k = 0 ; k<n ; k++){
            if(board[k][col] =='q') return false ;
        }
        // check north east ; 
        int i = row ; int j = col ; 
        while (i>=0 && j<n) {
            if(board[i][j] =='q') return false ; 
            i-- ; j++ ; 
        }

          // check south east ; 
           i = row ;  j = col ; 
          while (i<n && j<n) {
              if(board[i][j] =='q') return false ; 
              i++ ; j++ ; 
          }

          // check south west ; 
          i = row ;  j = col ; 
          while (i<n && j>=0) {
              if(board[i][j] =='q') return false ; 
              i++ ; j-- ; 
          }

          // check south east ; 
          i = row ;  j = col ; 
          while (i>=0&& j>=0) {
              if(board[i][j] =='q') return false ; 
              i-- ; j--; 
          }
          return true ; 
    }
    static void nqeen(char [][] board , int row){
        int n = board.length ;
        if(row == n){
            for(int i= 0 ; i< n ; i++){
                for(int j = 0 ;j<n; j++){
                    System.out.print(board[i][j] );
                }
                System.out.println();
            }
            System.out.println();
            return ; 
        }
        for(int j=0 ; j<n ; j++){
           
            if(isSafe(board,row,j))  {
                board[row][j] = 'q' ;
                nqeen(board, row+1);
                board[row][j] = 'x' ;
            }
        }
    }
    public static void main(String[] args) {
        int  n =4  ;
        
        char [][] board = new char[n][n] ; 
        for(int i= 0 ; i< n ; i++){
            for(int j = 0 ;j<n; j++){
                board[i][j] = 'x' ;
            }
        }
        nqeen(board,0) ; 
    }
}
