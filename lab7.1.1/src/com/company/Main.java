package com.company;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int v []=new int[n];
        for ( int i = 0; i < n; i++)
            v[i]=scanner.nextInt();
        int s;
        n=n-1;
        s = suma(v,n);
        System.out.println(s);
    }
    private static int suma(int [] v , int n){
        if (n < 0)
            return 0;
        else
            return v[n]+suma(v,n-1);
    }
}
