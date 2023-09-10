package school.mjc.stage0.loops.task2;

public class FactorialNumbers {
    public void printFactorialRow(int printToInclusive) {
        long factorial = 1;
        int i = 0;

        while (i <= printToInclusive) {
            System.out.println(factorial);
            i++;
            factorial *= i;
        }
    }
}
