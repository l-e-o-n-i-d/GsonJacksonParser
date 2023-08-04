package task5;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.stream.JsonReader;

import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URL;


public class GsonParser {
    public static void parseJsonApi(String url) throws Exception {
        Gson gson = new GsonBuilder().setDateFormat("dd.MM.yyyy").setPrettyPrinting().create();
        JsonReader jsonReader = null;
        try {
            jsonReader = new JsonReader(new InputStreamReader(new URL(url).openStream()));
        } catch (IOException e) {
            e.printStackTrace();
        }

        CurrencyModel[] currencyModel = null;
        if (jsonReader != null) {
            currencyModel = gson.fromJson(jsonReader, CurrencyModel[].class);

            for (CurrencyModel rate : currencyModel) {
                System.out.println(gson.toJson(rate));
            }
            try {
                jsonReader.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        } else throw new Exception("Error!");
    }
}
