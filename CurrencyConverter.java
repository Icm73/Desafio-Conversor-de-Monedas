public class CurrencyConverter {
    public static double convert(String fromCurrency, String toCurrency, double amount) throws Exception {
        ExchangeRateResponse response = ApiService.getExchangeRates(fromCurrency);
        Double rate = response.getRates().get(toCurrency);

        if (rate == null) {
            throw new Exception("Moneda no soportada: " + toCurrency);
        }

        return amount * rate;
    }
}