import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        String nome[] = new String[4];
        String cidade[] = new String[4];
        String paisVisitado[] = new String[4];
        float valorViagem[] = new float[4];
        float valorRestaurante[] = new float[4];
        float valTotViagem = (float) 0.00;
        float valMedioViagem = (float) 0.00;
        float valTotRestaurante = (float) 0.00;
        float valMedioRestaurante = (float) 0.00;
        int quantBrasil = 0, quantEUA = 0, quantPortugal = 0, quantAlemanha = 0;
        boolean erro = false;
        Scanner teclado = new Scanner(System.in);

        for (int i = 0; i < nome.length; i++) {// INICIO DO FOR
            teclado = new Scanner(System.in);
            System.out.println("\nInforme seu nome: ");
            nome[i] = teclado.nextLine();

            System.out.println("Informe sua cidade: ");
            cidade[i] = teclado.nextLine();

            do {
                System.out.println("Informe o país visitado: ");
                paisVisitado[i] = teclado.nextLine();

                if (!paisVisitado[i].equalsIgnoreCase("Brasil") && !paisVisitado[i].equalsIgnoreCase("EUA")
                        && !paisVisitado[i].equalsIgnoreCase("Portugal")
                        && !paisVisitado[i].equalsIgnoreCase("Alemanha")) {
                    erro = true;
                    System.out.println("Digitar somente Brasil, EUA, Portugal ou Alemanha!");
                } else {
                    erro = false;
                }

            } while (erro);

            do {
                System.out.println("Informe o valor gasto na viagem: R$ ");
                String t = teclado.nextLine();
                erro = false;

                try {
                    valorViagem[i] = Float.parseFloat(t);
                } catch (RuntimeException e) {
                    System.out.println("Você não forneceu um número!");
                    erro = true;
                }

            } while (erro);

            do {
                System.out.println("Informe o valor gasto com restaurantes na viagem: R$ ");
                String p = teclado.nextLine();
                erro = false;

                try {
                    valorRestaurante[i] = Float.parseFloat(p);
                } catch (RuntimeException e) {
                    System.out.println("Você não forneceu um número!");
                    erro = true;
                }

            } while (erro);

            if (paisVisitado[i].equalsIgnoreCase("Brasil")) {
                quantBrasil += 1;
            } else {
                if (paisVisitado[i].equalsIgnoreCase("EUA")) {
                    quantEUA += 1;
                } else {
                    if (paisVisitado[i].equalsIgnoreCase("Portugal")) {
                        quantPortugal += 1;
                    } else {
                        if (paisVisitado[i].equalsIgnoreCase("Alemanha")) {
                            quantAlemanha += 1;
                        }
                    }
                }
            }

            valTotViagem += valorViagem[i];
            valTotRestaurante += valorRestaurante[i];
        } // FIM DO FOR

        valMedioViagem = valTotViagem / valorViagem.length;
        valMedioRestaurante = valTotRestaurante / valorRestaurante.length;

        // RESULTADOS
        System.out.println("\nLETRA A:");
        System.out.println("Valor Total da Viagem das 4 pessoas: R$ " + valTotViagem);

        System.out.println("\nLETRA B:");
        System.out.println("Valor Médio das Viagens das 4 pessoas: R$ " + valMedioViagem);

        System.out.println("\nLETRA C:");
        System.out.println("Valor Total gasto com Restaurantes das 4 pessoas: R$ " + valTotRestaurante);

        System.out.println("\nLETRA D:");
        System.out.println("Valor Médio gasto com Restaurantes das 4 pessoas: R$ " + valMedioRestaurante);

        System.out.println("\nLETRA E:");
        System.out.println("Quantidade de Pessoas que foram para os EUA: " + quantEUA);

        System.out.println("\nLETRA F:");
        System.out.println("Quantidade de Pessoas que foram para Portugal: " + quantPortugal);

        System.out.println("\nLETRA G:");
        System.out.println("Quantidade de Pessoas que foram para a Alemanha: " + quantAlemanha);

        System.out.println("\nLETRA H:");
        System.out.println("Quantidade de Pessoas que foram para o Brasil: " + quantBrasil);

        System.out.println("\nLETRA I:");
        for (int i = 0; i < nome.length; i++) {
            System.out.println("\nNome: " + nome[i]);
            System.out.println("Cidade: " + cidade[i]);
            System.out.println("País visitado: " + paisVisitado[i]);
            System.out.println("Valor gasto na viagem: R$ " + valorViagem[i]);
            System.out.println("Valor gasto com restaurante: R$ " + valorRestaurante[i]);
        }
    }
}
