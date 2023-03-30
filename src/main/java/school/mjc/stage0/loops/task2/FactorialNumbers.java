package school.mjc.stage0.loops.task2;

public class FactorialNumbers {
    public void printFactorialRow(int printToInclusive) {
        int factorial = 1;
        int count = 1;
        if (printToInclusive == 0) {
            System.out.println(factorial);
        } else {
            while (count <= printToInclusive) {
                factorial *= count;
                System.out.println(factorial);
                count++;
            }
        }
    }
}
