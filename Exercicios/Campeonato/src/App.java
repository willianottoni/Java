import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {

        String nomes[] = new String[5];
        int matriz[][] = new int[5][4];
        int soma = 0;
        Scanner teclado = new Scanner(System.in);

        for (int i = 0; i < nomes.length; i++) {
            teclado = new Scanner(System.in);

            nomes[i] = Entrada.entrada("Informe o nome do atleta");

            for (int j = 0; j < 4; j++) {
                if (j == 3) {
                    matriz[i][j] = soma;
                } else {
                    matriz[i][j] = Entrada.entradaInt("Informe a pontuação: ");
                    soma += Calculos.somaPontos(matriz[i][j]);
                }
            }
            soma = 0;
        }

        for (int i = 0; i < nomes.length; i++) {
            System.out.println("\nNome: " + nomes[i]);
            for (int j = 0; j < 4; j++) {
                if (j == 3) {
                    System.out.println("Pontuação Total: " + matriz[i][j]);
                } else {
                    System.out.println("Pontuação: " + matriz[i][j]);
                }
            }
        }

        teclado.close();
    }
}
