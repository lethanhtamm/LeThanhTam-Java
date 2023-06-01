import java.util.Scanner;

public class GVCoHuu extends GiangVien {
	private double luongCoBan=3000000;
	private int namCongTac;
	public GVCoHuu() {}
	public GVCoHuu(String hoTen,String diaChi,String loaiGiangVien,int namCongTac) {
		super(hoTen,diaChi,"Giang Vien Co Huu");
		this.namCongTac=namCongTac;
	}
	@Override
	public void nhapTT() {
		Scanner sc=new Scanner(System.in);
		super.nhapTT();
		System.out.println("Nhap so nam cong tac: ");
		namCongTac=sc.nextInt();
		sc.nextLine();
	}
	@Override
	public double tinhLuong() {
		if(namCongTac<5) return luongCoBan*3;
		else return luongCoBan*3+namCongTac*luongCoBan/100;		
	}
	
}
