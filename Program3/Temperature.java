package Program3;

import java.util.Scanner;

class TempInfo {
    void input(double[][] arr) {
        System.out.println(
                "Enter the highest temprature (in Celcius) recorded for the first 6 days in the month of JAN:");
        try (Scanner sc = new Scanner(System.in)) {
            for (int i = 0; i < 5; i++) {
                System.out.println("In city - " + (i + 1) + ":");
                for (int j = 0; j < 6; j++) {
                    arr[j][i] = sc.nextDouble();
                }
            }
        }
    }

    void highestAndLowest(double[][] arr) {
        double high = arr[0][0];
        double low = arr[0][0];

        int i, j, cityH = 0, cityL = 0, dayH = 0, dayL = 0;
        for (i = 0; i < 6; i++) {
            for (j = 0; j < 5; j++) {
                if (arr[i][j] >= high) {
                    high = arr[i][j];
                    cityH = j + 1;
                    dayH = i + 1;
                }
                if (arr[i][j] <= low) {
                    low = arr[i][j];
                    cityL = j + 1;
                    dayL = i + 1;

                }
            }
        }

        System.out
                .println("\nHighest Temp Was  : " + high + "  celcius on day -- " + dayH + "  in the city -- " + cityH);
        System.out
                .println("\nLowest Temp Was   :" + low + "  celcius on day -- " + dayL + "  in the city -- " + cityL);

    }
}

public class Temperature {

    public static void main(String[] args) {
        double[][] arr = new double[10][10];
        TempInfo t = new TempInfo();
        t.input(arr);
        t.highestAndLowest(arr);
    }
}