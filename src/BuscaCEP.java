import com.google.gson.Gson;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class BuscaCEP {


    public Endereco buscaEndereco(String cep){
        HttpClient client = HttpClient.newHttpClient();
        URI endereco = URI.create("https://viacep.com.br/ws/" + cep + "/json/");
        HttpRequest request = HttpRequest.newBuilder()
                .uri(endereco)
                .build();
        try {
            HttpResponse<String> response = client
                    .send(request, HttpResponse.BodyHandlers.ofString());
            return new Gson().fromJson(response.body(), Endereco.class);
        } catch (Exception e) {
            throw new RuntimeException("Não foi possível obter o endereço a partir desse CEP");
        }


    }
}
