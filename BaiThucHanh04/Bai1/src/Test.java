import java.util.Scanner;

public class Test {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n;
		do {
			System.out.println("Nhap so luong benh nhan: ");
			n=sc.nextInt();
			sc.nextLine();
		}while(n<=0);
		BenhNhan bn[]=new BenhNhan[n];
		for(int i=0;i<bn.length;i++) {
			System.out.println("Nhap ten benh nhan: ");
			String ten=sc.nextLine();
			System.out.println("Nhap tuoi: ");
			int tuoi=sc.nextInt();
			sc.nextLine();
			System.out.println("Nhap gioi tinh: ");
			String gioiTinh=sc.nextLine();
			System.out.println("Nhap tien su: ");
			String tienSu=sc.nextLine();
			System.out.println("Nhap chuan doan: ");
			String chuanDoan=sc.nextLine();
			BenhVien bv1=new BenhVien("Bach Mai","Ha Noi","Nhat Hoang");
			bn[i]=new BenhNhan(ten,tuoi,gioiTinh,tienSu,chuanDoan,bv1);			
		}
		for(int i=0;i<n;i++) {
			System.out.println(bn[i]);
			System.out.print("\n");
		}
		
	}
}
