//Kitap listesini goster
package otomasyon;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class BookListReader {
    public static void main(String[] args) {
        try (BufferedReader br = new BufferedReader(new FileReader("kitapliste.txt"))) {

            String line;

            // Dosyadan sırayla her satırı oku ve ekrana yazdır
            while ((line = br.readLine()) != null) {
                System.out.println(line);
            }

        } 
        catch (IOException e) {
            e.printStackTrace();
        }
    }
}
