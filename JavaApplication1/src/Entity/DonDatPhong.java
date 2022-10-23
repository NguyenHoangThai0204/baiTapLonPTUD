package Entity;

import java.sql.Date;
import java.util.Objects;

public class DonDatPhong {
	private String maDonDatPhong;
	private NhanVien maNV;
	private KhachHang maKH;
	private Date ngayLap;
	public String getMaDonDatPhong() {
		return maDonDatPhong;
	}
	public void setMaDonDatPhong(String maDonDatPhong) {
		this.maDonDatPhong = maDonDatPhong;
	}
	public NhanVien getMaNV() {
		return maNV;
	}
	public void setMaNV(NhanVien maNV) {
		this.maNV = maNV;
	}
	public KhachHang getMaKH() {
		return maKH;
	}
	public void setMaKH(KhachHang maKH) {
		this.maKH = maKH;
	}
	public Date getNgayLap() {
		return ngayLap;
	}
	public void setNgayLap(Date ngayLap) {
		this.ngayLap = ngayLap;
	}
	@Override
	public int hashCode() {
		return Objects.hash(maDonDatPhong);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		DonDatPhong other = (DonDatPhong) obj;
		return Objects.equals(maDonDatPhong, other.maDonDatPhong);
	}
	@Override
	public String toString() {
		return "DonDatPhong [maDonDatPhong=" + maDonDatPhong + ", maNV=" + maNV + ", maKH=" + maKH + ", ngayLap="
				+ ngayLap + "]";
	}
	public DonDatPhong(String maDonDatPhong, NhanVien maNV, KhachHang maKH, Date ngayLap) {
		super();
		this.maDonDatPhong = maDonDatPhong;
		this.maNV = maNV;
		this.maKH = maKH;
		this.ngayLap = ngayLap;
	}
	public DonDatPhong() {
		super();
		// TODO Auto-generated constructor stub
	}
	
}
