import lib.Greeter;

import java.util.Random;

public class Main {


    public static void main(String[] args) {


        Greeter greeter = new Greeter();

        greeter.greet("Student");

        int numberOfIterations = 100;

        double pi = calculatePi(numberOfIterations);

        System.out.println("Pi is " + pi);
    }


    private static double calculatePi(int numberOfIterations) {

        int numberOfPointsInsideSquare = 0;
        int numberOfPointsInsideCircle = 0;

        double R = 0.5;

        Random random = new Random();


        for (int i = 0; i < numberOfIterations; i++) {
            numberOfPointsInsideSquare++;

            double x = random.nextDouble() - R;
            double y = random.nextDouble() - R;

            boolean isInCircle = x * x + y * y <= R * R;

            if (isInCircle) {
                numberOfPointsInsideCircle++;
            }

            //System.out.println("x = " + x + ", y = " + y);

        }

//        System.out.println("Number of points inside square: " + numberOfPointsInsideSquare);
//        System.out.println("Number of points inside circle: " + numberOfPointsInsideCircle);

        double pi = (double) numberOfPointsInsideCircle / numberOfPointsInsideSquare * 4;

        return pi;
    }
}