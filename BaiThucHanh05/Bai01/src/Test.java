import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Test {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		List<Integer> danhSach =new ArrayList<>();
		System.out.println("Nhap vao so tu nhien n: ");
		int n=sc.nextInt();
		sc.nextLine();
		int temp=n;
		while(temp>0) {
			int a=temp%10;
			danhSach.add(a);
			temp/=10;
		}
		boolean kiemTra=true;
		int left=0;
		int right=danhSach.size()-1;
		while(left<right) {
			if(danhSach.get(left)!=danhSach.get(right)) {
				kiemTra=false;
				break;
			}
			left++;
			right--;
		}
		if(kiemTra)System.out.println("N la so thuan nghich");
		else System.out.println("N khong la so thuan nghich");
	}
}
