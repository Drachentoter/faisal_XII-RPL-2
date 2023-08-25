import java.util.Scanner;

public class TugasPakjimi1CelciusConvert {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("masukan celsius: ");
        double celsius = scanner.nextDouble();
        double fahrenheit = celsiusToFahrenheit(celsius);
        double kelvin = celsiusToKelvin(celsius);
        System.out.println("Celcius jadi fahrenheit: " + fahrenheit + ("\n"));
        System.out.println("Celcius jadi Kelvin: " + kelvin);
    }

    public static double celsiusToFahrenheit(double celsius) {
        return (celsius * 9 / 5) + 32;
    }

    public static double celsiusToKelvin(double celsius) {
        return celsius + 273.15;
    }
}
