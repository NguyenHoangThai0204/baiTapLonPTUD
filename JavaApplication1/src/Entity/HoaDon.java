package Entity;

import java.sql.Date;
import java.sql.Time;
import java.util.Objects;

public class HoaDon {
	private String maHD;
	private Date ngayLap;
	private String phuThu;
	private NhanVien nhanVien;
	private KhachHang khachHang;
	private double tienThua;
	public String getMaHD() {
		return maHD;
	}
	public void setMaHD(String maHD) {
		this.maHD = maHD;
	}
	public Date getNgayLap() {
		return ngayLap;
	}
	public void setNgayLap(Date ngayLap) {
		this.ngayLap = ngayLap;
	}
	public String getPhuThu() {
		return phuThu;
	}
	public void setPhuThu(String phuThu) {
		this.phuThu = phuThu;
	}
	public NhanVien getNhanVien() {
		return nhanVien;
	}
	public void setNhanVien(NhanVien nhanVien) {
		this.nhanVien = nhanVien;
	}
	public KhachHang getKhachHang() {
		return khachHang;
	}
	public void setKhachHang(KhachHang khachHang) {
		this.khachHang = khachHang;
	}
	public double getTienThua() {
		return tienThua;
	}
	public void setTienThua(double tienThua) {
		this.tienThua = tienThua;
	}
	@Override
	public int hashCode() {
		return Objects.hash(maHD);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		HoaDon other = (HoaDon) obj;
		return Objects.equals(maHD, other.maHD);
	}
	public HoaDon(String maHD, Date ngayLap, String phuThu, NhanVien nhanVien, KhachHang khachHang, double tienThua) {
		super();
		this.maHD = maHD;
		this.ngayLap = ngayLap;
		this.phuThu = phuThu;
		this.nhanVien = nhanVien;
		this.khachHang = khachHang;
		this.tienThua = tienThua;
	}
	@Override
	public String toString() {
		return "HoaDon [maHD=" + maHD + ", ngayLap=" + ngayLap + ", phuThu=" + phuThu + ", nhanVien=" + nhanVien
				+ ", khachHang=" + khachHang + ", tienThua=" + tienThua + "]";
	}
	public HoaDon() {
		super();
		// TODO Auto-generated constructor stub
	}
	
}
