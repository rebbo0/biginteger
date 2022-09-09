package bsp1;

import java.math.BigInteger;

public class TestBigInteger {
    public static void main(String[] args) {
        BigInteger eins = new BigInteger("11111111111111111111111111111111111111111111111111111111111111");
        BigInteger zwei = new BigInteger("22222222222222222222222222222222222222222222222222");
        System.out.println(eins.add(zwei));
        System.out.println(eins.multiply(zwei));

        BigInteger drei = new BigInteger("11");
        System.out.println(drei.toString(2));

        String numb="";
        for (int i = 0; i < 100; i++) {
            numb+="10";
        }
        BigInteger vier = new BigInteger(numb, 2);
        System.out.println(vier.toString(2));
        System.out.println(vier.toString(10));

        BigInteger funf = new BigInteger("6220528841");
        System.out.println("Prime? "+funf.isProbablePrime(1));
        BigInteger sechs = new BigInteger("6220528840");
        System.out.println("Prime? "+sechs.isProbablePrime(1));

        long long1 = 6220528841L;
        long long2 = 6220528840L;
        long start = System.currentTimeMillis();
        boolean check = true;
        for (int i = 2; i <= Math.sqrt(long1); i++) {
            if (long1 % i == 0) {
                check = false;
            }
        }
        if (check){
            System.out.println(long1+" isprime");
        }
        else
            System.out.println(long1+" isnoprime");
        check = true;

        for (int i = 2; i <= Math.sqrt(long2); i++) {
            if (long2 % i == 0) {
                check = false;
            }
        }
        if (check){
            System.out.println(long2+" isprime");
        }
        else
            System.out.println(long2+" isnoprime");

        long end = System.currentTimeMillis();
        System.out.println("Time taken: " + (end - start));

    }
}
