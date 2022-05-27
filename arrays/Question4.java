package arrays;

import java.util.Scanner;

/// Write a program to find Diagonal of matrix and display sum of digits of matrix

public class Question4 {

  public static void main(String[] args) {
      
      Scanner sc = new Scanner(System.in);

      int rows = sc.nextInt();
      int cols =sc.nextInt();
      
      int a[][] = new int [rows][cols];
     

      System.out.println("enter array a : ");
      for(int i=0; i<rows; i++){
          for(int j=0; j<cols; j++){
              a[i][j] =sc.nextInt();
          }
      }
      

      System.out.println("print array a : ");
      for(int i=0; i<rows; i++){
          for(int j=0; j<cols; j++){
             System.out.print(a[i][j] + " ");
          }
          System.out.println();
      }
      
      int sum =0;

      for(int i=0; i<rows; i++){
          for(int j=0; j<cols; j++){
              if(i==j){
                  sum = sum + a[i][j];
              }
          }
      }
      System.out.println("Sum of Daigonal is : " +sum);

  }
  
}
