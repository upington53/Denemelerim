import java.util.Scanner;

public class Deneme5 {
    public static void main(String[] args) {

        int a, b, c;
        b = (int) (Math.random());
        System.out.println(b); // gördüğümüz üzere 0 çıktı çünkü seçilen sayı 0,??? lı bir sayıydı

        a = (int) (Math.random() * 10); // 0.0-0.1
        System.out.println(a);

        double rastgeleSayi = Math.random();
        System.out.println("Rastgele Sayı= " + rastgeleSayi);

        rastgeleSayi = rastgeleSayi * 10;
        System.out.println("Rastgele Sayı= " + rastgeleSayi);

        /************************************************************************* */

        int tutulanSayi, tahmin;

        Scanner giris = new Scanner(System.in);

        tutulanSayi = (int) (Math.random() * 100);
        System.out.println("Bir sayı tuttum. Bilebilecek misin?");
        System.out.print("Hadi bakalım ilk tahminini yaz: ");
        do {

            tahmin = giris.nextInt();

            if (tutulanSayi > tahmin) {
                System.out.print("Daha büyük sayı giriniz: ");
            }
            if (tutulanSayi < tahmin) {
                System.out.print("Daha küçük sayı giriniz: ");
            }
            if (tutulanSayi == tahmin) {
                System.out.println("Tebrikler doğru bildiniz !!! ");
            }
        } while (tutulanSayi != tahmin);

        /******************************************************************************************* */

        int carpan, adim, sonuc;
        Scanner giris2 = new Scanner(System.in);
        System.out.println("Çarpan Giriniz: ");
        carpan = giris2.nextInt();

        System.out.println("Adım Giriniz: ");
        adim = giris2.nextInt();

        for (int i = 1; i <= adim; i++) {

            sonuc = carpan * i;
            System.out.println("Yapılan İşlemler: " + i + " x " + carpan + " = " + sonuc);
        }

        for (int k = 1; k <= adim; k++) {
            if (k == 5) {
                continue; // döngünün son satırına gider
            }
            if (k == 6) {
                break; // döngünün çıkış satırına gider
            }
            System.out.println(k);
        } // Çıkış
        System.out.println("****************");
        // Çarpanlı bir deneme
        for (int carpan11 = 1; carpan11 <= 5; carpan11++) {
            System.out.println("****");
            for (int carpan12 = 1; carpan12 <= 2; carpan12++) {
                int sonuc12 = carpan11 * carpan12;
                System.out.println(sonuc12);
                
            }
        }
        // 2'den 5'e kadar çarpım yaparken ilk değişkenin değerini 1 yaparız ki etki
        // etmesin.
        // Aynı şekilde toplam yapacaksak toplam değişkenini ilk başta 0 yaparız ki etki
        // etmesin. Sonra for döngüsüyle istediğimizi yaparız.

        // Adet (ya da tur)sayısı isteniyorsa ilk başta adet diye bir değişkenin değeri
        // 0 olarak alınır.
        // Daha sonra döngü içine adet++; komutu girilir. Ve döngü dışına print komutu
        // yazılır (eğer içeri yazılırsa çok karışır.)
    }

}
