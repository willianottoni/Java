import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        String nomeFuncionario, d, s;
        float salarioTotal = 0.0f, salarioBruto = 0.0f;
        int numDependentes = 0, acrescimo = 0;
        boolean erro = false;
        Scanner teclado = new Scanner(System.in);

        System.out.println("Informe o nome do funcionário: ");
        nomeFuncionario = teclado.nextLine();

        do {
            System.out.println("Informe o número de dependentes: ");
            d = teclado.nextLine();
            erro = false;

            try {
                numDependentes = Integer.parseInt(d);
            } catch (RuntimeException e) {
                System.out.println("Você não forneceu um valor numérico, tente novamente!");
                erro = true;
            }
        } while (erro);

        do {
            System.out.println("Informe o valor bruto do salário R$ ");
            s = teclado.nextLine();
            erro = false;

            try {
                salarioBruto = Float.parseFloat(s);
            } catch (RuntimeException e) {
                System.out.println("Você não forneceu um valor numérico, tente novamente!");
                erro = true;
            }
        } while (erro);

        acrescimo = numDependentes * 65;
        salarioTotal = acrescimo + salarioBruto;

        System.out.printf(
                "O funcionário %s, responsável por %d dependentes com salário mensal de R$ %.2f receberá um acréscimo de R$ %d, totalizando um salário total de R$ %.2f",
                nomeFuncionario, numDependentes, salarioBruto, acrescimo, salarioTotal);

    }
}
