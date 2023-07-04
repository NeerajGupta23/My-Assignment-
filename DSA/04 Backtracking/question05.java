// Ans 05: 

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class question05 {
         
    public boolean isSafe(char[][] chessboard, int i, int j) {
        // 1.) checking upper linear element
        for(int k = i-1; k >= 0; k--)
            if(chessboard[k][j] == 'Q')
                return false;
 

        // 2.) checking the upper top left linear element 
        int i1 = i - 1, j1 = j - 1;
        for( ; i1 >= 0 && j1 >= 0; j1--, i1--) {
            if(chessboard[i1][j1] == 'Q')
                return false;
        }
    
        
        // 3.) checking the upper top right linear element 
        i1 = i - 1;
        j1 = j + 1;
        int size = chessboard.length-1;
        for( ; i1 >= 0 && j1 <= size; i1--, j1++) {
            if(chessboard[i1][j1] == 'Q')
                return false;
        }


        return true; 
    }
    
    ArrayList<char[][]> ar = new ArrayList<>(); 
    public void backtracking(char[][] chessboard, int row, int size) {
        if(row == (size+1)) {
            char[][] newArray = new char[chessboard.length][chessboard.length];
            for (int i = 0; i < newArray.length; i++) {
                for (int j = 0; j < newArray.length; j++) {
                    newArray[i][j] = chessboard[i][j];
                }
            }
            ar.add(newArray);
            return;
        }
        
        for(int j = 0; j <= size; j++) {
            if(isSafe(chessboard, row, j)) {
                chessboard[row][j] = 'Q';
                
                backtracking(chessboard, row+1, size) ;

                // backtracking 
                chessboard[row][j] = '.';
            }
        }
    }
    
    
    public List<List<String>> solveNQueens(int n) {
        char[][] chessboard = new char[n][n];
        for(int i = 0; i < n; i++)
            for(int j = 0; j < n; j++)
                chessboard[i][j] = '.';

        int size = chessboard.length-1;
        backtracking(chessboard, 0, size);

        
        List<List<String>> bigAns = new ArrayList<>();
        List<String> ans;
        String str;
        Iterator<char[][]> itr = ar.iterator();
        while (itr.hasNext()) {
            chessboard = itr.next();

            ans  = new ArrayList<>();
            for(int i = 0; i <= size; i++) {
                str = "";
                for(int j = 0; j <= size; j++) {
                    if(chessboard[i][j] == '.')
                        str += '.';
                    else 
                        str += 'Q';
                }
                ans.add(str);
            }
            bigAns.add(ans);
        }
        return bigAns;
    }

    public static void main(String[] args) {
        question05 r= new question05();
        List<List<String>> ans = r.solveNQueens(4);
        System.out.println(ans + " : "  + ans.size());
    }
}
