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

    public void kiralamaYap(String otomobil, int kiralamaSuresi) {
        try {
            if (!mevcutOtomobiller.contains(otomobil)) {
                throw new OtomobilBulunamadiHatasi();
            }

            if (kiralamaSuresi <= 0) {
                throw new GeçersizKiralamaSuresiHatasi();
            }

            boolean odemeBasarili = false;
            if (!odemeBasarili) {
                throw new OdemeHatasi();
            }

            System.out.println(otomobil + " " + kiralamaSuresi + " gün için başarıyla kiralandı.");
        } catch (OtomobilBulunamadiHatasi e) {
            System.out.println("Hata: Seçilen otomobil mevcut değil.");
        } catch (GeçersizKiralamaSuresiHatasi e) {
            System.out.println("Hata: Kiralama süresi geçersiz.");
        } catch (OdemeHatasi e) {
            System.out.println("Hata: Ödeme işlemi başarısız.");
        }
    }

class OtomobilBulunamadiHatasi extends Exception {
}

class GeçersizKiralamaSuresiHatasi extends Exception {
}

class OdemeHatasi extends Exception {
}