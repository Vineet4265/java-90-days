package day08;

import java.util.Scanner;

public class Largestandsmallest {
     public static int getLargest(int matrix[][]){
        int largest = Integer.MIN_VALUE;
        int smallest = Integer.MAX_VALUE;
        for(int i = 0; i<matrix.length; i++){
            for(int j = 0; j<matrix[0].length; j++){
                if( largest < matrix[i][j]){
                    largest = matrix[i][j];
                }
                if(smallest > matrix[i][j]){
                    smallest = matrix[i][j];
                }
            }
        }
        System.out.println("Smallest is at "+smallest);
       return largest;
    }
        public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int matrix[][] = new int[3][3];
        int n = matrix.length, m = matrix[0].length;
        for(int i = 0; i<n; i++){
            for(int j = 0; j<m; j++){
                matrix[i][j] = sc.nextInt();
            }
        }
        for(int i = 0; i<n; i++){
            for(int j = 0; j<m; j++){
                System.out.print(matrix[i][j]+" ");
            }
            System.out.println();
        }
        sc.close();
        System.out.println("Largest is at "+getLargest(matrix));
    }  
}
