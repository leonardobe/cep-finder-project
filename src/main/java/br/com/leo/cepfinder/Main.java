package br.com.leo.cepfinder;

import br.com.leo.cepfinder.client.ViaCepClient;
import br.com.leo.cepfinder.controller.ViaCepController;
import br.com.leo.cepfinder.service.ViaCepService;

public class Main {
    public static void main(String[] args) {
        ViaCepClient client = new ViaCepClient();
        ViaCepService service = new ViaCepService(client);
        ViaCepController controller = new ViaCepController(service);
        controller.startSession();
    }
}
