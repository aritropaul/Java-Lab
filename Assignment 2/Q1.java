import primespackage.Primes;

public class Q1{
    public static void main(String args[]){
        Primes a = new Primes();
        int prime1 = 0;
        int prime2 = 0;
        for (int i=1;i<=10;i++){
            if (a.checkForPrime(i) && prime1 == 0){
                prime1 = i;
            }
            else if (a.checkForPrime(i) && prime1 != 0){
                prime2 = i;
                if (prime2-prime1 == 2){
                    System.out.println("("+prime1+", "+prime2+")");
                }
                prime1 = prime2;
                prime2 = 0;
            }
        }
    }
}