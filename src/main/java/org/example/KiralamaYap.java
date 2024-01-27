package org.example;

import java.util.ArrayList;
import java.util.List;

public class KiralamaYap {
    private List<String> mevcutOtomobiller;

    public KiralamaYap() {
        mevcutOtomobiller = new ArrayList<>();
        mevcutOtomobiller.add("Audi A4");
        mevcutOtomobiller.add("BMW 5 Serisi");
        mevcutOtomobiller.add("Mercedes C Serisi");
    }

    public void kiralamaYap(String otomobil, int kiralamaSuresi) throws OtomobilBulunamadiHatasi, GeçersizKiralamaSuresiHatasi, OdemeHatasi {

        if (!mevcutOtomobiller.contains(otomobil)) {
            throw new OtomobilBulunamadiHatasi();
        }


        if (kiralamaSuresi <= 0) {
            throw new GeçersizKiralamaSuresiHatasi();
        }

        boolean odemeBasarili = true;
        if (!odemeBasarili) {
            throw new OdemeHatasi();
        }

        System.out.println(otomobil + " " + kiralamaSuresi + " gün için başarıyla kiralandı.");
    }
}

class OtomobilBulunamadiHatasi extends Exception {
}

class GeçersizKiralamaSuresiHatasi extends Exception {
}

class OdemeHatasi extends Exception {
}