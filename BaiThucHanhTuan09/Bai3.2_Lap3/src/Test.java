import java.util.Scanner;

public class Test {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	TAMGIAC tga;
	DUONGTRON dt;
	dt=new DUONGTRON();
	tga=new TAMGIAC();
	tga.nhapTG();
	if(tga.kiemtraTG()==1) {
		System.out.println("3 diem vua nhap co tao thanh tam giac!");
		System.out.println("Chu vi tam giac: "+tga.tinhChuVi());
		System.out.println("Dien tich tam giac: "+tga.tinhDienTich());
	}
	else {
		System.out.println("3 diem vua nhap khong tao thanh tam giac");
	}
	dt.nhapDT();
	System.out.println("Chu vi hinh tron: "+dt.tinhChuVi());
	System.out.println("Dien tich hinh tron: "+dt.tinhDienTich());
	
}
}
