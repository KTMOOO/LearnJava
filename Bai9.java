import java.util.Scanner;

public class Bai9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long kq = 1;
        int i = 1;
        System.out.print("Nhap so can tinh: ");
        int n = sc.nextInt();
        while (i <= n) {
        	kq = kq * i;
		i++;
	}
        System.out.println("Ket qua la: " + kq);
    }
}
