// progam for printing elements in spiral martrix 

import java.util.*;


public class SpiralMatrix{

    public static void Spiral(int matrix[][]){
        int firstrow=0;
        int firstcol=0;
        int lastrow=matrix.length-1;
        int lastcol=matrix[0].length-1;

        while(firstrow<=lastrow && firstcol<= lastcol){


            // top 
            for(int j=firstcol;j<=lastcol;j++){
                System.out.print(matrix[firstrow][j]+ " ");
            }

            //right
            for(int i=firstrow+1;i<=lastrow;i++){
                System.out.print(matrix[i][lastcol]+" ");
            }

            //bottom
            for(int j=lastcol-1;j>=firstcol;j--){
                if(firstrow==lastrow){
                    break;
                }
                System.out.print(matrix[lastrow][j]+" ");
            }

            //left
            for(int i=lastrow-1;i>=firstrow+1;i--){
                if(firstcol==lastcol){
                    break;
                }
                System.out.print(matrix[i][firstcol]+" ");
            }
            firstrow++;
            firstcol++;
            lastrow--;
            lastcol--;
        }
      
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the size of Matrix: ");
        int n=sc.nextInt();
        int m=sc.nextInt();

        int array[][]=new int[n][m];
        System.out.print("Enter the array elements: ");
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                array[i][j]=sc.nextInt();
            }
        }
       Spiral(array);
    }
}
