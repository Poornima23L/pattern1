package com.tgt.ignite.plus;

import java.util.Scanner;

public class star {
    public static void main(String[] args)
    {
        int i,j,n;
        Scanner read= new Scanner(System.in);
        System.out.println("enter value of n");
        n = read.nextInt();
        for(i=1;i<=n;i++)
        {
            for(j=1;j<=i;j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
