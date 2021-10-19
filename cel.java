import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        // celsius -----> fahrenheit

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter temperature in degree celsius: ");
        float temperatureCelsius = scanner.nextFloat();

        float temperatureFahrenheit = (temperatureCelsius * 9/5) + 32;

        System.out.printf("\n%.2f C = %.2f F\n",temperatureCelsius, temperatureFahrenheit);
    }
}
