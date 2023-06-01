import java.util.ArrayList;
import java.util.Scanner;

public class Test {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		ArrayList<HocVien> hv=new ArrayList<HocVien>();
		System.out.println("Nhap so luong hoc vien: ");
		int soLuong=sc.nextInt();
		sc.nextLine();
		for(int i=0;i<soLuong;i++) {
			System.out.println("Nhap hoc vien thu: "+(i+1));
			System.out.println("Nhan 1 de nhap hoc vien do hoa"
					+ "\nNhan 2 de nhap hoc vien lap trinh");
			int luaChon=sc.nextInt();
			if(luaChon==1) {
				HocVien hocVien=new HocVienDH();
				hocVien.nhapThongTin();
				hv.add(hocVien);
			}
			else {
				HocVien hocVien=new HocVienLT();
				hocVien.nhapThongTin();
				hv.add(hocVien);
			}
		}
		System.out.println("\n-----------Danh sach hoc vien:------------ ");
		for(HocVien x:hv) {
			x.inThongTin();
			System.out.print("\n");
		}
		
	}
}
