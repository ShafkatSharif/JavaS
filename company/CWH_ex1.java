package com.company;
import java.util.*;

public class CWH_ex1 {
   public static void main(String[] args) {
      System.out.println("Enter 5 numbers ");
      Scanner s = new Scanner (System.in);
      int a = s.nextInt();
      int b = s.nextInt();
      int c = s.nextInt();
      int d = s.nextInt();
      int e = s.nextInt();
      float sum = a+b+c+d+e;
      System.out.println("Enter the full marks of each subject ");
      int full = s.nextInt();
      int total = full*5;
      float avg= sum/5;
      float percent = (sum/total)*100;
      System.out.println("Percentage is "+percent);





   }
}
