import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        double n1,n2;
        int select;

        Scanner scn=new Scanner(System.in);

        System.out.println("Ilk sayiyi giriniz: ");
        n1=scn.nextDouble();

        System.out.println("Ikinci sayiyi giriniz: ");
        n2=scn.nextDouble();

        System.out.println("1-Toplama\n2-Cikarma\n3-Carpma\n4-Bolme");
        System.out.println("Seciminiz: ");
        select=scn.nextInt();

        switch (select){
            case 1:
                System.out.println("Toplam: "+(n1+n2));
                    break;
            case 2:
                System.out.println("Cikarma: "+(n1-n2));
                break;
            case 3:
                System.out.println("Carpma: "+(n1*n2));
                break;
            case 4:
                System.out.println("Bolme: "+(n1/n2));
        }



    }
}
