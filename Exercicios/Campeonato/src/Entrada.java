import java.util.Scanner;

public class Entrada {
    
    // Função de entrada de dados genérica
    static String entrada(String mensagem) {
        Scanner teclado = new Scanner(System.in);
        String aux;

        System.out.println("\n" + mensagem);
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
                Saida.saida("Digitação Inválida!");
                erro = true;
            }
        } while (erro);

        return num;
    }

}// Fim da classe Entrada
