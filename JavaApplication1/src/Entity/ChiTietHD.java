package Entity;

import java.sql.Time;

public class ChiTietHD {
	private HoaDon maHD;
	private MatHang maMH;
	private Phong maPhong;
	private int soLuong;
	private Time gioVao;
	private Time gioRa;
	private String trangThaiCTHD;
	public HoaDon getMaHD() {
		return maHD;
	}
	public void setMaHD(HoaDon maHD) {
		this.maHD = maHD;
	}
	public MatHang getMaMH() {
		return maMH;
	}
	public void setMaMH(MatHang maMH) {
		this.maMH = maMH;
	}
	public Phong getMaPhong() {
		return maPhong;
	}
	public void setMaPhong(Phong maPhong) {
		this.maPhong = maPhong;
	}
	public int getSoLuong() {
		return soLuong;
	}
	public void setSoLuong(int soLuong) {
		this.soLuong = soLuong;
	}
	public Time getGioVao() {
		return gioVao;
	}
	public void setGioVao(Time gioVao) {
		this.gioVao = gioVao;
	}
	public Time getGioRa() {
		return gioRa;
	}
	public void setGioRa(Time gioRa) {
		this.gioRa = gioRa;
	}
	public String getTrangThaiCTHD() {
		return trangThaiCTHD;
	}
	public void setTrangThaiCTHD(String trangThaiCTHD) {
		this.trangThaiCTHD = trangThaiCTHD;
	}
	@Override
	public String toString() {
		return "ChiTietHD [maHD=" + maHD + ", maMH=" + maMH + ", maPhong=" + maPhong + ", soLuong=" + soLuong
				+ ", gioVao=" + gioVao + ", gioRa=" + gioRa + ", trangThaiCTHD=" + trangThaiCTHD + "]";
	}
	public ChiTietHD(HoaDon maHD, MatHang maMH, Phong maPhong, int soLuong, Time gioVao, Time gioRa,
			String trangThaiCTHD) {
		super();
		this.maHD = maHD;
		this.maMH = maMH;
		this.maPhong = maPhong;
		this.soLuong = soLuong;
		this.gioVao = gioVao;
		this.gioRa = gioRa;
		this.trangThaiCTHD = trangThaiCTHD;
	}
	public ChiTietHD() {
		super();
		// TODO Auto-generated constructor stub
	}
	
}
