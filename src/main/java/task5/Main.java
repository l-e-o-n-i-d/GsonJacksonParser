package task5;

public class Main {
    public static void main(String[] args)  {
        final String URL_REQUEST = "https://bank.gov.ua/NBUStatService/v1/statdirectory/exchange?json";

        try {
            GsonParser.parseJsonApi(URL_REQUEST);
        } catch (Exception e) {
            e.printStackTrace();
        }

        try {
            JacksonParser.parseJson(URL_REQUEST);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
