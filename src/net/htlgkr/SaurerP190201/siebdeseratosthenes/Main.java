package net.htlgkr.SaurerP190201.siebdeseratosthenes;

import java.util.ArrayList;

public class Main
{

    public static ArrayList<Integer> zahlenbisoberg;
    public static void main(String[] args)
    {
        EratosthenesPrimeSieve eps = new EratosthenesPrimeSieve(100);
        zahlenbisoberg = new ArrayList<>();
        for (int i = 2; i <= eps.obergrenze; i++)
        {
            zahlenbisoberg.add(i);
        }
        for(int i: zahlenbisoberg)
        {
            eps.isPrime(i);
        }
        eps.printPrimes();
    }
}
