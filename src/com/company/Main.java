package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ievadiet n: ");
        int n = sc.nextInt();
        int[] virkne = new int[n+1];
        virkne[0] = 0;
        virkne[1] = 1;
        System.out.print(virkne[1] + " ");

        for (int i = 2; i <= n; i++) {
            virkne[i] = virkne[i-2] + virkne[i-1];
            System.out.print(virkne[i] + " ");
        }

        System.out.println("\n" + virkne[n]);
    }
}
