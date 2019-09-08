package primespackage;

import java.lang.Math;

public class Primes {
    boolean checkForPrime(int n) {
        for (int i = 0;i < Math.sqrt(n); i++){
            if (n%i==0){
                return false;
            }
        }
        return true;
    }
}