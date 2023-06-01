import java.util.Scanner;

public class DUONGTRON extends DIEM {
	Scanner sc=new Scanner(System.in);
	private int r;
	private DIEM tam;

	public void nhapDT() {
		tam=new DUONGTRON();
		System.out.println("Nhap vao toa do tam :");
		tam.nhapDiem();
		System.out.println("Nhap ban kinh duong tron:");
		r=sc.nextInt();
	}
	public double tinhChuVi() {
		return Math.PI*2*r;
	}
	public double tinhDienTich() {
		return 2*Math.PI*r*r;
	}
}
