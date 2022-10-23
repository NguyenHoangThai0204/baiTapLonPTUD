package Entity;

import java.util.Objects;

import Entity.LoaiPhong;

public class Phong {
	private String maPhong;
	private String tinhTrangPhong;
	private double giaPhong;
	private int sucChua;
	private String moTa;
	private LoaiPhong loaiPhong;
	public String getMaPhong() {
		return maPhong;
	}
	public void setMaPhong(String maPhong) {
		this.maPhong = maPhong;
	}
	public String getTinhTrangPhong() {
		return tinhTrangPhong;
	}
	public void setTinhTrangPhong(String tinhTrangPhong) {
		this.tinhTrangPhong = tinhTrangPhong;
	}
	public double getGiaPhong() {
		return giaPhong;
	}
	public void setGiaPhong(double giaPhong) {
		this.giaPhong = giaPhong;
	}
	public int getSucChua() {
		return sucChua;
	}
	public void setSucChua(int sucChua) {
		this.sucChua = sucChua;
	}
	public String getMoTa() {
		return moTa;
	}
	public void setMoTa(String moTa) {
		this.moTa = moTa;
	}
	public LoaiPhong getLoaiPhong() {
		return loaiPhong;
	}
	public void setLoaiPhong(LoaiPhong loaiPhong) {
		this.loaiPhong = loaiPhong;
	}
	@Override
	public String toString() {
		return "Phong [maPhong=" + maPhong + ", tinhTrangPhong=" + tinhTrangPhong + ", giaPhong=" + giaPhong
				+ ", sucChua=" + sucChua + ", moTa=" + moTa + ", loaiPhong=" + loaiPhong + "]";
	}
	public Phong(String maPhong, String tinhTrangPhong, double giaPhong, int sucChua, String moTa,
			LoaiPhong loaiPhong) {
		super();
		this.maPhong = maPhong;
		this.tinhTrangPhong = tinhTrangPhong;
		this.giaPhong = giaPhong;
		this.sucChua = sucChua;
		this.moTa = moTa;
		this.loaiPhong = loaiPhong;
	}
	public Phong() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public int hashCode() {
		return Objects.hash(maPhong);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Phong other = (Phong) obj;
		return Objects.equals(maPhong, other.maPhong);
	}
}
