// Kisi sınıfı tanımlaması
class Kisi {
    // Kişi sınıfının özellikleri (alanlar)
    String ad;
    int yas;

    // Kişi sınıfının kurucu metodu (constructor)
    public Kisi(String ad, int yas) {
        this.ad = ad;
        this.yas = yas;
    }

    // Kişi bilgilerini ekrana yazdıran metot
    public void bilgileriYazdir() {
        System.out.println("Ad: " + ad + ", Yaş: " + yas);
    }
}

public class gun6 {
    public static void main(String[] args) {
        // Kisi sınıfından iki nesne oluşturma
        Kisi kisi1 = new Kisi("HAMZA", 30);
        Kisi kisi2 = new Kisi("SUDE", 25);

        // Kişi bilgilerini ekrana yazdırma
        kisi1.bilgileriYazdir();
        kisi2.bilgileriYazdir();
    }
}
