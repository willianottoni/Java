import java.util.Scanner;
import javax.swing.JOptionPane;

public class App {
    public static void main(String[] args) throws Exception {
        /*ENTRADA VIA CONSOLE*/
        System.out.println("Digite seu nome"); /* Entrada de dados */
        Scanner entrada = new Scanner(System.in); /* Habilitar leitura do teclado*/
        String nome = entrada.nextLine(); /* Atribuição da entrada na variável*/
        System.out.println("Bom dia, " + nome); /* Saída de dados */
        entrada.close(); /*Fechamento da leitura */

        //ENTRADA VIA INTERFACE GRÁFICA
        String idade; /* Declaração de variável*/
        idade = JOptionPane.showInputDialog(" Digite a sua idade ");
        int idadeAtual, anoNascimento; /* Declaração de variável*/
        idadeAtual = Integer.parseInt(idade); /* Conversão de string para inteiro*/
        anoNascimento = 2022 - idadeAtual;
        System.out.println(nome + " você nasceu em " + anoNascimento);

        }
}
