package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        double a = in.nextDouble();
        double b = in.nextDouble();
        double c = in.nextDouble();
        double r = in.nextDouble();

        double norm = Math.sqrt(a * a + b * b);
        a /= norm;
        b /= norm;

        double x0, y0;
        if (b != 0) {
            x0 = 0;
            y0 = -c / b;
        } else {
            x0 = -c / a;
            y0 = 0;
        }

        double x1 = -r * b + x0;
        double y1 = r * a + y0;
        double x2 = r * b + x0;
        double y2 = -r * a + y0;

        double a1 = a;
        double b1 = b;
        double c1 = -(a1 * x1 + b1 * y1);

        double a2 = a;
        double b2 = b;
        double c2 = -(a2 * x2 + b2 * y2);

        System.out.printf("%.6f %.6f %.6f\n", a1, b1, c1);
        System.out.printf("%.6f %.6f %.6f\n", a2, b2, c2);

    }
}