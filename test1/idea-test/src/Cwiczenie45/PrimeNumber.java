package Cwiczenie45;

public class PrimeNumber {

    public static void main(String[] args) {

        PrimeNumber prime = new PrimeNumber();
        System.out.println("Ilosc liczb pierwszych: " + prime.primeNumber(1234, 2345));


    }

    public int primeNumber(int start, int end) {
        int countPrime = 0;
        int countDiv = 0;
        for (int i = start; i <= end; i++) {
            countDiv=0;
            for (int j = 1; j <= end; j++) {
                if (i % j == 0)
                    countDiv++;

            }
            if (countDiv <= 2)
                countPrime++;
        }
        return countPrime;
    }

}
