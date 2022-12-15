//program to find the sum of the elements in primary and secondary diagonal of the n*n matrix 

import java.util.*;

public class SumOfDiagonal{

    public static int find(int matrix[][]){
        int sum=0;

        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[0].length;j++){

                if(i==j){
                    sum+=matrix[i][j];
                }
                else if(i+j==matrix.length-1){
                    sum+=matrix[i][j];
                }
            }

        }
        return sum;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the size of Matrix: ");
        int n=sc.nextInt();
        int m=sc.nextInt();

        int array[][]=new int[n][m];
        if(n==m){
System.out.print("Enter the array elements: ");
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                array[i][j]=sc.nextInt();
            }
        }
        System.out.print(find(array));
    }
    else{
        System.out.println("not possible to find for this matrix");
    }
   
}
}