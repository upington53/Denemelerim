import java.util.Scanner;

public class Deneme2 {

    public static void main(String[] args) {

        Double sayi1, sayi2, sonuc;

        Scanner giris = new Scanner(System.in);
        System.out.println("1.Sayıyı Giriniz: ");
        sayi1 = giris.nextDouble();

        System.out.print("2.Sayıyı Giriniz: ");
        sayi2 = giris.nextDouble();

        sonuc = sayi1 + sayi2;
        System.out.println("Sonuç= " + sonuc);

        double ortalama;
        ortalama = (sayi1 + sayi2) / 2;
        System.out.println("Ortalama değeri: " + ortalama);

        if (ortalama >= 50) {
            System.out.println("Başarılı");
        } else {
            System.out.println("Başarısız");
        }

        int hesaplama1, hesaplama2, hesaplamaSonucu = 0;
        char HangiIslem;

        Scanner dortIslem = new Scanner(System.in);

        System.out.print("Hesaplama Yapılacak 1.Sayıyı Giriniz: ");
        hesaplama1 = dortIslem.nextInt();

        System.out.print("Hesaplama Yapılacak 2.Sayıyı Giriniz: ");
        hesaplama2 = dortIslem.nextInt();

        System.out.println("Hangi Dört İşlem Yapılacak");
        HangiIslem = dortIslem.next().charAt(0); // Buradaki charAt(0) komutu, tuşlanacak ilk şeyi al demektir

        if (HangiIslem == '+') {
            hesaplamaSonucu = hesaplama1 + hesaplama2;
            System.out.println("İşlem Sonucu: " + hesaplamaSonucu);
        } else if (HangiIslem == '-') {
            hesaplamaSonucu = hesaplama1 - hesaplama2;
            System.out.println("İşlem Sonucu: " + hesaplamaSonucu);
        } else if (HangiIslem == '/') {
            hesaplamaSonucu = hesaplama1 / hesaplama2;
            System.out.println("İşlem Sonucu: " + hesaplamaSonucu);
        } else if (HangiIslem == '*') {
            hesaplamaSonucu = hesaplama1 * hesaplama2;
            System.out.println("İşlem Sonucu: " + hesaplamaSonucu);
        } else {
            System.out.println("Yanlış Parametre Girdiniz!");
        }

        if (0 < hesaplamaSonucu && hesaplamaSonucu <= 100) { /*
                                                              * System.out.println("İşlem Sonucu: " + hesaplamaSonucu);
                                                              * Burda hata vermesinin nedeni, eğer +-/* yerine başka
                                                              * bir değer yazılırsa
                                                              * Bizim mal gibi kalmamıza neden olurdu. Bu yüzden ilk
                                                              * başta int değer
                                                              * girerken "int hesaplamaSonucu=0;"" girdiğimizde sorun
                                                              * çözüldü.
                                                              */
            System.out.println("İşleminiz 0 ile 100 arasındadır");
        } else {
            System.out.println("Helal knk");

            // EĞER CHAR YERİNE STRING KULLANACAK OLSAYDIK AŞAĞIDAKİ GİBİ OLACAKTI.

            int hesaplama12, hesaplama22, hesaplamaSonucu2 = 0;
            String HangiIslem2; // char değişti String oldu
            Scanner dortIslem2 = new Scanner(System.in);

            System.out.print("Hesaplama Yapılacak 1.Sayıyı Giriniz: ");
            hesaplama12 = dortIslem2.nextInt();

            System.out.print("Hesaplama Yapılacak 2.Sayıyı Giriniz: ");
            hesaplama22 = dortIslem2.nextInt();

            dortIslem2.nextLine(); // sayısal veri girişlerinden sonra string veri girişi için kullanıyoruz.

            System.out.println("Hangi Dört İşlem Yapılacak");
            HangiIslem2 = dortIslem2.nextLine();

            // String veri tipinde eşitlik kontrolü equals() ile yapılır
            if (HangiIslem2.equals("+")) { // İşlem değişkeni içerisindeki değer + ya eşittir.
                hesaplamaSonucu2 = hesaplama12 + hesaplama22;
                System.out.println("İşlem Sonucu: " + hesaplamaSonucu2);
            } else if (HangiIslem2.equals("-")) {
                hesaplamaSonucu2 = hesaplama12 - hesaplama22;
                System.out.println("İşlem Sonucu: " + hesaplamaSonucu2); // Tek tırnak işaretleri çift tırnak işareti
                                                                         // oldu
            } else if (HangiIslem2.equals("/")) {
                hesaplamaSonucu2 = hesaplama12 / hesaplama22;
                System.out.println("İşlem Sonucu: " + hesaplamaSonucu2);
            } else if (HangiIslem2.equals("*")) {
                hesaplamaSonucu2 = hesaplama12 * hesaplama22;
                System.out.println("İşlem Sonucu: " + hesaplamaSonucu2);
            }
        }
    }
}