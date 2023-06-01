import java.util.Scanner;

public abstract class GiangVien {
	protected String hoTen;
	protected String diaChi;
	protected String loaiGiangVien;
	public GiangVien() {}
	public GiangVien(String hoTen,String diaChi,String loaiGiangVien) {
		this.hoTen=hoTen;
		this.diaChi=diaChi;
		this.loaiGiangVien=loaiGiangVien;
	}
	public void nhapTT() {
		Scanner sc=new Scanner(System.in);
		System.out.println("Nhap ho va ten: ");
		hoTen=sc.nextLine();
		System.out.println("Nhap dia chi: ");
		diaChi=sc.nextLine();
		System.out.println("Nhap loai giang vien: ");
		loaiGiangVien=sc.nextLine();
	}
	public abstract double tinhLuong() ;
	public void inTT() {
		System.out.printf("|Ho ten: %15s\t|Dia chi: %15s\t|\t%10s\t|Luong thang: %.2f\t|",hoTen,diaChi,loaiGiangVien,tinhLuong());
	}
}
