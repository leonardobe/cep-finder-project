package br.com.leo.cepfinder.client;

import br.com.leo.cepfinder.dto.ViaCepDto;
import com.fasterxml.jackson.databind.ObjectMapper;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;

import java.io.IOException;

public class ViaCepClient {
    private static final String URL_VIACEP = "https://viacep.com.br/ws/%s/json/";

    private final OkHttpClient client;
    private final ObjectMapper mapper;

    public ViaCepClient() {
        this.client = new OkHttpClient();
        this.mapper = new ObjectMapper();
    }

    public ViaCepDto searchAddressByZipCode(String cep) {
        String url = String.format(URL_VIACEP, cep);

        Request request = new Request.Builder().url(url).build();

        try (Response response = client.newCall(request).execute()) {

            if (!response.isSuccessful()) {
                System.out.println("\n⚠️ Unable to retrieve address. Server returned HTTP " + response.code() + "\n");
            }

            String jsonString = response.body().string();
            return mapper.readValue(jsonString, ViaCepDto.class);

        } catch (IOException e) {
            System.out.println("\n❌ Unable to connect to the ViaCEP service.");
            System.out.println("Details: " + e.getMessage() + "\n");
        }
        return null;
    }
}
