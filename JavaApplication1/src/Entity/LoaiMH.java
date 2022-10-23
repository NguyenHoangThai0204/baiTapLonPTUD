package Entity;

import java.util.Objects;

public class LoaiMH {
	private String maLoaiMH;
	private String tenLoaiMH;
	public String getMaLoaiMH() {
		return maLoaiMH;
	}
	public void setMaLoaiMH(String maLoaiMH) {
		this.maLoaiMH = maLoaiMH;
	}
	public String getTenLoaiMH() {
		return tenLoaiMH;
	}
	public void setTenLoaiMH(String tenLoaiMH) {
		this.tenLoaiMH = tenLoaiMH;
	}
	@Override
	public int hashCode() {
		return Objects.hash(maLoaiMH);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		LoaiMH other = (LoaiMH) obj;
		return Objects.equals(maLoaiMH, other.maLoaiMH);
	}
	@Override
	public String toString() {
		return "LoaiMH [maLoaiMH=" + maLoaiMH + ", tenLoaiMH=" + tenLoaiMH + "]";
	}
	public LoaiMH(String maLoaiMH, String tenLoaiMH) {
		super();
		this.maLoaiMH = maLoaiMH;
		this.tenLoaiMH = tenLoaiMH;
	}
	public LoaiMH() {
		super();
		// TODO Auto-generated constructor stub
	}
}
