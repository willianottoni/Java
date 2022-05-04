import javax.swing.JOptionPane;

public class App {
    public static void main(String[] args) throws Exception {
        int numero;
        String texto;
        double altura;
        char caracter;
        double a, b, area;

        a = Entrada.entradaDouble("Digite a altura do retangulo");
        b = Entrada.entradaDouble("Digite a base do retangulo");
        area = Calculos.areaRetangulo(a, b);
        Saida.saida("A area do retangulo é " + area);

        // Entrada de texto comum
        texto = Entrada.entrada("Digite um texto");

        // Entrada de número inteiro com verificação
        numero = Entrada.entradaInt("Digite um número inteiro");

        // Entrada de número decimal com verificação
        altura = Entrada.entradaDouble("Digite a altura com decimal");

        // Entrada de número decimal com verificação
        caracter = Entrada.entradaChar("Digite uma letra");

        JOptionPane.showMessageDialog(null, "\nTexto: " + texto + "\n" + "Número: " + numero + "\n" +
                "Altura: " + altura + "\n" + "Letra: " + caracter, "Dados Registrados",
                JOptionPane.INFORMATION_MESSAGE);
    }
}
