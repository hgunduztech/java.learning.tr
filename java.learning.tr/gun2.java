import java.util.Scanner;

public class gun2 {
    public static void main(String[] args) {
        // Scanner nesnesi ile kullanıcıdan girdi al
        Scanner scanner = new Scanner(System.in);

        // Kullanıcıdan bir sayı girmesini iste
        System.out.print("Bir sayı girin: ");
        double sayi = scanner.nextDouble();

        // if-else yapısı ile sayının pozitif, negatif veya sıfır olup olmadığını kontrol et
        if (sayi > 0) {
            System.out.println("Girilen sayı pozitiftir.");
        } else if (sayi < 0) {
            System.out.println("Girilen sayı negatiftir.");
        } else {
            System.out.println("Girilen sayı sıfırdır.");
        }

        // Scanner nesnesini kapat
        scanner.close();
    }
}
