
public class RatInMaze {

    static int mazePath(int sr, int sc , int er,int ec ){
        if(sr>er|| sc>ec) return 0 ; 
        if(sr==er && sc==ec) return 1 ;
        int downways = mazePath(sr+1, sc, er, ec) ;
        int rightways = mazePath(sr, sc+1, er, ec);
        int totalways = downways +rightways ; 
        return totalways ; 
    }

    static void printPath(int sr, int sc , int er,int ec,String s ){
        if(sr>er|| sc>ec) return  ; 
        if(sr==er && sc==ec){ System.out.println(s); return ;}
       printPath(sr+1, sc, er, ec,s+"D") ;
      printPath(sr, sc+1, er, ec, s+"R");
    }

        // 4 path with using backtracking
    static void print(int sr,int sc,int er,int ec,String s,boolean isVisited[][]){
        if(sr<0 || sc<0) return ; 
        if(sr>er || sc>ec) return ; 
        if(isVisited[sr][sc]==true) return ; 
        if(sr==er && sc==ec) System.out.println(s);

        isVisited[sr][sc] = true ; 
        print(sr, sc+1, er, ec, s+"R", isVisited);
        print(sr+1, sc, er, ec, s+"D", isVisited);
        print(sr, sc-1, er, ec, s+"L", isVisited);
        print(sr-1, sc, er, ec, s+"U", isVisited);
        isVisited[sr][sc] = false ; 
    }
    public static void main(String[] args) {
        int row = 3 ; 
        int col = 3 ; 
       print(0,0, row-1, col-1, "", new boolean[row][col]);
    }    
}
