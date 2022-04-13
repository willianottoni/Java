import java.util.Scanner;

public class App {
    static Scanner teclado = new Scanner(System.in);

    private static String Digitacao(String texto) {
        System.out.println(texto);
        String t = teclado.nextLine();
        return t;
    }

    public static void main(String[] args) throws Exception {

        int vetor[] = new int[5];

        for (int i = 0; i < 5; i++) {
            String t2;
            t2 = Digitacao("Digite um número: ");
            vetor[i] = Integer.parseInt(t2);
        }

        for (int i = 0; i < vetor.length - 1; i++) {
            for (int c = (i + 1); c < vetor.length; c++) {
                if (vetor[i] > vetor[c]) {
                    int aux = vetor[i];
                    vetor[i] = vetor[c];
                    vetor[c] = aux;
                }
            }
        }

        for (int i = 0; i < vetor.length; i++) {
            System.out.print(" " + vetor[i]);
        }
    }
}
