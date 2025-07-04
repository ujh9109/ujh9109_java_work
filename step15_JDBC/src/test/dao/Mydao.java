package test.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import test.dto.MemberDto;
import test.dto.MyDto;
import test.util.DBConnector;

public class Mydao {
	
	public MyDto getByNum(int num ) {
		MyDto dto = null;
		
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;

		try {
			conn = new DBConnector().getConn();
			String sql = """
					Select num,name,position,team,isworldclass
					from players
					where num = ?
					""";

			pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, num);

			rs = pstmt.executeQuery();
			while (rs.next()) {
				dto = new MyDto();
	            dto.setNum(rs.getInt("num"));
	            dto.setName(rs.getString("name"));
	            dto.setPosition(rs.getString("position"));
	            dto.setTeam(rs.getString("team"));
	            dto.setIsWorldClass(rs.getString("isworldclass"));
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if (rs != null)
					rs.close();
				if (pstmt != null)
					pstmt.close();
				if (conn != null)
					conn.close();
			} catch (Exception e) {
			}
		}
		return dto;
	}
	
	public List<MyDto> SelectAll(){
		
		List<MyDto> list = new ArrayList<>();
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;

		try {
			conn = new DBConnector().getConn();
			String sql = """
					Select num,name,position,team,isworldclass
					from players
					order by num asc
					""";

			pstmt = conn.prepareStatement(sql);

			rs = pstmt.executeQuery();
			while (rs.next()) {
				MyDto dto = new MyDto();
				dto.setName(rs.getString("name"));
				dto.setNum(rs.getInt("num"));
				dto.setPosition(rs.getString("position"));
				dto.setTeam(rs.getString("team"));
				dto.setIsWorldClass(rs.getString("isWorldClass"));
				list.add(dto);
				} 
			
		}catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if (rs != null)
					rs.close();
				if (pstmt != null)
					pstmt.close();
				if (conn != null)
					conn.close();
			} catch (Exception e) {
			}
		}
		return list;

	}

	public boolean update(MyDto dto) {
		Connection conn = null;
		PreparedStatement pstmt = null;

		int rowCount = 0;
		try {
			conn = new DBConnector().getConn();
			String sql = """
					UPDATE players
					SET name = ?, team = ?, position = ?, isWorldClass = ?
					WHERE num = ?
					""";

			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, dto.getName());
			pstmt.setString(2, dto.getTeam());
			pstmt.setString(3, dto.getPosition());
			pstmt.setString(4, dto.getIsWorldClass());
			pstmt.setInt(5, dto.getNum());
			rowCount = pstmt.executeUpdate();

		} catch (Exception e) {
			e.printStackTrace();
		} finally {

			try {

				if (pstmt != null)
					pstmt.close();
				if (conn != null)
					conn.close();
			} catch (Exception e) {
			}
		}

		if (rowCount > 0) {
			return true;
		} else {
			return false;
		}
	}
	
	public boolean insert(MyDto dto) {
		Connection conn = null;
		PreparedStatement pstmt = null;

		int rowCount = 0;
		try {
			conn = new DBConnector().getConn();
			String sql = """
					insert into players
					(num, name, position,team,isworldclass)
					values(players_seq.NEXTVAL, ?,?,?,?)
					""";

			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1,dto.getName());
			pstmt.setString(2,dto.getPosition());
			pstmt.setString(3,dto.getTeam());
			pstmt.setString(4,dto.getIsWorldClass());

			rowCount = pstmt.executeUpdate();

		} catch (Exception e) {
			e.printStackTrace();
		} finally {

			try {

				if (pstmt != null)
					pstmt.close();
				if (conn != null)
					conn.close();
			} catch (Exception e) {
			}
		}

		if (rowCount > 0) {
			return true;
		} else {
			return false;
		}
	}
	
	public boolean deleteByNum(int num) {
		Connection conn = null;
		PreparedStatement pstmt = null;

		int rowCount = 0;
		try {
			conn = new DBConnector().getConn();
			String sql = """
					delete from players
					where num = ?
					""";

			pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, num);
			rowCount = pstmt.executeUpdate();

		} catch (Exception e) {
			e.printStackTrace();
		} finally {

			try {

				if (pstmt != null)
					pstmt.close();
				if (conn != null)
					conn.close();
			} catch (Exception e) {
			}
		}

		if (rowCount > 0) {
			return true;
		} else {
			return false;
		}
	}
	
}
