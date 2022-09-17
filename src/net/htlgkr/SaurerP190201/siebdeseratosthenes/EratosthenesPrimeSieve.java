package net.htlgkr.SaurerP190201.siebdeseratosthenes;

import java.util.ArrayList;

public class EratosthenesPrimeSieve implements PrimeSieve{

    int obergrenze;
    ArrayList<Integer> primes = new ArrayList<>();
    public EratosthenesPrimeSieve(int o)
    {
        this.obergrenze=o;
    }

    @Override
    public boolean isPrime(int p)
    {
        return false;
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
