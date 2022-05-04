import javax.swing.JOptionPane;

public class Saida {

    static void saida(String mensagemSaida) {
        // System.out.println(mensagemSaida);
        JOptionPane.showMessageDialog(null, mensagemSaida, "Atenção", JOptionPane.WARNING_MESSAGE);
    }

}// Fim da classe Saida
