package net.htlgkr.SaurerP190201.siebdeseratosthenes;

public class EratosthenesPrimeSieve implements PrimeSieve{

    int obergrenze;
    public EratosthenesPrimeSieve(int o)
    {
        this.obergrenze=o;
    }

    @Override
    public boolean isPrime(int p) {
        return false;
    }

    @Override
    public void printPrimes()
    {

    }
}
