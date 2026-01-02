import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.Scanner;


public class CurrencyConverterApp {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("===== Currency Converter =====");

        System.out.print("Enter base currency (USD, INR, EUR, GBP, JPY): ");
        String base = sc.next().toUpperCase();

        System.out.print("Enter target currency (USD, INR, EUR, GBP, JPY): ");
        String target = sc.next().toUpperCase();

        System.out.print("Enter amount: ");
        double amount = sc.nextDouble();

        if (amount <= 0) {
            System.out.println("Invalid amount.");
            return;
        }

        double rate = CurrencyConverter.getExchangeRate(base, target);

        if (rate == -1) {
            System.out.println("Conversion failed.");
            return;
        }

        double convertedAmount = CurrencyConverter.convert(amount, rate);

        System.out.println("\n===== Result =====");
        System.out.println(amount + " " + base + " = " +
                CurrencySymbols.getSymbol(target) +
                String.format("%.2f", convertedAmount) +
                " " + target);

        sc.close();
    }
}




class CurrencyConverter {

    public static double getExchangeRate(String base, String target) {
        try {
            String urlStr = "https://api.exchangerate-api.com/v4/latest/" + base;
            URL url = new URL(urlStr);

            HttpURLConnection conn = (HttpURLConnection) url.openConnection();
            conn.setRequestMethod("GET");

            BufferedReader br = new BufferedReader(
                    new InputStreamReader(conn.getInputStream()));
            StringBuilder response = new StringBuilder();
            String line;

            while ((line = br.readLine()) != null) {
                response.append(line);
            }

            String json = response.toString();

            // Find exchange rate manually
            String search = "\"" + target + "\":";
            int index = json.indexOf(search);

            if (index == -1) return -1;

            int start = index + search.length();
            int end = json.indexOf(",", start);

            return Double.parseDouble(json.substring(start, end));

        } catch (Exception e) {
            System.out.println("Error fetching exchange rate.");
            return -1;
        }
    }

    public static double convert(double amount, double rate) {
        return amount * rate;
    }
}


class CurrencySymbols {
    public static String getSymbol(String currency) {
        switch (currency) {
            case "USD": return "$";
            case "INR": return "₹";
            case "EUR": return "€";
            case "GBP": return "£";
            case "JPY": return "¥";
            default: return "";
        }
    }
}
