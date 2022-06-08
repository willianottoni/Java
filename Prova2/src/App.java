import javax.swing.JOptionPane;

public class App {
    static float matriz1[][] = new float[3][4];
    static float matriz2[][] = new float[3][4];

    public static void main(String[] args) throws Exception {
        startMatriz(matriz1);
        startMatriz(matriz2);
        fillMatriz();
        mult(matriz1);
        showResult();
    }

    static void startMatriz(float matriz[][]) {
        for (int i = 0; i < matriz.length; i++) {
            for (int c = 0; c < matriz[i].length; c++) {
                matriz[i][c] = 0;
            }
        }
    }

    static void fillMatriz() {
        for (int i = 0; i < matriz1.length; i++) {
            for (int c = 0; c < matriz1[i].length; c++) {

                boolean erro = false;

                do {
                    try {
                        String aux = entrada("Digite um número");
                        matriz1[i][c] = Float.parseFloat(aux);
                        erro = false;

                    } catch (RuntimeException e) {
                        saida("Digitação Inválida, tente novamente!");
                        erro = true;
                    }
                } while (erro);

            }
        }
    }

    static String entrada(String mensagem) {
        String aux;
        aux = JOptionPane.showInputDialog(mensagem);

        return aux;
    }

    static void saida(String mensagemSaida) {
        JOptionPane.showMessageDialog(null, mensagemSaida, "Atenção", JOptionPane.WARNING_MESSAGE);
    }

    static void mult(float matriz[][]) {
        int num = 0;
        boolean erro = false;

        do {
            try {
                String aux = entrada("Digite um número inteiro para multiplicar a matriz");
                num = Integer.parseInt(aux);
                erro = false;

            } catch (RuntimeException e) {
                saida("Digitação Inválida, tente novamente!");
                erro = true;
            }
        } while (erro);

        for (int i = 0; i < matriz.length; i++) {
            for (int c = 0; c < matriz[i].length; c++) {
                matriz2[i][c] = matriz[i][c] * num;
            }
        }
    }

    static void showResult() {
        System.out.println("\nMatriz preenchida pelo usuário");
        for (int i = 0; i < matriz1.length; i++) {
            System.out.println();
            for (int c = 0; c < matriz1[i].length; c++) {
                System.out.printf("%.2f\t", matriz1[i][c]);
            }
        }

        System.out.printf("\n\nMatriz multiplicada");
        for (int i = 0; i < matriz2.length; i++) {
            System.out.println();
            for (int c = 0; c < matriz2[i].length; c++) {
                System.out.printf("%.2f\t", matriz2[i][c]);
            }
        }
    }

}
