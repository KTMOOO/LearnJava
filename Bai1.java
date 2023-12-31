import java.util.Scanner;

class Bai1 {
	public static void main (String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("Nhap so can tinh: ");
	int n = sc.nextInt();
	int sum=0;
	int i=0;
	while (i<=n)
	{sum = sum + i; i++;}
	System.out.println("Tong từ 1 đến so n là: "+sum);
	}
}
