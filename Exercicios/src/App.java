import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        String[] nome = new String[3];
        float[] media = new float[3];
        float[] nota1 = new float[3];
        float[] nota2 = new float[3];
        boolean erro = false;
        int qtAlunos;
        Scanner teclado = new Scanner(System.in);

        System.out.println("Informe a quantidadede de alunos para cálculo da média: ");
        qtAlunos = teclado.nextInt();

        for (int i = 0; i < qtAlunos; i++) {//INICIO DO FOR
            teclado = new Scanner(System.in);

            System.out.println("\nInforme seu nome: ");
            nome[i] = teclado.nextLine();

            do {
                System.out.println("Informe a primeira nota: ");
                String s = teclado.nextLine();
                erro = false;

                try { // TRATATIVA DO ERRO
                    nota1[i] = Float.parseFloat(s);
                } catch (RuntimeException e) {
                    System.out.println("Você não forneceu um número!");
                    erro = true;
                }

            } while (erro);

            do {
                System.out.println("Informe a segunda nota: ");
                String s = teclado.nextLine();
                erro = false;

                try { // TRATATIVA DO ERRO
                    nota2[i] = Float.parseFloat(s);
                } catch (RuntimeException e) {
                    System.out.println("Você não forneceu um número!");
                    erro = true;
                }

            } while (erro);
            

            media[i] = (nota1[i] + nota2[i]) / 2;
        }// FIM DO FOR

        // EXIBIÇÃO DE RESULTADOS
        System.out.println("\nRESULTADO");
        for (int i = 0; i < 3; i++) {
            System.out.println("\nNome: " + nome[i]);
            System.out.println("Nota 1: " + nota1[i]);
            System.out.println("Nota 2: " + nota2[i]);
            System.out.println("Média: " + media[i]);
        }
    }
}
