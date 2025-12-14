package br.com.leo.cepfinder.service;

import br.com.leo.cepfinder.client.ViaCepClient;
import br.com.leo.cepfinder.dto.ViaCepDto;

public record ViaCepService(ViaCepClient viaCepClient) {

    public String findAddress(String zipCode) {
        if (zipCode == null || zipCode.length() != 8 || !zipCode.matches("\\d+")) {
            return "Invalid ZIP code. It must contain exactly 8 numbers. \n";
        }

        ViaCepDto address = viaCepClient.searchAddressByZipCode(zipCode);

        if (address == null || address.isError()) {
            return "The address for the ZIP code could not be found in the database: " + zipCode + "\n";
        }

        if (address.getStreet() == null || address.getCity() == null || address.getState() == null) {
            return "Incomplete address data returned by the API for ZIP code: " + zipCode + "\n";
        }

        String formattedCep = zipCode.substring(0, 5) + "-" + zipCode.substring(5);

        return """
            ━━━━━━━━━━━━━━━━━━━━━━━
            📮 ZIP CODE: %s
            ━━━━━━━━━━━━━━━━━━━━━━━
            🏠 Street: %s
            🏘️ Neighborhood: %s
            🏙️ City: %s
            🌍 State: %s
            🧭 Region: %s
            🆔 IBGE: %s
            ━━━━━━━━━━━━━━━━━━━━━━━
            """.formatted(
                        formattedCep,
                        address.getStreet(),
                        address.getNeighborhood(),
                        address.getCity(),
                        address.getState(),
                        address.getRegion(),
                        address.getIbgecode());
    }
}
