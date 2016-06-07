package test_3;

import java.math.BigInteger;

public class Factorial {

	public static void main(String[] args) {
		
		System.out.println("Sum of the digits in the number 100! = " + getSum(100));
    }

    private static long getSum(int n) {
        BigInteger fact = BigInteger.ONE;
        for (int i = 2; i <= n; i++) {
            fact = fact.multiply(BigInteger.valueOf(i));
        }
        System.out.println(n + "! = " + fact);
        long sum = 0;
        while (fact.compareTo(BigInteger.ZERO) > 0) {
            sum += fact.mod(BigInteger.TEN).longValue();
            fact = fact.divide(BigInteger.TEN);
        }
        return sum;
		
		
	}

}
