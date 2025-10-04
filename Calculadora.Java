import java.util.Scanner; //Linha 1

public class Matematica {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); //Linha 6

        System.out.print("Digite o primeiro número: "); //Linha 8
        double numero1 = scanner.nextDouble();          //Linha 9

        System.out.print("Digite o segundo número: ");  //Linha 11
        double numero2 = scanner.nextDouble(); 
        
        System.out.print("Digite o terceiro número: ");  //Linha 11
        double numero3 = scanner.nextDouble();
        
        double resultado= numero1* numero2* numero3;
        
        System.out.println("Resultado: " + resultado); 
    
    
        
        
        
    }
}
