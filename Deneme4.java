import java.util.Scanner;

public class Deneme4 {
    public static void main(String[] args) {

        int sayi = 0;

        do {
            System.out.println("Do Döngüleri: " + sayi);
            sayi++;
        } while (sayi < 5);

        int sayi1 = 0;
        while (sayi1 < 5) {
            System.out.println("While Dönüleri: " + sayi1);
            sayi1++;
        }

        for (int sayi2 = 0; sayi2 <= 5; sayi2++) {
            System.out.println("For Döngüleri: " + sayi2);
        }

        // 7 VE 7 NİN KATLARINI YAZDIRMA İŞLEMİ

        int sayii = 0, bitis, kalan1, kalan2;

        System.out.println("Sayı sınırını giriniz");
        Scanner giris = new Scanner(System.in);
        bitis = giris.nextInt();
        do {
            kalan1 = sayii % 7; // 7'den kalanlarını hesapla
            kalan2 = sayii % 5;
            if (kalan1 == 0 && kalan2 != 0) {
                System.out.println(sayii); // 7'ye tam bölünebilir katlar
            }
            sayii++;
        } while (sayii <= bitis);
    }

}
