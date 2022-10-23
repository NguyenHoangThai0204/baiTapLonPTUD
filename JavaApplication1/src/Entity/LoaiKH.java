package Entity;

import java.util.Objects;

public class LoaiKH {
	private String maLoaiKH;
	private String tenLoaiKH;
	public String getMaLoaiKH() {
		return maLoaiKH;
	}
	public void setMaLoaiKH(String maLoaiKH) {
		this.maLoaiKH = maLoaiKH;
	}
	public String getTenLoaiKH() {
		return tenLoaiKH;
	}
	public void setTenLoaiKH(String tenLoaiKH) {
		this.tenLoaiKH = tenLoaiKH;
	}
	public LoaiKH(String maLoaiKH, String tenLoaiKH) {
		super();
		this.maLoaiKH = maLoaiKH;
		this.tenLoaiKH = tenLoaiKH;
	}
	public LoaiKH() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "LoaiKhachHang [maLoaiKH=" + maLoaiKH + ", tenLoaiKH=" + tenLoaiKH + "]";
	}
	@Override
	public int hashCode() {
		return Objects.hash(maLoaiKH);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		LoaiKH other = (LoaiKH) obj;
		return Objects.equals(maLoaiKH, other.maLoaiKH);
	}
	
}
