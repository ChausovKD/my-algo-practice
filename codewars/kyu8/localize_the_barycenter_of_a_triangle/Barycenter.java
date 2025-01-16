package kyu8.localize_the_barycenter_of_a_triangle;

// Link: https://www.codewars.com/kata/5601c5f6ba804403c7000004/train/java

public class Barycenter {

    public static double[] barTriang(double[] x, double[] y, double[] z) {
        double pointX = (double) Math.round((x[0] + y[0] + z[0]) / 3.0 * 10000.0) / 10000.0;
        double pointY = (double) Math.round((x[1] + y[1] + z[1]) / 3.0 * 10000.0) / 10000.0 ;
        return new double[] {pointX, pointY};
    }
}
