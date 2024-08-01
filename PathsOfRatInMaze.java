package Recursion;
public class PathsOfRatInMaze {
    private static void print(int sr, int sc, int er, int ec, String s) {
        if(sr>er||sc>ec) return ;
        if(sc==ec && sr==er) {
          System.out.println(s);
          return;
        }
      //go right
      print(sr, sc+1, er, ec, s+"R");
       //go down
      print(sr+1, sc, er, ec, s+"D");
      }
      public static void main(String[] args) {
          int rows = 3;
          int cols = 3;
         print(1,1,rows-1,cols-1,"");
      }
}
