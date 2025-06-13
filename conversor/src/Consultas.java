import com.google.gson.Gson;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class Consultas {
    public Intercambios ConsultaIntercambio(String codigoBase,
                               String codigoDestino,
                               float monto) {
        URI direccion = URI.create("https://v6.exchangerate-api.com/v6/YOUR-API-KEY/pair/" + codigoBase + "/" + codigoDestino + "/" + monto);

        HttpClient cliente = HttpClient.newHttpClient();
        HttpRequest solicitud = HttpRequest.newBuilder()
            .uri(direccion)
            .build();

        try {
            HttpResponse<String> response = cliente
                    .send(solicitud, HttpResponse.BodyHandlers.ofString());
            return new Gson().fromJson(response.body(), Intercambios.class);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

}
