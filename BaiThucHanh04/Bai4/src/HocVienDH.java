
public class HocVienDH extends HocVien{
	public HocVienDH() {}
	public HocVienDH(String hoTen,String diaChi,String loaiChuongTrinh,int soBuoiHoc,int loaiUuTien) {
		super(hoTen,diaChi,"Do Hoa",soBuoiHoc,loaiUuTien);	
	}

	@Override
	public double hocPhi() {
		if(loaiUuTien==1) {
			return soBuoiHoc*50000-1000000;
		}else if(loaiUuTien==2) return soBuoiHoc*50000-500000;
		else return soBuoiHoc*50000;
	}
	
	
}
