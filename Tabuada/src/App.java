import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner entrada = new Scanner (System.in); /*Habilitando teclado para receber valor*/

        int number;

        do {
            System.out.println("\nDigite um número para calcular a tabuada:");
            number = entrada.nextInt(); /*Atribuindo valor de entrada na variável*/

            if (number < 1 || number > 10) {
                System.out.println("\nDigite um número somente entre 1 e 10. Tente novamente.");
            }
        } while (number < 1 || number > 10);
        
        System.out.println("\nDigite um número máximo para a multiplicação:");
        int numberMax = entrada.nextInt();

        System.out.println("\nDigite um número mínimo para a multiplicação:");
        int numberMin = entrada.nextInt();

        System.out.println("\nTABUADA DO " + number + ":");
        /* Uso do comando for para repetição */
        for (int i = numberMin; i <= numberMax; i++){
            System.out.println(number + " x " + i + " = " + (number * i));
        }
    }
}
