package main;

/**
 * Random number generator class for seeding the runs.
 */
public class RandomNumberGenerator {
    /**
     * Generates the numbers.
     * @param min the mininum value
     * @param max the maximum
     * @return the generated number
     */
    public static int randomNumberGenerator(int min, int max) {
        double r = Math.random();
        int randomNumb = (int)(r * (max - min)) + min;
        return randomNumb;
    }
}
