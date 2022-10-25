package Dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import Connect.ConnectDB;
import Entity.DonDatPhong;
import Entity.NhanVien;
import Entity.KhachHang;



public class DaoDatPhong {
	public boolean themDDP(DonDatPhong ddp) throws SQLException {
		ConnectDB.getinstance();
		Connection con = ConnectDB.getConnection();
		try {
			PreparedStatement ps = con.prepareStatement("insert into DonDatPhong values (?,?,?,?)");
			ps.setString(1, ddp.getMaDonDatPhong());
			ps.setString(2,ddp.getMaNV().getMaNV());
			ps.setString(3, ddp.getMaKH().getMaKhangHang());
			ps.setDate(4, ddp.getNgayLap());

			return ps.executeUpdate() > 0;
		} catch (SQLException e) {
			e.printStackTrace();
		}
		con.close();
		return false;
	}
public boolean capNhatDDP(DonDatPhong ddp, String ma) throws SQLException {
		Connection con = ConnectDB.getConnection();
		String sql = "update DonDatPhong set ngayLap = ? where maDDP like '"+ma+"'";
		try {
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setDate(1, ddp.getNgayLap());
			return ps.executeUpdate() > 0;
		} catch (SQLException e) {
			e.printStackTrace();
		}
		con.close();
		return false;
	}
public ArrayList<DonDatPhong> getAllDanhSachDDP() {
	ArrayList<DonDatPhong> lsDDP = new ArrayList<DonDatPhong>();
	ConnectDB.getinstance();
	Connection con = ConnectDB.getConnection();
	try {
		PreparedStatement ps = con.prepareStatement("select * from DonDatPhong");
		ResultSet rs = ps.executeQuery();
		while(rs.next()) {
			DonDatPhong ddp = new DonDatPhong();
			ddp.setMaDonDatPhong(rs.getString(1));
			ddp.setMaNV(new NhanVien(rs.getString(2)));
			ddp.setMaKH(new KhachHang(rs.getString(3)));
			ddp.setNgayLap(rs.getDate(4));
//			ddp.setNhanVien(new NhanVien(rs.getString(4)));
//			ddp.setNgayLap(rs.getDate(5));
//			ddp.setGioDen(rs.getTime(6));
//			ddp.setNgayDen(rs.getDate(7));
//			ddp.setTrangThaiDDP(rs.getString(8));
//			lsDDP.add(ddp);
		}
	} catch (SQLException e) {
		e.printStackTrace();
	}
	return lsDDP;
}


	
	
	
	
	
	
	
	
	
	
	

}
