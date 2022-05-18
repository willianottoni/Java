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

        System.out.println("\n\nDADOS PREENCHIDOS");
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

        int[][] aux = new int[1][4];

        for (int i = 0; i < nomes.length - 1; i++) {
            for (int j = i + 1; j < nomes.length; j++) {
                if (matriz[i][3] < matriz[j][3]) {
                    aux[0] = matriz[i];
                    matriz[i] = matriz[j];
                    matriz[j] = aux[0];
                    String taux = nomes[i];
                    nomes[i] = nomes[j];
                    nomes[j] = taux;
                }
            }
        }

        System.out.println("\n\nDADOS ORDENADOS");
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
