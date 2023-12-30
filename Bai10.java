import java.util.Scanner;

public class Bai10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long kq = 1;
        int i = 1;
        System.out.print("Nhap so can tinh: ");
        int a = sc.nextInt();
        System.out.print("Nhap so mu: ");
        int b = sc.nextInt();
        while (i <= b) {
        	kq *= a; i++;
	    }
        System.out.println("Ket qua la: " + kq);
    }
}