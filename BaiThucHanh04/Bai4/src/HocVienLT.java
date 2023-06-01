
public class HocVienLT extends HocVien {
	public HocVienLT() {}
	public HocVienLT(String hoTen,String diaChi,String loaiChuongTrinh,int soBuoiHoc,int loaiUuTien) {
		super(hoTen,diaChi,"Lap Trinh",soBuoiHoc,loaiUuTien);
	}
	@Override
	public double hocPhi() {
		if(loaiUuTien==1)return soBuoiHoc*100000-1000000;
		else if(loaiUuTien==2) return soBuoiHoc*100000-800000;
		else return soBuoiHoc*100000;
	
}
}
