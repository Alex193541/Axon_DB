import java.util.Scanner;

public class CalculadoraImc2 {
public static void main(String[] args) {
    
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite seu Peso (kg): ");
        double peso = scanner.nextDouble();

        System.out.print("Digite sua Altura (mt): ");
        double altura = scanner.nextDouble();

        double imc = peso / (altura * altura);

        System.out.print("Seu IMC é: " + imc);

        scanner.close();
    }
}
