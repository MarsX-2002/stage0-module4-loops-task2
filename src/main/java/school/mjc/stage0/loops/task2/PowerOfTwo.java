package school.mjc.stage0.loops.task2;

public class PowerOfTwo {
    public void printPower(int power) {
        int count = 0;
        int result = 1;
        while (count <= power){
            System.out.println(result);
            result*=2;
            count++;
        }
    }
}
