
import java.util.Scanner;

public class d {
    public static void main(String[] args) {
        int n1, n2, select;
        Scanner input = new Scanner(System.in);
        System.out.print("İlk sayıyı giriniz : ");
        n1 = input.nextInt();

        System.out.print("İkinci sayıyı giriniz : ");
        n2 = input.nextInt();

        System.out.print("1-Toplama\n2-Çıkarma\n3-Çarpma\n4-Bölme\n");
        System.out.print("Seçiminiz : ");
        select = input.nextInt();


        switch (select) {

            case 1:
                System.out.print("Toplama : " + (n1 + n2));
                break;

            case 2:
                System.out.print("çıkarma : +(n1-n2)");
                break;

            case 3:
                System.out.print("çarpma : " + (n1 * n2));
                break;

            case 4:

                if (n2 != 0) {
                    System.out.print("bölme : " + (n1 / n2));
                }
                    else{
                        System.out.print("Sıfıra bölünemez");

                    }

                    break;

            default:
                System.out.print("1-4 arası değer giriniz !!");
        }

    }

}

