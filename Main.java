import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Conversor de Monedas (10 países)");
        System.out.print("Moneda base (ej: USD): ");
        String base = scanner.nextLine().toUpperCase();

        System.out.print("Moneda destino (ej: EUR): ");
        String target = scanner.nextLine().toUpperCase();

        System.out.print("Cantidad: ");
        double amount = scanner.nextDouble();

        try {
            double result = CurrencyConverter.convert(base, target, amount);
            System.out.printf("Resultado: %.2f %s = %.2f %s\n", amount, base, result, target);
        } catch (Exception e) {
            System.out.println("Error al convertir moneda: " + e.getMessage());
        }
    }
}