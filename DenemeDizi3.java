public class DenemeDizi3 {
    public static void main(String[] args) {
        // 4. Elemanları 1-100 arasında rastgele değerler olan int türden 20 elemanlı
        // bir dizideki elemanların sayısal ortalamasını, en büyük değerini, en küçük
        // değerini bulan programı yazınız.

        // 1.diziye rastgele eleman ata
        // 2.elemanları ekrana yazdır
        // 3.en büyük elemanı bul ve akrana yazdır

        // EN BÜYÜK ELEMAN BUL
        // 1.elamanı en büyük sayı (EBS) olarak ata
        // sıradaki elemanı EBS ile kıyasla
        // eğer sıradaki eleman EBS dan büyük ise artık EBS sıradaki eleman
        // olsun(sıradaki elemanı EBS olarak ata)
        // bu işlemi dizinin son elemanına kadar kontrol et

        int[] sayilar = new int[20];
        int EBS = 0;

        // 1.diziye rastgele eleman ata
        // 2.elemanları ekrana yazdır

        for (int i = 0; i < sayilar.length; i++) {
            sayilar[i] = (int) (Math.random() * 100);
            System.out.println((i + 1) + ".Eleman = " + sayilar[i]);
        }

        // 3.en büyük elemanı bul ve akrana yazdır
        // 1.yöntem

        EBS = sayilar[0];// 1.elamanı en büyük sayı (EBS) olarak ata
        for (int i = 0; i < sayilar.length; i++) {//DİKKAT istersen i=1 diyebilirsin ama 0 dense de farketmez. 1 kere fazla işlem yapacak.
            // sıradaki elemanı EBS ile kıyasla
            if (sayilar[i] > EBS)// eğer sıradaki eleman EBS dan büyük ise artık EBS sıradaki eleman
                EBS = sayilar[i];// olsun(sıradaki elemanı EBS olarak ata)

        }

        System.out.println("EBS= "+EBS);



        //ALTTAKİ DİĞER YÖNTEM 

        public static void main(String[] args) {
        // 4. Elemanları 1-100 arasında rastgele değerler olan int türden 20 elemanlı
        // bir dizideki elemanların sayısal ortalamasını, en büyük değerini, en küçük
        // değerini bulan programı yazınız.

        // 1.diziye rastgele eleman ata
        // 2.elemanları ekrana yazdır
        // 3.en büyük elemanı bul ve akrana yazdır

        // EN BÜYÜK ELEMAN BUL
        // 1.elamanı en büyük sayı (EBS) olarak ata
        // sıradaki elemanı EBS ile kıyasla
        // eğer sıradaki eleman EBS dan büyük ise artık EBS sıradaki eleman
        // olsun(sıradaki elemanı EBS olarak ata)
        // bu işlemi dizinin son elemanına kadar kontrol et

        int[] sayilar1 = new int[20];
        int EBS1 = 0;

        // 1.diziye rastgele eleman ata
        // 2.elemanları ekrana yazdır

        for (int i = 0; i < sayilar1.length; i++) {
            sayilar1[i] = (int) (Math.random() * 100);
            System.out.println((i + 1) + ".Eleman = " + sayilar1[i]);
        }

        // 3.en büyük elemanı bul ve akrana yazdır
        // 2.yöntem

        for (int i = 0; i < sayilar1.length; i++) {
            if (i == 0)
                EBS1 = sayilar1[0];// 1.elamanı en büyük sayı (EBS) olarak ata, DİKKAT bu satır sadece 1 kere çalışır
            // sıradaki elemanı EBS ile kıyasla
            if (sayilar1[i] > EBS1)// eğer sıradaki eleman EBS dan büyük ise artık EBS sıradaki eleman
                EBS1 = sayilar1[i];// olsun(sıradaki elemanı EBS olarak ata)

        }

        System.out.println("EBS= " + EBS1);


}
}
