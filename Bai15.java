import java.util.Scanner;

public class Bai15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long ms = 0;
        double kq = 0;
        int i = 0;
        System.out.print("Nhap so can tinh: ");
        int n = sc.nextInt();
        while (i <= n) {
        	ms += i;
        	kq += 1/ms; 
        	i++;
	}
        System.out.println("Ket qua la: " + kq);
    }
}
