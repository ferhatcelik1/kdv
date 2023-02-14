import java.util.Scanner;

public class kdv {
    public static void main(String[] args) {
        double tutar , kdvOran = 0.18, kdvTutar ,kdvlitutar;
        Scanner input = new Scanner(System.in);
        System.out.println("ücret tutarını giriniz : ");
        tutar = input.nextDouble();

         kdvTutar = tutar * kdvOran;
         kdvlitutar = tutar + kdvTutar;

        System.out.println("KDVsiz tutar :" + tutar );
        System.out.println("KDV oranı : " + kdvOran );
        System.out.println("KDV Tutarı :" + kdvTutar);
        System.out.println("KDVli Tutar : " +kdvlitutar);


    }
}
