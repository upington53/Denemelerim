import java.util.Scanner;

import javax.lang.model.util.ElementFilter;
public class Deneme8 {
    public static void main(String[] args)  {
        int x;
        String y;
        System.out.print("Lütfen ilk sayıyı giriniz: ");
        Scanner giris = new Scanner(System.in);
        x = giris.nextInt();
       System.out.print("30 sayı 30 artacak mı azalacak mı? (Artacak / Azalacak): ");
       Scanner giris2= new Scanner(System.in);
         y = giris2.nextLine();
         int toplam=0;
         if (y.equals("Artacak") || y.equals("artacak")){
             for(int i=0; i<30;i++)
                 x=x+i;
                 toplam = toplam + x;
                 
             } else if (y.equals("Azalacak") || y.equals("azalacak")){
                 for(int i=0; i>-30;i--)
                     x=x+i;
                     
                     toplam = toplam + x;
                     
             } else {
                 System.out.println("Yanlış karakter girdiniz. ");
             }
             System.out.println("İşlem sonucu: "+ toplam);
       } 
    }
    

