import java.util.Scanner;

public class Deneme {

    public static void main(String[] args) {

        int a = 3;
        System.out.println(a);

        final double ondalikliBirSayi = 38.9;
        System.out.println(ondalikliBirSayi);
        // b = 69.9; yazdığımızda hata veriyor çünkü "final" komutu ile bu değerin son
        // hali olduğunu belirttik

        int d = 190;
        byte c = 127;

        System.out.println("d Değeri: " + d);
        System.out.println("c Değeri: " + c);

        // c = d; burada hata verdi çünkü byte değeri min -128 max 127 olmalıdır. Bunun
        // için
        // tür değiştirme kullanılır.

        c = (byte) d;
        System.out.println(c); /*
                                * bu değer -66 çıktı çünkü 128 itibariyle byte değeri -127den başlayarak 128e
                                * kadar modluk durumu oluşturdu
                                * örneğin c= (byte)200 deseydik sonuç -65 çıkacaktı.
                                */

        double e;
        e = c;
        System.out.println("e Değeri= " + e); // görüldüğü üzere -66.0 çıktı yukardaki sonuçtan dolayı

        a += 5;
        System.out.println(a);

        ++a;
        a++;
        System.out.println(a);

        int s1 = 14, s2 = 30, s3;
        s3 = s1 + s2++; // bu toplamada s2=30 alınır toplama sonucu 44 çıkar ama yeni s2 değer 31 dir.
        System.out.println(s3);
        s3 = s1 + ++s2; // bu toplamada s2=31 alınır, yeni toplamada s2=32 olur ve genel toplama sonucu
                        // 46 çıkar.
        System.out.println(s3);

        int g = 10, f = 3;
        int h;
        h = g / f;
        System.out.println(h); // Görüldüğü üzere sonuç 3.33 yerine int/int olduğu için 3 çıktı

        double j;
        j = g / 3.0;
        System.out.println(j); // Şimdi ise 3.3333 diye çıkmış bulunmaktadır.

        float f1 = 10; // float = int bu doğru çıkar
        System.out.println(f1);

        // f1 = 10.0; float = double diyoruz ama float < double'dir. Ve 10.0 dediğimizde
        // hata çıkıyor bu yüzden;
        f1 = 10.0f; // f ya da F harfini kullanıyoruz ki float olarak algılasın. Doubleda bunu
                    // yapmaya gerek yok.

        byte b1, b2;

        b1 = 10;
        // b2 = b1 + 50; dersek çalışmıyor çünkü byte sınırları içinde olduğunu
        // anlayamadı bu yüzden;
        b2 = (byte) (b1 + 50); // diyoruz ve sonuç doğru çıkıyor.
        System.out.println(b2);

        char p = 'A'; // A'nın ASCII kodu 65 tir.
        p++; // Yaptığımızda kod 66 olacak yani B çıkacak
        System.out.println(p);

        char k = '0' + '5'; // Karakterlerin ASCII kodlarını toplar. 0 = 48 ve 5 = 53 kodlarını toplayıp 101
                            // bulur.
        System.out.println(k);

        int i = '0' + '5';
        System.out.println(i); // Bu şekilde sonuç 101 çıkar ama
        System.out.println((char) i); // Bu şekilde dönüşüm yaparsak "e" çıkıyor

        int r = 5 + '5'; // dediğimizde 5 ile 5'in ASCII kodunu toplar
        System.out.println(r); // Sonuç 58 çıkar
        System.out.println((char) r); // Bunun ASCII'deki karşılığı ":" miş

        int sayi1 = 10, sayi2 = 20, sonuc;
        sonuc = sayi1 + sayi2;
        System.out.println("Sayıların toplamı= " + sonuc); // Klasik toplam sonucu
        System.out.println("Sayilarin toplami= " + sayi1 + sayi2); // Burada toplam olamıyor 1020 çıkıyor
        System.out.println("Sayilarin toplamı = " + (sayi1 + sayi2)); // işlem önceliği ile 30 çıkar
        System.out.println(sayi1 + sayi2 + " Sonucu bulunmuştur"); // int + int =int ... int + string = string

        int hesaplama1, hesaplama2, hesaplamaSonucu;
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
        }
        if (HangiIslem == '-') {
            hesaplamaSonucu = hesaplama1 - hesaplama2;
            System.out.println("İşlem Sonucu: " + hesaplamaSonucu);
        }
        if (HangiIslem == '/') {
            hesaplamaSonucu = hesaplama1 / hesaplama2;
            System.out.println("İşlem Sonucu: " + hesaplamaSonucu);
        }
        if (HangiIslem == '*') {
            hesaplamaSonucu = hesaplama1 * hesaplama2;
            System.out.println("İşlem Sonucu: " + hesaplamaSonucu);
        }
    }
}
