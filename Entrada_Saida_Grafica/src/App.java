import javax.swing.JOptionPane;

public class App {
    public static void main(String[] args) throws Exception {
        String valor;
        valor = JOptionPane.showInputDialog("Digite seu nome");

        JOptionPane.showMessageDialog(null, "Olá " + valor);

        JOptionPane.showMessageDialog(null, "mensagem", "Título", JOptionPane.ERROR_MESSAGE);

        JOptionPane.showMessageDialog(null, "Texto da mensagem da janela", "Texto do título da janela",
                JOptionPane.INFORMATION_MESSAGE);

    }
}
