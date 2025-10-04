import java.util.Scanner;

public class Conversor {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o valor da temperatura (em Celsius): ");
        double celsius = scanner.nextDouble();

        double fahrenheit = (celsius * 9 / 5) + 32;

        System.out.println();
        System.out.println("O valor da temperatura em Fahrenheit é: " + fahrenheit + "°F");
        System.out.println(celsius + "°C = " + fahrenheit + "°F");

        scanner.close(); 
    }
}
