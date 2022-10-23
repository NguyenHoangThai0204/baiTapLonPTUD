package Entity;

public class MatHang {
	private String maMH;
	private String tenMH;
	private int soLuong;
	private double giaMH;
	private LoaiMH loaiMatHang;
	public String getMaMH() {
		return maMH;
	}
	public void setMaMH(String maMH) {
		this.maMH = maMH;
	}
	public String getTenMH() {
		return tenMH;
	}
	public void setTenMH(String tenMH) {
		this.tenMH = tenMH;
	}
	public int getSoLuong() {
		return soLuong;
	}
	public void setSoLuong(int soLuong) {
		this.soLuong = soLuong;
	}
	public double getGiaMH() {
		return giaMH;
	}
	public void setGiaMH(double giaMH) {
		this.giaMH = giaMH;
	}
	public LoaiMH getLoaiMatHang() {
		return loaiMatHang;
	}
	public void setLoaiMatHang(LoaiMH loaiMatHang) {
		this.loaiMatHang = loaiMatHang;
	}
	@Override
	public String toString() {
		return "MatHang [maMH=" + maMH + ", tenMH=" + tenMH + ", soLuong=" + soLuong + ", giaMH=" + giaMH
				+ ", loaiMatHang=" + loaiMatHang + "]";
	}
	public MatHang() {
		super();
		// TODO Auto-generated constructor stub
	}
	public MatHang(String maMH, String tenMH, int soLuong, double giaMH, LoaiMH loaiMatHang) {
		super();
		this.maMH = maMH;
		this.tenMH = tenMH;
		this.soLuong = soLuong;
		this.giaMH = giaMH;
		this.loaiMatHang = loaiMatHang;
	}
	
}
