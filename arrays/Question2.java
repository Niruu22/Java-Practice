package arrays;

import java.util.Scanner;

//program to 3*3 matrix & convert or display transpose matrix

 public class Question2 {
 public static void main(String[] args) {
     
     Scanner sc = new Scanner (System.in);

     int arr [][] = {{1,2,3,}, {4,5,6}, {7,8,9}};
     int trans[][] = new int [3][3];

     for(int i=0; i<3; i++){
         for(int j=0; j<3; j++){
             trans[i][j] = arr[j][i];
         }
     }

     System.out.println("pinting without transpose ");   
     for(int i=0; i<3; i++){
         for(int j=0; j<3; j++){
             System.out.print(arr[i][j] + " ");
         }
         System.out.println();
     }


     System.out.println("pinting with transpose ");   
     for(int i=0; i<3; i++){
         for(int j=0; j<3; j++){
             System.out.print(trans[i][j] + " ");
         }
         System.out.println();
     }
 
 
 }
 
}
