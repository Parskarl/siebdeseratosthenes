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
        //if((p%2)==0) {return false;}
        //if((p%3)==0) {return false;}
        //if((p%5)==0) {return false;}
        //if((p%7)==0) {return false;}
        //if((p%11)==0) {return false;}

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
