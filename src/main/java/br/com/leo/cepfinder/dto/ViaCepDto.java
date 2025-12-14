package br.com.leo.cepfinder.dto;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
public class ViaCepDto {
    @JsonProperty("cep")
    private String postalCode;

    @JsonProperty("logradouro")
    private String street;

    @JsonProperty("complemento")
    private String complement;

    @JsonProperty("bairro")
    private String neighborhood;

    @JsonProperty("localidade")
    private String city;

    @JsonProperty("uf")
    private String stateCode;

    @JsonProperty("estado")
    private String state;

    @JsonProperty("regiao")
    private String region;

    @JsonProperty("ibge")
    private String ibgecode;

    @JsonProperty("ddd")
    private String areaCode;

    @JsonProperty("siafi")
    private String siaficode;

    @JsonProperty("erro")
    private boolean error;

    public String getPostalCode() {
        return postalCode;
    }

    public String getStreet() {
        return street;
    }

    public String getComplement() {
        return complement;
    }

    public String getNeighborhood() {
        return neighborhood;
    }

    public String getCity() {
        return city;
    }

    public String getStateCode() {
        return stateCode;
    }

    public String getState() {
        return state;
    }

    public String getRegion() {
        return region;
    }

    public String getIbgecode() {
        return ibgecode;
    }

    public String getAreaCode() {
        return areaCode;
    }

    public String getSiaficode() {
        return siaficode;
    }

    public boolean isError() {
        return error;
    }

    @Override
    public String toString() {
        return "ViaCepDto = {" +
                "siaficode='" + siaficode + '\'' +
                ", areaCode='" + areaCode + '\'' +
                ", ibgecode='" + ibgecode + '\'' +
                ", region='" + region + '\'' +
                ", state='" + state + '\'' +
                ", stateCode='" + stateCode + '\'' +
                ", city='" + city + '\'' +
                ", neighborhood='" + neighborhood + '\'' +
                ", complement='" + complement + '\'' +
                ", street='" + street + '\'' +
                ", postalCode='" + postalCode + '\'' +
                '}';
    }
}
