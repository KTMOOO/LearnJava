import java.util.Scanner;

public class Bai5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double sum = 0;
        int i = 1;

        System.out.print("Nhap so can tinh: ");
        int a = sc.nextInt();

        if (a < 1) {
            System.out.println("\nSo phai lon hon hoac bang 1. Nhap lai !");
        } else {
            while (i <= a) {
                sum = sum + 1.0 / (2 * i + 1);
                i++;
            }
            System.out.println("Tong tu 1 den so n la: " + sum);
        }
    }
}
