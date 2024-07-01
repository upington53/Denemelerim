public class DenemeDizi1 {

    public static void main(String[] args) {
        // dizinin_veri_tipi[ ] dizi_adı = new dizinin_veri_tipi[dizinin_eleman_sayısı];
        // dizinin_veri_tipi dizi_adı[ ] = new dizinin_veri_tipi[dizinin_eleman_sayısı];

        // dizinin_eleman_sayısı int veri tipinde bir değer

        int[] sayilar = new int[10];// 10 elemanlı int veri tipinde bir boyutlu dizi tanımlandı
        double[] notlar = new double[5];
        String[] ogrenciAdlari = new String[20];

        //bir dizinin elemanlarının kullanılabilmesi için eleman sayısının belli olması lazım

        //hata vermez, tanımlama yarım kalmış, kaç elemanlı olduğu belli değil
        int[] sayilar2;

        //dizi 2 satırda tanımlayabiliriz
        int[] sayilar3;
        sayilar3 = new int[10];

int[] sayilar1 = new int[5];// 5 elemanlı dizi tanımladık, içerisinde aynı anda 5 farklı bilgi
                                    // saklayabilecek

        // dizinin elemanına değer atama
        sayilar1[0] = 10;// dizinin elemanlarına ulaşak isediğimizde sıra numarası/index numarası

        // ilk eleman index numarası 0 dan başlar

        // dizinin elamanındaki değeri örenme/farklı değişkene atama/kullanmak

        System.out.println(sayilar1[0]);

        int sayi;
        sayi = sayilar1[0];

        if (sayilar1[0] > 5)
            System.out.println("Eleman değeri 5 den büyüktür");

        int[] sayilar2;  //Köşeli parantez dizinin adından sonra da olabilir. Örn: int sayilar2 [];
        //Aşağıdaki komut hatalıdır. dizinin eleman sayısı belirlenmemiştir.
        //eleman sayısı belli olmayan dizinin elemanına değer atanamaz
        //sayilar2[0] = 20;


         int[] sayilar4 = {5,10,15,20};//Aşağıdaki satırın eşdeğeri onun altındaki 4lü satırla aynıdır.
        //int[] sayilar4 = new int[4];
        // sayilar4[0] = 5;
        // sayilar4[1] = 10;
        // sayilar4[2] = 15;
        // sayilar4[3] = 20;

        System.out.println(sayilar4[0]);//1.eleman ==> index numarası = 0
        System.out.println(sayilar4[1]);//2.eleman ==> index numarası = 1
        System.out.println(sayilar4[2]);//3.eleman ==> index numarası = 2
        System.out.println(sayilar4[3]);//4.eleman ==> index numarası = 3

        System.out.println(sayilar4[4]);//5.eleman varmı? yok HATA VERİR


        for(i=0; i>5; i++) {
            System.out.println(sayilar4[i]);
        }

        // sayilar4.length = bu bize dizinin eleman sayısını/uzunluğunu verir.
        for (int j = 0; j < sayilar4.length; j++) {
            
        }


    }
}
