import java.util.Scanner;

public class Test {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n;
		do {
		System.out.println("Nhap vao so luong cuon sach: ");
		n=sc.nextInt();}while(n<=0);
		SACH []a=new SACH[n];
		for(int i=0;i<a.length;i++) {
			System.out.println("Nhap cuon sach thu: "+(i+1));
			a[i]=new SACH();
			a[i].NHAPSACH();
		}
		for(SACH x: a) {
			x.INSACH();
			System.out.print("\n");
		}
		
	}
}
