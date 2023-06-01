
public class BenhNhan extends Nguoi {
	private String tienSu;
	private String chuanDoan;
	private BenhVien benhVien;
	public BenhNhan(String ten,int tuoi,String gioiTinh,String tienSu, String chuanDoan, BenhVien benhVien) {
		super(ten,tuoi,gioiTinh);
		this.tienSu = tienSu;
		this.chuanDoan = chuanDoan;
		this.benhVien = benhVien;
	}
	public String getTienSu() {
		return tienSu;
	}
	public void setTienSu(String tienSu) {
		this.tienSu = tienSu;
	}
	public String getChuanDoan() {
		return chuanDoan;
	}
	public void setChuanDoan(String chuanDoan) {
		this.chuanDoan = chuanDoan;
	}
	@Override
	public String toString() {
		return "BenhNhan: "+super.toString()+"|Tien Su: " + tienSu + "| Chuan Doan: " + chuanDoan + "| Benh Vien: " + benhVien + "|";
	}
	
	
	
}
