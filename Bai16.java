import java.util.Scanner;

public class Bai16 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap so can tinh: ");
        int x = sc.nextInt();
        System.out.print("Nhap so mu: ");
        int n = sc.nextInt();
        long ts = 1;
        double ms = 0;
        double kq = 0;
        int i = 0;
        while (i <= n) {
            ts *= x;
        	ms += i;
            kq += ts/ms; 
            i++;
	    }
        System.out.println("Ket qua la: " + kq);
    }
}