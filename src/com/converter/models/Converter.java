package com.converter.models;

import com.google.gson.Gson;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class Converter {
    //Clase para realizar la conversión de las monedas y la conexión con la API
    String API_KEY = "f030620ce6386c8628ccebd7";


    public Money convert(String base_c, String target_c, double amount){
        URI url = URI.create("https://v6.exchangerate-api.com/v6/"+API_KEY+"/pair/"+base_c+"/"+target_c+"/"+amount);
        HttpClient client = HttpClient.newHttpClient();

        HttpRequest request = HttpRequest.newBuilder()
                .uri(url)
                .build();

        HttpResponse<String> response = null;
        try {
            response = client
                    .send(request, HttpResponse.BodyHandlers.ofString());
        } catch (IOException | InterruptedException e) {
            throw new RuntimeException(e);
        }
        return new Gson().fromJson(response.body(), Money.class);

    }
}
