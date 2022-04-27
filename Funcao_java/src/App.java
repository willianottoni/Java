import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        int numero;
        String texto;
        double altura;
        char caracter;

        // Entrada de texto comum
        texto = entrada("Digite um texto");

        // Entrada de número inteiro com verificação
        numero = entradaInt("Digite um número inteiro");

        // Entrada de número decimal com verificação
        altura = entradaDouble("Digite a altura com decimal");

        // Entrada de número decimal com verificação
        caracter = entradaChar("Digite uma letra");

        System.out.println("\nTEXTO: " + texto + "\n" + "NÚMERO: " + numero + "\n" +
                "ALTURA: " + altura + "\n" + "LETRA: " + caracter);

    }

    // Função de entrada de dados genérica
    static String entrada(String mensagem) {
        String aux;
        Scanner teclado = new Scanner(System.in);

        System.out.println(mensagem);
        aux = teclado.nextLine();

        return aux;
    }

    // Função de entrada de dados número inteiro
    static int entradaInt(String mensagem) {
        String aux;
        int num = 0;
        boolean erro = false;

        do {
            try {
                aux = entrada(mensagem);
                num = Integer.parseInt(aux);
                erro = false;
            } catch (RuntimeException e) {
                System.out.println("Digitação Inválida!");
                erro = true;
            }
        } while (erro);

        return num;
    }

    // Função de entrada de dados número decimais
    static double entradaDouble(String mensagem) {
        String aux;
        double num = 0.0;
        boolean erro = false;

        do {
            try {
                aux = entrada(mensagem);
                num = Double.parseDouble(aux);
                erro = false;
            } catch (RuntimeException e) {
                System.out.println("Digitação Inválida!");
                erro = true;
            }
        } while (erro);

        return num;
    }

    static char entradaChar(String mensagem) {
        String aux;
        char c = ' ';
        boolean erro = false;

        do {
            aux = entrada(mensagem);
            if (aux.length() == 1) {
                c = aux.charAt(0);
                erro = false;
            } else {
                System.out.println("Digitação Inválida!");
                erro = true;
            }
        } while (erro);

        return c;
    }

}
