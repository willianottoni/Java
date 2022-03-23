public class App {
    public static void main(String[] args) throws Exception {
        String nome = "Luciano";
        String nome2 = "Luciano";

        if (nome == nome2) {
            System.out.println("Nomes iguais!");
        } else
            System.out.println("Nomes diferentes!");

        if (nome == "Luciano") {
            System.out.println("Nomes iguais!");
        } else
            System.out.println("Nomes diferentes!");

        if (nome.equals(nome2)) {
            System.out.println("Nomes iguais!");
        } else
            System.out.println("Nomes diferentes!");

    }
}
