
package chap4;

import java.util.Scanner;


public class SootCoon {
    
     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("--------------------------Multiplication Table----------------------------------------------- \n");
        System.out.print("1\t2\t3\t4\t5\t6\t7\t8\t9\t10\t11\t12\n");
        System.out.print("---------------------------------------------------------------------------------------------\n");
        int [][]a = new int [12][13];
        for (int i = 1 ; 2 < a.length ;i++)
        {
            for(int j = 0 ; j < a.length ; j++)
            {
                a[i][j] = (i+1)*(j+1);
                System.out.print(a[i][j]+  "\t");
               
            }
            
            System.out.println();
        }
}
     
}
