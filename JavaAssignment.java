//  1) Using a single loop

 import java.util.Scanner
 public class Main{
    public static void main(String[] args) {
        int rows = 4; 
        int columns = 12;

        for (int i = 0; i < rows; i++) {
            StringBuilder row = new StringBuilder(); 
            for (int j = 0; j < columns; j++) {
                if (j < 4) {
                   row.append("*"); // Green stripe
                } else if (j < 4) {
                    row.append("="); // White stripe
                } else {
                     row.append("*"); // Green stripe
                }
            }
            System.out.println(row); 
        }
    }
}
 
 
// Using a nested loop

import java.util.Scanner
public class NigerianFlagNestedLoop {
    public static void main(String[] args) {
        int height = 4;
        int width = 12;

        for (int i = 0; i < height; i++) {
            for (int j = 0; j < width; j++) {
                if (j < 4 || j >= 8) {
                    System.out.print("*"); // Green part
                } else {
                    System.out.print("="); // White part
                }
            }
            System.out.println();
        }
    }
}


// 2) Using a single loop
 
import java.util.Scanner
public class AmericanFlagSingleLoop {
    public static void main(String[] args) {
        int height = 6;
        
        for (int i = 0; i < height; i++) {
            if (i < 3) {
                System.out.println("****=======");
            } else {
                System.out.println("===========");
            }
        }
    }
}


// Using a nested loop
import java.util.Scanner 
public class AmericanFlagNestedLoop {
    public static void main(String[] args) {
        int height = 6;
        int width = 10;

        for (int i = 0; i < height; i++) { 
            for (int j = 0; j < width; j++) {
                if (i < 3 && j < 4) {
                    System.out.print("*"); // Stars section
                } else {
                    System.out.print("="); // Stripes section
                }
            }
            System.out.println();
        }
    }
}


// 3) 
import java.util.Arrays;
public class StatisticsCalculator {
    public static void main(String[] args) {
        int[] data = {2, 5, 5, 9, 4, 7, 9, 6, 11, 12};

        // Calculate mean
        double mean = calculateMean(data);
        System.out.println("Mean: " + mean);

        // Calculate median
        double median = calculateMedian(data);
        System.out.println("Median: " + median);

        // Calculate standard deviation
        double stdDev = calculateStandardDeviation(data, mean);
        System.out.println("Standard Deviation: " + stdDev);
    }

    // Method to calculate the mean
    public static double calculateMean(int[] data) {
        double sum = 0;
        for (int num : data) {
            sum += num;
        }
        return sum / data.length;
    }

    // Method to calculate the median
    public static double calculateMedian(int[] data) {
        Arrays.sort(data);
        int n = data.length;
        if (n % 2 == 0) {
            // Even number of elements: average of the two middle elements
            return (data[n / 2 - 1] + data[n / 2]) / 2.0;
        } else {
            // Odd number of elements: middle element
            return data[n / 2];
        }
    }

    // Method to calculate the standard deviation
    public static double calculateStandardDeviation(int[] data, double mean) {
        double sumSquaredDifferences = 0;
        for (int num : data) {
            sumSquaredDifferences += Math.pow(num - mean, 2);
        }
        return Math.sqrt(sumSquaredDifferences / data.length);
    }
}




// 4) 
 import java.util.Scanner;

public class UserInputArray {
    public static void main(String[] args) {
        // Declare an array of length 10
        int[] numbers = new int[10];
        Scanner scanner = new Scanner(System.in);

        // (a) Accept input from the user and store in the array
        for (int i = 0; i < numbers.length; i++) {
            System.out.print("Enter a number for index " + i + ": ");
            numbers[i] = scanner.nextInt();
        }

        // (b) Print out the input using a for-each loop
        System.out.println("\nNumbers entered by the user:");
        for (int num : numbers) {
            System.out.println(num);
        }

        scanner.close();
    }
}




// 5)
 import java.util.Scanner;
public class TwoDArrayExample {
    public static void main(String[] args) {
        // Declare a 2D array of size 10x10
        int[][] array = new int[10][10];

        // Create a Scanner object for user input
        Scanner scanner = new Scanner(System.in);

        // Part (a): Assign elements to the array with user input
        System.out.println("Enter elements for a 10x10 array:");
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                System.out.print("Enter element for index [" + i + "][" + j + "]: ");
                array[i][j] = scanner.nextInt();
            }
        }

        System.out.println("\nElements of the array:");
        for (int[] row : array) {
            for (int element : row) {
                System.out.print(element + " ");
            }
            System.out.println();
        }

        scanner.close();
    }
}

