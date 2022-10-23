package Entity;

import java.sql.Date;
import java.sql.Time;

public class ChiTietDDP {
	private DonDatPhong maDonDatPhong;
	private Phong maPhong;
	private int soLuong;
	private Date ngayDen;
	private Time gioDen;
	private String trangThai;
	public DonDatPhong getMaDonDatPhong() {
		return maDonDatPhong;
	}
	public void setMaDonDatPhong(DonDatPhong maDonDatPhong) {
		this.maDonDatPhong = maDonDatPhong;
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
	public Date getNgayDen() {
		return ngayDen;
	}
	public void setNgayDen(Date ngayDen) {
		this.ngayDen = ngayDen;
	}
	public Time getGioDen() {
		return gioDen;
	}
	public void setGioDen(Time gioDen) {
		this.gioDen = gioDen;
	}
	public String getTrangThai() {
		return trangThai;
	}
	public void setTrangThai(String trangThai) {
		this.trangThai = trangThai;
	}
	@Override
	public String toString() {
		return "ChiTietDDP [maDonDatPhong=" + maDonDatPhong + ", maPhong=" + maPhong + ", soLuong=" + soLuong
				+ ", ngayDen=" + ngayDen + ", gioDen=" + gioDen + ", trangThai=" + trangThai + "]";
	}
	public ChiTietDDP(DonDatPhong maDonDatPhong, Phong maPhong, int soLuong, Date ngayDen, Time gioDen,
			String trangThai) {
		super();
		this.maDonDatPhong = maDonDatPhong;
		this.maPhong = maPhong;
		this.soLuong = soLuong;
		this.ngayDen = ngayDen;
		this.gioDen = gioDen;
		this.trangThai = trangThai;
	}
	public ChiTietDDP() {
		super();
		// TODO Auto-generated constructor stub
	}
	
}
