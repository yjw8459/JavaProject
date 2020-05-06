package Ex06.Ex01Login.Data;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import Ex06.Ex01Login.Member;

public class MembershipManageImpl implements IMembershipManage {
	final static String DRIVER = "org.sqlite.JDBC";
	final static String DB = "jdbc:sqlite:/Users/yjw8459/desktop/에이콘아카데미/DB/DB.db";
	Connection conn;
	public MembershipManageImpl() {
		try {
			Class.forName(DRIVER);
			conn = DriverManager.getConnection(DB);
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	@Override
	public boolean MembershipProc(Member member) {
		String sql = 	"INSERT INTO member "+
						"(name, id, pw, gender, age, hobby) "+
						"VALUES (?,?,?,?,?,?)";
		
		try {
			PreparedStatement pStmt = conn.prepareStatement(sql);
			
			pStmt.setString(1, member.getName());
			pStmt.setString(2, member.getId());
			pStmt.setString(3, member.getPw());
			pStmt.setInt(4, member.getGender());
			pStmt.setString(5, member.getAge());
			pStmt.setInt(6, member.getHobby());
			
			pStmt.executeUpdate();
			
			pStmt.close();
			conn.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			//e.printStackTrace();
			return false;
		}
		return true;
	}

	@Override
	public int LoginProc(String id, String pw) {
		String sql = 	"SELECT count(*) "+
						"FROM member "+
						"WHERE id=? "+
						"AND pw=?";
		int result =0;
		try {
			PreparedStatement pStmt = conn.prepareStatement(sql);
			
			pStmt.setString(1, id);
			pStmt.setString(2, pw);
			
			ResultSet rs = pStmt.executeQuery();
			
			if(rs.next())
				result = rs.getInt("count(*)");
			
			pStmt.close();
			conn.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			//e.printStackTrace();
			//return result;
		}
		return result;
	}
	@Override
	public List<Member> getMember() {
		String sql = "SELECT * "
				+ "FROM member";
		List<Member> lstMember = new ArrayList<Member>();
		try {
		PreparedStatement pStmt = conn.prepareStatement(sql);
		
		ResultSet rs = pStmt.executeQuery();
		while(rs.next()) {
			Member member = new Member();
			
			member.setName(rs.getString("name"));
			member.setId(rs.getString("id"));
			member.setPw(rs.getString("pw"));
			member.setAge(rs.getString("age"));
			member.setGender(rs.getInt("gender"));
			member.setHobby(rs.getInt("hobby"));
			lstMember.add(member);
		}
		
		}catch (SQLException e){
			return null;
		}
		return lstMember;
	}

}
