package task5;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;

import java.io.IOException;
import java.net.URL;
import java.text.DateFormat;
import java.text.SimpleDateFormat;

public class JacksonParser {
    public static void parseJson(String url) throws Exception {
        DateFormat df = new SimpleDateFormat("dd.MM.yyyy");
        ObjectMapper objectMapper = new ObjectMapper();
        CurrencyModel[] currencies = null;
        try {
            currencies = objectMapper.enable(SerializationFeature.INDENT_OUTPUT).setDateFormat(df).readValue(new URL(url), CurrencyModel[].class);
        } catch (IOException e) {
            e.printStackTrace();
        }

        if (currencies != null) {
            for (CurrencyModel currency : currencies) {
                String prettyCurrency = null;
                try {
                    prettyCurrency = objectMapper.writeValueAsString(currency);
                } catch (JsonProcessingException e) {
                    e.printStackTrace();
                }
                System.out.println(prettyCurrency);
            }
        } else throw new Exception("Error!");
    }
}
