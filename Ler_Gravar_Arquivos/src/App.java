import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

public class App {
    public static void main(String[] args) throws Exception {
        Path caminhoLeitura = null;
        Path caminhoGravacao = null;
        System.out.println("Programa para ler e gravar informações em arquivos textos.");

        // comando para acessar o arquivo
        caminhoLeitura = Paths.get("src/entrada.txt");

        try {
            List<String> dados = Files.readAllLines(caminhoLeitura); // comando para ler o arquivo
            String mensagem = "";
            for (String texto : dados) {
                mensagem += texto + "\n";
            }

            caminhoGravacao = Paths.get("src/saida.txt");
            // comando para gravar no arquivo
            Files.write(caminhoGravacao, mensagem.getBytes(StandardCharsets.UTF_8), StandardOpenOption.CREATE_NEW);

        } catch (IOException ex) {
            Logger.getLogger(App.class.getName()).log(Level.SEVERE, null, ex);
        }

    }
}
