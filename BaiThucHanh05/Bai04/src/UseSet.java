import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class UseSet {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Nhap so phan tu cua mang: ");
		int n=sc.nextInt();
		double []a=new double [n];
		System.out.println("Nhap vao cac phan tu cua mang: ");
		for(int i=0;i<n;i++) {
			a[i]=sc.nextDouble();

		}
		Set<Double> b=new HashSet<>();
		Set<Double> temp=new HashSet<>();
		for(double num: a) {
			if(!b.contains(num)) {
				if(!temp.contains(num)) {
					temp.add(num);
				}else {
					temp.remove(num);
					b.add(num);
				}
			}
		}
		System.out.println("Cac phan tu xuat hien mot lan trong mang  la: ");
		for(double num : temp) {
			System.out.print(num+" ");
		}
	}
}
