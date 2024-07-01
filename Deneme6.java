import java.util.Scanner;

public class Deneme6{

    public static void main(String[] args) {
        int sayimiz1, sayimiz2, toplamimiz;
        char tercihimiz;
        Scanner giris = new Scanner(System.in);

        do {
            System.out.println("1.Sayıyı Giriniz: ");
            sayimiz1 = giris.nextInt();
            System.out.println("2.Sayıyı Giriniz");
            sayimiz2 = giris.nextInt();

            toplamimiz = sayimiz1 + sayimiz2;
            System.out.println("Toplam= " + toplamimiz);

            System.out.println("Tekrar başlamak ister misini? (e/h): ");
            tercihimiz = giris.next().charAt(0);

        } while (tercihimiz == 'e' || tercihimiz== 'E');

        //**********************************************************************************
        //Bu döngüyü while ile yaparsak aşağıdaki gibi olur.
       
       
        int sayimiz11, sayimiz12, toplamimiz1;
        char tercihimiz1='e';  // burada ilk değeri e verdik ki döngümüz çalışssın
        while (tercihimiz == 'e' || tercihimiz== 'E') {
            System.out.println("1.Sayıyı Giriniz: ");
            sayimiz11 = giris.nextInt();
            System.out.println("2.Sayıyı Giriniz");
            sayimiz12 = giris.nextInt();

            toplamimiz1 = sayimiz11 + sayimiz12;
            System.out.println("Toplam= " + toplamimiz1);

            System.out.println("Tekrar başlamak ister misini? (e/h): ");
            tercihimiz1 = giris.next().charAt(0);
        }
}
}