
public class TAMGIAC extends DIEM {
	private DIEM A,B,C;
	
	public void nhapTG() {
		A=new DIEM();
		B=new DIEM();
		C=new DIEM();
		System.out.println("Nhap vao toa do diem A: ");
		A.nhapDiem();
		System.out.println("Nhap vao toa do diem B: ");
		B.nhapDiem();
		System.out.println("Nhap vao toa do diem C: ");
		C.nhapDiem();
	}
	public int kiemtraTG() {
		int kiemtra=0;
		double AB=Math.sqrt(Math.pow(B.getX()-A.getX(),2)+Math.pow(B.getY()-A.getY(),2));
		double AC=Math.sqrt(Math.pow(C.getX()-A.getX(),2)+Math.pow(C.getY()-A.getY(),2));
		double BC=Math.sqrt(Math.pow(C.getX()-B.getX(),2)+Math.pow(C.getY()-B.getY(),2));
		if(AB+AC>BC && AB+BC>AC && BC+AC>AB) {
			kiemtra=1;}
		return kiemtra;
	}
	public double tinhChuVi() {
		double AB=Math.sqrt(Math.pow(B.getX()-A.getX(),2)+Math.pow(B.getY()-A.getY(),2));
		double AC=Math.sqrt(Math.pow(C.getX()-A.getX(),2)+Math.pow(C.getY()-A.getY(),2));
		double BC=Math.sqrt(Math.pow(C.getX()-B.getX(),2)+Math.pow(C.getY()-B.getY(),2));
		return AB+BC+AC;
	}
	public double tinhDienTich() {
		double AB=Math.sqrt(Math.pow(B.getX()-A.getX(),2)+Math.pow(B.getY()-A.getY(),2));
		double AC=Math.sqrt(Math.pow(C.getX()-A.getX(),2)+Math.pow(C.getY()-A.getY(),2));
		double BC=Math.sqrt(Math.pow(C.getX()-B.getX(),2)+Math.pow(C.getY()-B.getY(),2));
		double p = (AB + BC + AC) / 2;
        return Math.sqrt(p * (p - AB) * (p - BC) * (p - AC));
	}
	

}
