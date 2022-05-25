import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

public class App {

    public static void main(String[] args) throws Exception {
        String url = "http://sinda.crn.inpe.br/PCD/SITE/novo/site/dadosCSV.php?id=30956";
        URL site;

        try {
            site = new URL(url);
            URLConnection conexao = site.openConnection();
            InputStreamReader entradaLeitura = new InputStreamReader(conexao.getInputStream());
            BufferedReader bufferLeitura = new BufferedReader(entradaLeitura);

            String linha;
            String mensagem = "";
            List<List<String>> registro;
            registro = new ArrayList<>();
            while ((linha = bufferLeitura.readLine()) != null) {
                mensagem += linha + "\n";
                String[] dados = linha.split(",");
                registro.add(Arrays.asList(dados));
            }

            Path caminhogravacao = Paths.get("src/saida.txt");
            Files.write(caminhogravacao, mensagem.getBytes(StandardCharsets.UTF_8), StandardOpenOption.CREATE);

        } catch (MalformedURLException ex) {
            Logger.getLogger(App.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(App.class.getName()).log(Level.SEVERE, null, ex);
        }

    }
}
