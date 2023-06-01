import java.util.Scanner;

public abstract class HocVien {
	protected String hoTen,diaChi,loaiChuongTrinh;
	protected int soBuoiHoc,loaiUuTien;
	public HocVien() {}
	public HocVien(String hoTen,String diaChi,String loaiChuongTrinh,int soBuoiHoc,int loaiUuTien) {
		this.hoTen=hoTen;
		this.diaChi=diaChi;
		this.loaiChuongTrinh=loaiChuongTrinh;
		this.soBuoiHoc=soBuoiHoc;
		this.loaiUuTien=loaiUuTien;
	}
	public void nhapThongTin() {
		Scanner sc=new Scanner(System.in);
		System.out.println("Nhap ho va ten: ");
		hoTen=sc.nextLine();
		System.out.println("Nhap dia chi: ");
		diaChi=sc.nextLine();
		System.out.println("Nhap loai chuong trinh: ");
		loaiChuongTrinh=sc.nextLine();
		System.out.println("Nhap so buoi hoc: ");
		soBuoiHoc=sc.nextInt();
		sc.nextLine();
		System.out.println("Nhap loai uu tien");
		loaiUuTien=sc.nextInt();
	};
	public abstract double hocPhi();
	public void inThongTin() {
		System.out.printf("|Ho ten: %15s|\tDia chi: %15s|\tLoai Chuong Trinh:%15s|\tLoai Uu Tien: %2d|\tHoc Phi:%.2f",hoTen,diaChi,loaiChuongTrinh,loaiUuTien,hocPhi());
	}
}
