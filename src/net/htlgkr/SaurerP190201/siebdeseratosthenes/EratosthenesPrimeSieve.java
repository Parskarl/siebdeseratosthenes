package net.htlgkr.SaurerP190201.siebdeseratosthenes;

import java.util.ArrayList;

public class EratosthenesPrimeSieve implements PrimeSieve{

    public int obergrenze;
    ArrayList<Integer> primes = new ArrayList<>();
    public static ArrayList<Integer> zahlenbisoberg;

    public void sieb()
    {
        zahlenbisoberg = new ArrayList<>();
        for (int i = 2; i <= obergrenze; i++)
        {
            zahlenbisoberg.add(i);
        }
    }

    public EratosthenesPrimeSieve(int o)
    {
        this.obergrenze=o;
    }

    @Override
    public boolean isPrime(int p)
    {
        for (int i = 2; i < p; i++)
        {
            if (p % i == 0)
            {
                return false;
            }
        }
        primes.add(p);
        return true;
    }

    @Override
    public void printPrimes()
    {
        for(int p:primes)
        {
            System.out.println(p);
        }
    }
}
