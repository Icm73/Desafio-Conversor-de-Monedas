import java.util.Map;

public class ExchangeRateResponse {
    private String base_code;
    private Map<String, Double> rates;

    public String getBaseCode() {
        return base_code;
    }

    public Map<String, Double> getRates() {
        return rates;
    }
}