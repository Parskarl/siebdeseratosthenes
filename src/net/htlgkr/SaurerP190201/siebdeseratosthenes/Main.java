package net.htlgkr.SaurerP190201.siebdeseratosthenes;

import java.util.ArrayList;

public class Main
{
    public static ArrayList<Integer> zahlenbisoberg;
    public static ArrayList<Integer> noprimes;
    public static void main(String[] args)
    {
        EratosthenesPrimeSieve eps = new EratosthenesPrimeSieve(100);
        zahlenbisoberg = new ArrayList<>();
        noprimes = new ArrayList<>();
        for (int i = 2; i <= eps.obergrenze; i++)
        {
            zahlenbisoberg.add(i);
        }
        for(int i: zahlenbisoberg)
        {
            if(eps.isPrime(i))
            {
                int z =i;
                int multipli = 2;
                int tempz=0;
                while(tempz<eps.obergrenze-1)
                {
                    tempz=z*multipli;
                    if(tempz>=eps.obergrenze){break;}
                    multipli++;
                    if(!noprimes.contains(tempz)){noprimes.add(tempz);}
                }
            }
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
        eps.printPrimes();
        System.out.println("Keine Primzahlen sind:");
        for(int p:noprimes)
        {
            System.out.println(p);
        }
    }
}
