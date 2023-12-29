import java.util.Scanner;

public class Bai8 {
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
                sum = sum + (double)(i*2+1)/(i*2+2);
				i++;
            }
            System.out.println("Ket qua la: " + sum);
        }
    }
}
