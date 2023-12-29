import java.util.Scanner;

class Bai4 {
	public static void main (String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("Nhap so can tinh: ");
	int a = sc.nextInt();
	double sum=0;
	int i=1;
	while (i<=a)
	{sum = sum + 1.0/(i*2); i++;}
	System.out.println("Tong từ 1 đến so n là: "+sum);
	}
}
