import javax.swing.JOptionPane;

public class Entrada {

    // Função de entrada de dados genérica
    static String entrada(String mensagem) {
        String aux;
        aux = JOptionPane.showInputDialog(mensagem);

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
                Saida.saida("Digitação Inválida!");
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
                Saida.saida("Digitação Inválida!");
                erro = true;
            }
        } while (erro);

        return c;
    }

}// Fim da classe Entrada
