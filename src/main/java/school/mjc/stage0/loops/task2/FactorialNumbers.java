package school.mjc.stage0.loops.task2;

public class FactorialNumbers {


    public void printFactorialRow(int printToInclusive) {
        int factorial = 1;
        int count = 0;

        while (count <= printToInclusive) {
            if (count == 0) {
                System.out.println(1);
            } else {

                factorial *= count;
                System.out.println(factorial);

            }
            count++;

        }
    }
}
