package WEEK1.Data_Structure.FinancialForcasting;

import java.util.Scanner;


public class FinancialForecastingTool {



    public static double calculateFutureValue(double currentValue, double growthRate, int years) {
        // Base case: if no years are left, return the current value
        if (years == 0) {
            return currentValue;
        }

        // Recursive case: calculate value for one year, then continue
        return calculateFutureValue(currentValue * (1 + growthRate), growthRate, years - 1);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Financial Forecasting Tool");

        System.out.print("Enter current value: ");
        double currentValue = scanner.nextDouble();

        System.out.print("Enter annual growth rate in percentage: ");
        double growthRatePercentage = scanner.nextDouble();

        System.out.print("Enter number of years to forecast: ");
        int years = scanner.nextInt();

        double growthRate = growthRatePercentage / 100;

        double futureValue = calculateFutureValue(currentValue, growthRate, years);

        System.out.printf("Predicted future value after %d years: %.2f%n", years, futureValue);

        scanner.close();
    }
}
