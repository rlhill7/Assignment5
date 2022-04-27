package main;

public class RandomNumberGenerator {
    public static int randomNumberGenerator(int min, int max){
        double r = Math.random();
        int randomNumb = (int)(r * (max - min)) + min;
        return randomNumb;
    }
}
