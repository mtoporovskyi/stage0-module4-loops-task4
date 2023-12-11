package school.mjc.stage0.loops.task4;

public class SkippingThird {
    public void printUntilButThird(int lastPrinted) {
        int counter = 0;

        while (counter <= lastPrinted) {
            if (counter % 3 != 0) {
                System.out.println(counter);
            }
            counter++;
        }
    }
}
