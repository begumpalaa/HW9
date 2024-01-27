package org.example;

public class Main {
    public static void main(String[] args) {



        KiralamaYap kiralamaSistemi = new KiralamaYap();


        try {
            kiralamaSistemi.kiralamaYap("Audi A4", 7);
            kiralamaSistemi.kiralamaYap("Audi A4", -1);
        }
        catch (Exception e) {
            System.out.println(e.getMessage());
        }

    }
}