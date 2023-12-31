import java.util.Scanner;

public class Bai13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long pt = 1;
        long kq = 0;
        int i = 1;
        System.out.print("Nhap so can tinh: ");
        int x = sc.nextInt();
        System.out.print("Nhap so mu: ");
        int n = sc.nextInt();
        while (i <= n) {
        	pt *= x*x;
            kq += pt; 
            i++;
	    }
        System.out.println("Ket qua la: " + kq);
    }
}