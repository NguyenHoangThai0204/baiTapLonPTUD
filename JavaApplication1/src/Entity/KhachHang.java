package Entity;

import java.sql.Date;
import java.util.Objects;

public class KhachHang {
	private String maKH;
	private String tenKH;
	private String diaChi;
	private String sdt;
	private String cccd;
	private Date ngaySinh;
	private String gioiTinh;
	private int diemTichLuy;
	private Date ngayDK;
	@Override
	public int hashCode() {
		return Objects.hash(maKH);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		KhachHang other = (KhachHang) obj;
		return Objects.equals(maKH, other.maKH);
	}
	public KhachHang() {
		super();
		// TODO Auto-generated constructor stub
	}
	public KhachHang(String maKhangHang) {
		super();
		this.maKH = maKhangHang;
	}
	@Override
	public String toString() {
		return "KhachHang [maKhangHang=" + maKH + ", tenKH=" + tenKH + ", diaChi=" + diaChi + ", sdt=" + sdt
				+ ", cccd=" + cccd + ", ngaySinh=" + ngaySinh + ", gioiTinh=" + gioiTinh + ", diemTichLuy="
				+ diemTichLuy + ", ngayDK=" + ngayDK + ", loaiKH=" + loaiKH + "]";
	}
	public KhachHang(String maKhangHang, String tenKH, String diaChi, String sdt, String cccd, Date ngaySinh,
			String gioiTinh, int diemTichLuy, Date ngayDK, LoaiKH loaiKH) {
		super();
		this.maKH = maKhangHang;
		this.tenKH = tenKH;
		this.diaChi = diaChi;
		this.sdt = sdt;
		this.cccd = cccd;
		this.ngaySinh = ngaySinh;
		this.gioiTinh = gioiTinh;
		this.diemTichLuy = diemTichLuy;
		this.ngayDK = ngayDK;
		this.loaiKH = loaiKH;
	}
	public String getMaKhangHang() {
		return maKH;
	}
	public void setMaKhangHang(String maKH) {
		this.maKH = maKH;
	}
	public String getTenKH() {
		return tenKH;
	}
	public void setTenKH(String tenKH) {
		this.tenKH = tenKH;
	}
	public String getDiaChi() {
		return diaChi;
	}
	public void setDiaChi(String diaChi) {
		this.diaChi = diaChi;
	}
	public String getSdt() {
		return sdt;
	}
	public void setSdt(String sdt) {
		this.sdt = sdt;
	}
	public String getCccd() {
		return cccd;
	}
	public void setCccd(String cccd) {
		this.cccd = cccd;
	}
	public Date getNgaySinh() {
		return ngaySinh;
	}
	public void setNgaySinh(Date ngaySinh) {
		this.ngaySinh = ngaySinh;
	}
	public String getGioiTinh() {
		return gioiTinh;
	}
	public void setGioiTinh(String gioiTinh) {
		this.gioiTinh = gioiTinh;
	}
	public int getDiemTichLuy() {
		return diemTichLuy;
	}
	public void setDiemTichLuy(int diemTichLuy) {
		this.diemTichLuy = diemTichLuy;
	}
	public Date getNgayDK() {
		return ngayDK;
	}
	public void setNgayDK(Date ngayDK) {
		this.ngayDK = ngayDK;
	}
	public LoaiKH getLoaiKH() {
		return loaiKH;
	}
	public void setLoaiKH(LoaiKH loaiKH) {
		this.loaiKH = loaiKH;
	}
	private LoaiKH loaiKH;
}
