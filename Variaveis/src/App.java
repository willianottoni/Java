import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        preencheVetor();

    }

    static void preencheVetor () {
        String[] nomes = new String[2];
        Scanner teclado = new Scanner(System.in);
        
        //Para descobrir a quantidade de elementos no vetor use: length

        for (int i = 0; i < nomes.length; i++) {
            System.out.println("Informe seu nome: ");
            nomes[i] = teclado.nextLine();
        }

        teclado.close();

        for (int i = 0; i < nomes.length; i++) {
            System.out.println("Nome " + i + " => " + nomes[i]);
        }
    }

    static void calculaGasto(){
        String nome;
        float salario, gasto, saldo,sobraDia;
        Scanner teclado = new Scanner(System.in);

        System.out.println("Informe seu nome: ");
        nome = teclado.nextLine();

        System.out.println("\nInforme seu salário: R$ ");
        salario = teclado.nextFloat();

        System.out.println("\nInforme seu gasto mensal: R$ ");
        gasto = teclado.nextFloat();
        teclado.close();

        saldo = salario - gasto;
        sobraDia = saldo / (float)30;

        if(saldo < 0) {
            System.out.println("\n" + nome + ", você fechou o mês negativo, tome cuidado!");
        } else {
            if (saldo > 0){
                System.out.println("\n" + nome + ", você fechou o mês positivo, com sobra de R$ " + saldo) ;
                System.out.println("A sobra por dia foi de R$ " + sobraDia);
            }
            else {
                System.out.println("\n" + nome + ", você gastou tudo que ganhou, tome cuidado!");
            }
        }

    }

    static void testeVariavel () {
                // DECLARAÇÃO DE VARIÁVEIS
                int numeroInteiro; 
                float numeroDecimal, resultado;
                String cadeiaDeCaracteres;
                char umaLetra;
                Scanner teclado = new Scanner(System.in);// Variável para entrada de dados pelo teclado
        
                // ENTRADA DE DADOS
                System.out.print("Digite um valor numérico inteiro:\n");
                numeroInteiro = teclado.nextInt();
        
                System.out.println("\nDigite um valor numérico com decimal (,):");
                numeroDecimal = teclado.nextFloat();
        
                System.out.println("\nDigite uma palavra:");
                cadeiaDeCaracteres = teclado.next();
        
                System.out.println("\nDigite uma letra:");
                umaLetra = teclado.next().charAt(0); // charAt retorna o caracter no índice especificado em uma string
                teclado.close();
        
                // SAÍDA DE DADOS
                System.out.println("\nRESULTADO");
                System.out.println("\nInteiro -> " + numeroInteiro);
                System.out.println("Decimal -> " + numeroDecimal);
                System.out.println("String -> " + cadeiaDeCaracteres);
                System.out.println("Char -> " + umaLetra);
                System.out.println(numeroDecimal / numeroInteiro);
        
                resultado = 20 / (float) numeroInteiro; // conversão para float
                System.out.println(resultado);
    }
}
