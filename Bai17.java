import java.util.Scanner;

public class Bai17 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap so can tinh: ");
        int x = sc.nextInt();
        System.out.print("Nhap so mu: ");
        int n = sc.nextInt();
        long ms = 1;
        double kq = 0;
        int i = 1;

        while (i <= n) {
            ms *= i;
            kq += Math.pow(x, i) / ms;
            i++;
        }
        System.out.println("Ket qua la: " + kq);
    }
}
