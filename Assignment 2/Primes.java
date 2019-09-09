package primespackage;

import java.lang.Math;

public class Primes {
    public boolean checkForPrime(int n) {
        if (n==1){
            return false;
        }
        for (int i = 2;i <= n/2; i++){
            if (n%i==0){
                return false;
            }
        }
        return true;
    }
}