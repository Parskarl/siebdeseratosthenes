package net.htlgkr.SaurerP190201.siebdeseratosthenes;

import java.util.ArrayList;

public class EratosthenesPrimeSieve implements PrimeSieve{

    public int obergrenze;
    ArrayList<Integer> primes = new ArrayList<>();

    public EratosthenesPrimeSieve(int o)
    {
        this.obergrenze=o;
    }

    @Override
    public boolean isPrime(int p)
    {
        if(p==0){return false;}
        for (int i = 2; i < p; i++)
        {
            if (p % i == 0)
            {
                return false;
            }
        }
        if(primes.contains(p)){return true;}
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
