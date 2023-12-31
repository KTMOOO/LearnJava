import java.util.Scanner;

public class Bai10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long kq = 1;
        int i = 1;
        System.out.print("Nhap so can tinh: ");
        int x = sc.nextInt();
        System.out.print("Nhap so mu: ");
        int n = sc.nextInt();
        while (i <= n) {
        	kq *= x;
		i++;
	    }
        System.out.println("Ket qua la: " + kq);
    }
}
