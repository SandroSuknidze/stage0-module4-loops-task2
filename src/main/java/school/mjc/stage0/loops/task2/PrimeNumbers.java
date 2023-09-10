package school.mjc.stage0.loops.task2;

public class PrimeNumbers {
    public void printPrimeNumbers(int printToInclusive) {
        int num = 2;
        while (num <= printToInclusive) {
            boolean isPrime = true;
            int divisor = 2;
            while (divisor < num) {
                if (num % divisor == 0) {
                    isPrime = false;
                    break;
                }
                divisor++;
            }
            if (isPrime && num > 1) {
                System.out.println(num);
            }
            num++;
        }
    }
}
