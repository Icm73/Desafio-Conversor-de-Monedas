import com.google.gson.Gson;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

public class ApiService {
    private static final String API_URL = "https://open.er-api.com/v6/latest/";

    public static ExchangeRateResponse getExchangeRates(String baseCurrency) throws Exception {
        String urlStr = API_URL + baseCurrency;
        URL url = new URL(urlStr);

        HttpURLConnection connection = (HttpURLConnection) url.openConnection();
        connection.setRequestMethod("GET");

        if (connection.getResponseCode() != 200) {
            throw new RuntimeException("Error en la conexión: Código " + connection.getResponseCode());
        }

        InputStreamReader reader = new InputStreamReader(connection.getInputStream());
        Gson gson = new Gson();
        return gson.fromJson(reader, ExchangeRateResponse.class);
    }
}