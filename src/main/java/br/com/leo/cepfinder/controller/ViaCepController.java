package br.com.leo.cepfinder.controller;

import br.com.leo.cepfinder.service.ViaCepService;

import java.util.Scanner;

public record ViaCepController(ViaCepService service) {

    public void startSession() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("━━━━ ZIP Code Search System ━━━━\n");

        while (true) {
            System.out.print("🔎 Enter the ZIP code (8 digits) or type 'exit': ");
            String userZipCode = scanner.nextLine();

            if (userZipCode.equalsIgnoreCase("exit")) {
                break;
            }

            String cleanZipCode = userZipCode.replaceAll("[^0-9]", "");

            if (cleanZipCode.length() != 8) {
                System.out.println("Invalid ZIP code! It must contain exactly 8 numbers.");
                continue;
            }

            String result = service.findAddress(cleanZipCode);
            System.out.println(result);
        }
    }
}
