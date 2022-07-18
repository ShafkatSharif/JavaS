/*
5.	Print the following pattern:
*
+++
*****
+++++++
*********
*/
package labmannualsol;

import java.util.Scanner;

public class lab3task5 { public static void main(String[] args) {
    Scanner in = new Scanner (System.in);
    int i , j ;
    char c='+';
    for(i = 1; i<=9 ; i+=2)
    {
        if(c=='+') c='*';
        else  c ='+';
        for (j=1;j<=i;j++)
        {
            {System.out.print(c);}
        }
        System.out.println();
    }
}
}
