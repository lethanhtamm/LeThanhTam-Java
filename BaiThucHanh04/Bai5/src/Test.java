
public class Test {
	public static void main(String[] args) {
		GiangVien gv1=new GVCoHuu();
		GiangVien gv2=new GVThinhGiang();
		System.out.println("Nhap thong tin giang vien 1:");
		gv1.nhapTT();
		System.out.println("nhap thong tin giang vien 2:");
		gv2.nhapTT();
		System.out.println("In thong tin: ");
		gv1.inTT();
		System.out.print("\n");
		gv2.inTT();
		
		
	}
}
