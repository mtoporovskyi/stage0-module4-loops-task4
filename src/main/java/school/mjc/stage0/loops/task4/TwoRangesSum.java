package school.mjc.stage0.loops.task4;

public class TwoRangesSum {
    public void printSumOfTwoRanges(int numberToSkip, int lastInRow) {
        int counter = 0, skipSum = 0, avoidSkipSum = 0;

        if (lastInRow < 0) {
            System.out.println("last number in row is negative");
        } else if (numberToSkip > lastInRow) {
            System.out.println("number to skip is bigger then the last");
        } else {
            while (counter <= lastInRow) {
                if (counter <= numberToSkip) {
                    skipSum += counter;
                } else {
                    avoidSkipSum += counter;
                }
                counter++;
            }
            System.out.println("skipped sum is " + skipSum);
            System.out.println("counted sum is " + avoidSkipSum);
        }
    }
}
