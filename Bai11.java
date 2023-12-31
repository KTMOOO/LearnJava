import java.util.Scanner;

public class Bai11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long pt = 1;
        long kq = 0;
        int i = 1;
        System.out.print("Nhap so can tinh: ");
        int a = sc.nextInt();
        while (i <= a) {
        	pt = pt * i;
            kq += pt; 
		    i++;
	}
        System.out.println("Ket qua la: " + kq);
    }
}