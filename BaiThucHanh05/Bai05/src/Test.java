import java.util.Scanner;
import java.util.Set;
import java.util.HashSet;

public class Test {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Nhap so phan tu cua mang: ");
		int n=sc.nextInt();
		double []arr=new double [n];
		System.out.println("Nhap cac phan tu cua mang: ");
		for(int i=0;i<n;i++) {
			arr[i]=sc.nextDouble();
		}
		System.out.println("Nhap vao so thuc A: ");
		double a=sc.nextDouble();
		Set<Double> set =new HashSet<>();
		
		boolean kiemTra=false;
		for( double num: arr) {
			set.add(num);
			if(set.contains(a)) {
				kiemTra =true;
				break;
			}
		}
		if(kiemTra) {
			System.out.println("Mang co chua so A");
		}else {
			System.out.println("Mang khong chua so A");
		}
		
		
	}
}
