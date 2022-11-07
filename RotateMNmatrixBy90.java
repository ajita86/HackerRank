import java.util.*;

public class Solution {
    
    public static void main(String args[]) {
        int arr[][] = {{1,2,3,7},{4,5,6,8},{7,8,9,10}};
        for(int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++){
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();
        arr = rotate(arr);
        for(int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++){
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
    
    public static int[][] rotate(int[][] input) {

        int n =input.length;
        int m = input[0].length;
        int [][] output = new int[m][n];
        
        for (int i=0; i<n; i++)
        	for (int j=0;j<m; j++)
        		output [j][n-1-i] = input[i][j];
        		
        return output;
    }

}
