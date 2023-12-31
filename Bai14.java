import java.util.Scanner;

public class Bai14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap so can tinh: ");
        int x = sc.nextInt();
        System.out.print("Nhap so mu: ");
        int n = sc.nextInt();
        long pt = x;
        long kq = 0;
        int i = 0;
        while (i <= n) {
            kq += pt;
            pt *= x*x;
            i++;
	    }
        System.out.println("Ket qua la: " + kq);
    }
}