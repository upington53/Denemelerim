import java.util.Scanner;

import javax.sound.midi.Soundbank;

public class Deneme3 {
    public static void main(String[] args) {
        System.out.println("Kök bulma işlemine hoş geldiniz"); // denklemimiz a^2 + b*x + c = 0

        int a, b, c;
        double x1, x2;
        double sonuc, diskriminant;

        Scanner giris = new Scanner(System.in);

        System.out.print("Lütfen ilk kat sayıyı giriniz (a) : ");
        a = giris.nextInt();

        System.out.print("Lütfen ikinci kat sayıyı giriniz (b) : ");
        b = giris.nextInt();

        System.out.print("Lütfen üçüncü kat sayıyı giriniz (c) : ");
        c = giris.nextInt();

        diskriminant = (b * b) - (4 * a * c);

        if (diskriminant < 0) {
            System.out.println("Denklemin çözüm kümesi yoktur.");
        } else if (diskriminant == 0) {
            x1 = (-b) / (2 * a);
            System.out.println("Denklemin tek çözümü vardır o da: " + x1);
        } else if (diskriminant > 0) {
            x1 = (-b + Math.sqrt(diskriminant)) / (2 * a);
            x2 = (-b - Math.sqrt(diskriminant)) / (2 * a);
            System.out.println("Denklemin iki kökü vardır onlar ise: " + x1 + " ve " + x2 + "'dir.");
        }

        // Switch - case Kullanımı

        int e;

        Scanner deneme = new Scanner(System.in);
        System.out.print("Lütfen bir sayı giriniz: ");
        a = deneme.nextInt();

        switch (a) {
            case 1:
                System.out.println("Bir sayısı");
                break;

            case 10:
                System.out.println("On sayısı");
                break;

            default:
                System.out.println("Ne yazdın be knk");
                break;
        }

        boolean tercih1 = true;

        if (tercih1 == true) {
            System.out.println("Doğru knk"); // Bu kısmı eşitlikleri öğrenmek için yaptık
        } else {
            System.out.println("Kanka yanlış");
        }

        if (tercih1) {
            System.out.println("Helal la");
        } else {
            System.out.println("Yanlış olm");
        }

        if (tercih1 = true) {
            System.out.println("Aferin doğru");
        } else {
            System.out.println("Ah be, yanlış");
        }

        System.out.println("Tekrar sonucu: " + tercih1);

        if (tercih1 = false) { // Burada değer atadığımız için false olarak algıladı yeni değerimiz false
            System.out.println("Doğğruuu");
        } else {
            System.out.println("Yannnlllııışşş");
        }

        System.out.println("Son tekrar: " + tercih1);
    }
}
