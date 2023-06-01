import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class SinhVien {
	private String maSinhVien,hoTen,lop;
	public SinhVien(String maSinhVien,String hoTen,String lop) {
		this.maSinhVien=maSinhVien;
		this.hoTen=hoTen;
		this.lop=lop;
	}
	public String getMaSinhVien() {
		return maSinhVien;
	}
	public String getHoTen() {
		return hoTen;
	}
	public String getLop() {
		return lop;
	}
	private static void nhapDanhSachSinhVien(Map<String, SinhVien> danhSachSinhVien) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Nhap so luong sinh vien: ");
		int n=sc.nextInt();
		sc.nextLine();
		for(int i=0;i<n;i++) {
			System.out.println("Nhap sinh vien thu "+(i+1));
			System.out.println("Nhap ma sinh vien: ");
			String maSinhVien=sc.nextLine();
			System.out.println("Nhap ho va ten: ");
			String hoTen=sc.nextLine();
			System.out.println("Nhap lop: ");
			String lop=sc.nextLine();
			SinhVien sinhVien=new SinhVien(maSinhVien,hoTen,lop);
			danhSachSinhVien.put(maSinhVien, sinhVien);
		}
		System.out.println("Sinh vien da duoc them vao danh sach!");
		System.out.println("-------------------------------------");
	}
	private static void hienThiSinhVienTheoLop(Map<String, SinhVien> danhSachSinhVien) {
		System.out.println("Nhap Lop: ");
		Scanner sc=new Scanner(System.in);
		String lop=sc.nextLine();
		System.out.println("Danh sach sinh vien theo "+lop+": ");
		for(SinhVien sinhVien : danhSachSinhVien.values()) {
			if(sinhVien.getLop().equalsIgnoreCase(lop)) {
				System.out.println("Ma sinh vien: "+sinhVien.getMaSinhVien());
				System.out.println("ho va ten: "+sinhVien.getHoTen());
				System.out.println("---------------------------------");
			}
		}
	}
	private static void hienThiSinhVien(Map<String, SinhVien> danhSachSinhVien) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Nhap ma sinh vien: ");
		String maSinhVien=sc.nextLine();
		SinhVien sinhVien=danhSachSinhVien.get(maSinhVien);
		if(sinhVien != null) {
			System.out.println("Ho va ten: "+sinhVien.getHoTen());
			System.out.println("Lop: "+sinhVien.getLop());
			
		}else {
			System.out.println("Khong tim thay sinh vien!");
		}
	}
	public static void main(String[] args) {
		Map<String, SinhVien> danhSachSinhVien=new HashMap<>();
		nhapDanhSachSinhVien(danhSachSinhVien);
		hienThiSinhVienTheoLop(danhSachSinhVien);
		hienThiSinhVien(danhSachSinhVien);
	}
}
