import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class gun9 {
    public static void main(String[] args) {
        String inputFilePath = "input.txt"; // Okunacak dosyanın yolu
        String outputFilePath = "output.txt"; // Yazılacak dosyanın yolu

        // Dosyadan veri okuma
        try (BufferedReader reader = new BufferedReader(new FileReader(inputFilePath))) {
            String line;
            StringBuilder content = new StringBuilder();

            while ((line = reader.readLine()) != null) {
                content.append(line).append("\n");
            }

            // Okunan veriyi başka bir dosyaya yazma
            try (BufferedWriter writer = new BufferedWriter(new FileWriter(outputFilePath))) {
                writer.write(content.toString());
                System.out.println("Veri başarıyla yazıldı: " + outputFilePath);
            } catch (IOException e) {
                System.err.println("Dosya yazma hatası: " + e.getMessage());
            }
        } catch (IOException e) {
            System.err.println("Dosya okuma hatası: " + e.getMessage());
        }
    }
}
