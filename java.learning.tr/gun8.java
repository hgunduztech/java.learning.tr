// HareketEdebilir arayüzü tanımlaması
interface HareketEdebilir {
    // Hareket etme metotları
    void ileriGit();
    void geriGit();
}

// Insan sınıfı, HareketEdebilir arayüzünü implement eder
class Insan implements HareketEdebilir {
    private String ad;

    public Insan(String ad) {
        this.ad = ad;
    }

    // HareketEdebilir arayüzündeki ileriGit metodunu implement eder
    @Override
    public void ileriGit() {
        System.out.println(ad + " yürüyor.");
    }

    // HareketEdebilir arayüzündeki geriGit metodunu implement eder
    @Override
    public void geriGit() {
        System.out.println(ad + " geri yürüyor.");
    }
}

// Robot sınıfı, HareketEdebilir arayüzünü implement eder
class Robot implements HareketEdebilir {
    private String model;

    public Robot(String model) {
        this.model = model;
    }

    // HareketEdebilir arayüzündeki ileriGit metodunu implement eder
    @Override
    public void ileriGit() {
        System.out.println(model + " ileri gidiyor.");
    }

    // HareketEdebilir arayüzündeki geriGit metodunu implement eder
    @Override
    public void geriGit() {
        System.out.println(model + " geri gidiyor.");
    }
}

public class gun8 {
    public static void main(String[] args) {
        // Insan ve Robot nesneleri oluşturma
        Insan insan = new Insan("Ahmet");
        Robot robot = new Robot("RX-78");

        // HareketEdebilir metotlarını çağırma
        insan.ileriGit();
        insan.geriGit();

        robot.ileriGit();
        robot.geriGit();
    }
}
