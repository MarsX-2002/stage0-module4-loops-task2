package school.mjc.stage0.loops.task2;

public class PrimeNumbers {
    public void printPrimeNumbers(int printToInclusive) {
        int counter = 2;
        boolean isPrime = true;
        if (printToInclusive >= 2) {
            while (counter <= printToInclusive) {
//                checking if it is prime
//                e.i 2 * 3 = 6
//                2 <= sqrt(6)
                for (int i = 2; i <= Math.sqrt(counter); i++) {
                    if (counter % i == 0) {
                        isPrime = false;
                    }
                }

                if (isPrime) {
                    System.out.println(counter);
                }
                counter++;
            }
        }
    }
}
