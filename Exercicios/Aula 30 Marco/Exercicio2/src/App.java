import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        int numerosMegaSena[] = new int[61];
        boolean erro = false;
        String entrada;
        int jogos = 0;
        int aux = 0;
        Scanner teclado = new Scanner(System.in);

        for (int i = 1; i <= 6; i++) {
            System.out.println("Digite um número: ");
            entrada = teclado.nextLine();
            aux = Integer.parseInt(entrada);
            numerosMegaSena[aux]++;
        }

        for (int i = 0; i < 61; i++) {
            System.out.println("numero " + i + "=>" + numerosMegaSena[i] + "\n");
        }

    }
}
