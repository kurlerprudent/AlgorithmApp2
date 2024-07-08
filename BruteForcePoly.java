import java.util.Scanner;

public class BruteForcePoly {
    public void calculatePolynomial() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the degree of the polynomial: ");
        int n = scanner.nextInt();
        double[] coefficients = new double[n + 1];
        System.out.println("Enter the coefficients of the polynomial (from lowest to highest degree):");
        for (int i = 0; i <= n; i++) {
            coefficients[i] = scanner.nextDouble();
        }
        System.out.print("Enter the value of x: ");
        double x = scanner.nextDouble();
        double result = 0;
        for (int i = 0; i <= n; i++) {
            result += coefficients[i] * Math.pow(x, i);
        }
        System.out.println("The value of the polynomial at x = " + x + " is: " + result);
        
    }
}