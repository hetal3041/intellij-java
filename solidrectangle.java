package com.company;
import java.util.*;

public class solidrectangle {

    public static void main(String[] args) {
        // write your code here
        int m = 4;
        int n = 5;
        //outer loop
        for(int i=1 ; i<=m; i++){
            //inner loop
            for(int j=1; j<=n; j++){
                System.out.print("*"); //we want to print in same line so its "print"
            }
            System.out.println("*");  //we want to print in next line so its "println"
        }
    }
}

