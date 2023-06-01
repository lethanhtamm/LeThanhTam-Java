import java.util.Scanner;

public class GVThinhGiang extends GiangVien {
	private int soTietDay;
	private static double donGia=100000;
	public GVThinhGiang() {}
	public GVThinhGiang(String hoTen,String diaChi,String loaiGiangVien,int soTietDay) {
		super(hoTen,diaChi,"Giang vien thinh giang");
		this.soTietDay=soTietDay;
	}
	@Override 
	public void nhapTT() {
		Scanner sc=new Scanner(System.in);
		super.nhapTT();
		System.out.println("Nhap so tiet day: ");
		soTietDay=sc.nextInt();
	}
	@Override
	public double tinhLuong() {
		double thuNhap=0.15*soTietDay*donGia; 
		return soTietDay*donGia-thuNhap;
	}

}
