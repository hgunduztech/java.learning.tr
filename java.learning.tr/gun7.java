// Hayvan sınıfı tanımlaması
class Hayvan {
    // Hayvan sınıfının özellikleri
    String ad;
    int yas;

    // Hayvan sınıfının kurucu metodu
    public Hayvan(String ad, int yas) {
        this.ad = ad;
        this.yas = yas;
    }

    // Hayvan bilgilerini ekrana yazdıran metot
    public void bilgileriYazdir() {
        System.out.println("Ad: " + ad + ", Yaş: " + yas);
    }

    // Hayvanın ses çıkardığını belirten metot
    public void sesCikar() {
        System.out.println("Hayvan ses çıkarıyor");
    }
}

// Kedi sınıfı, Hayvan sınıfından kalıtım alır
class Kedi extends Hayvan {
    // Kedi sınıfının kurucu metodu
    public Kedi(String ad, int yas) {
        super(ad, yas); // Üst sınıfın kurucu metodunu çağır
    }

    // Kedi sınıfında ses çıkarma metodu override edilir
    @Override
    public void sesCikar() {
        System.out.println("Kedi miyavlıyor");
    }
}

// Köpek sınıfı, Hayvan sınıfından kalıtım alır
class Kopek extends Hayvan {
    // Köpek sınıfının kurucu metodu
    public Kopek(String ad, int yas) {
        super(ad, yas); // Üst sınıfın kurucu metodunu çağır
    }

    // Köpek sınıfında ses çıkarma metodu override edilir
    @Override
    public void sesCikar() {
        System.out.println("Köpek havlıyor");
    }
}

public class gun7 {
    public static void main(String[] args) {
        // Hayvan, Kedi ve Köpek nesneleri oluşturma
        Hayvan hayvan = new Hayvan("Generic Hayvan", 5);
        Kedi kedi = new Kedi("Pamuk", 2);
        Kopek kopek = new Kopek("Karabas", 3);

        // Hayvan bilgilerini ekrana yazdırma
        hayvan.bilgileriYazdir();
        kedi.bilgileriYazdir();
        kopek.bilgileriYazdir();

        // Hayvanların ses çıkarma metotlarını çağırma
        hayvan.sesCikar();
        kedi.sesCikar();
        kopek.sesCikar();
    }
}
