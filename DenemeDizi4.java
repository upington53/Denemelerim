import java.util.Scanner;

public class DenemeDizi4 {
public static void main(String[] args) {
        //DİNAMİK dizi
        // Eleman sayısı sonradan belirlenen dizi

        Scanner giris = new Scanner(System.in);
        int elemanSayisi=0;

        System.out.println("Kaç elemanlı dizi oluşturmak istiyorsun:");
        elemanSayisi = giris.nextInt();

        int[] sayilar =  new int[elemanSayisi];
        for(int i =0; i< sayilar.length;i++){
            sayilar[i] = (int)(Math.random()*100);
            System.out.println(sayilar[i]);
        }



    Scanner giris = new Scanner(System.in);
        int elemanSayisi = 0;
        int[] sayilar1;
        int[] sayilar2 = new int[elemanSayisi];

        System.out.println("Kaç Elemanlı dizi oluşturmak istiyorsunuz:");
        elemanSayisi = giris.nextInt(); // 5

        sayilar1 = new int[elemanSayisi];
        sayilar2 = new int[elemanSayisi];
        int[] sayilar3 = new int[elemanSayisi];

    
    
    
    
        int[] sayilar1 = new int[5];//5 elemanlı tanımlandı
        sayilar1 = new int[6];//6 elemanlı tanımlandı
        System.out.println(sayilar1.length);

        sayilar1 = new int[7];//7 elemanlı tanımlandı
        System.out.println(sayilar1.length);
}
}