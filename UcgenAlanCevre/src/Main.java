import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        int cevre,alan,u;
        System.out.print("A kenarı giriniz: ");
        int a = inp.nextInt();
        System.out.print("B kenarı giriniz: ");
        int b = inp.nextInt();
        System.out.print("C kenarı giriniz: ");
        int c = inp.nextInt();

        u=(a+b+c)/2;
        cevre=u*2;
        alan=u *(u-a)*(u-b)*(u-c);

        System.out.println("Alan:"+alan);
        System.out.println("Cevre: "+cevre);

    }
}
