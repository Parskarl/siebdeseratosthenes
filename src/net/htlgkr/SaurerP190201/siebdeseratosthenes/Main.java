package net.htlgkr.SaurerP190201.siebdeseratosthenes;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static ArrayList<Integer> zahlenbisoberg;
    public static ArrayList<Integer> noprimes;

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Geben sie ihre Obergrenze Für die Primzahlberechnung ein:");
        int eingabe = Integer.parseInt(s.nextLine());
        EratosthenesPrimeSieve eps = new EratosthenesPrimeSieve(eingabe);
        zahlenbisoberg = new ArrayList<>();
        noprimes = new ArrayList<>();
        for (int i = 2; i <= eps.obergrenze; i++) {
            zahlenbisoberg.add(i);
        }
        int whileTrue =0;
        while(whileTrue< eps.obergrenze)
        {
            sieben(zahlenbisoberg, eps);
            whileTrue++;
        }
        eps.printPrimes();
        System.out.println("Keine Primzahlen sind:");
        for (int p : noprimes) {
            System.out.println(p);
        }
    }

    public static void sieben(ArrayList<Integer> list, EratosthenesPrimeSieve eps) {
        for (int i : list) {
            if (eps.isPrime(i)) {
                int copyi = i;
                int multipli = 2;
                int tempz = 0;
                while (tempz < eps.obergrenze - 1) {
                    tempz = copyi * multipli;
                    if (tempz > eps.obergrenze){break;}
                    multipli++;
                    if(zahlenbisoberg.contains(tempz)){Integer integer = tempz;zahlenbisoberg.remove(integer);return;}
                    if (!noprimes.contains(tempz)) {
                        noprimes.add(tempz);
                    }
                }
            }
        }
    }
    /*for(int i: zahlenbisoberg)
        {
            if(eps.isPrime(i))
            {
                int copyi =i;
                int multipli = 2;
                int tempz=0;
                while(tempz<eps.obergrenze-1)
                {
                    tempz=copyi*multipli;
                    if(tempz>eps.obergrenze){break;}
                    multipli++;
                    //if(zahlenbisoberg.contains(tempz)){Integer integer = tempz;zahlenbisoberg.remove(integer);}
                if(!noprimes.contains(tempz)){noprimes.add(tempz);}
                }
            }*/
                /*int z =i;
                int multipli = 2;
                int tempz=0;
                while(tempz<99)
                {
                    tempz=z*multipli;
                    multipli++;
                    System.out.println(tempz);
                    int zeahler =0;
                    for(int s:zahlenbisoberg)
                    {
                        if(s==tempz){zahlenbisoberg.remove(zeahler);break;}
                        zeahler++;
                    }
                }
               */
}
