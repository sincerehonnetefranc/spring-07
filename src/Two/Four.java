package Two;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Four {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String url="jdbc:mysql://192.168.56.130:3306/db1?useUnicode=true&characterEncoding=utf8";
		String user="root";
		String password="123456";
		Connection con=null;
		PreparedStatement pstmt =null;
		ResultSet rs=null;
		String name="input";
		String pwd="input";
		try {
			//ѡ��Ҫ���������ݿ�����
			Class.forName("com.mysql.jdbc.Driver");
			//�������� ����IP �˿ں��˺�����
			con = DriverManager.getConnection(url, user, password);
			//��������� ��   ���Ǵ��� ����ֵ
			pstmt = con.prepareStatement("insert into student(name,b_id,gerden)values(?,?,?)");
			//����sql��䲢�鿴���
			//ע�����
			pstmt.setString(1, "�ٺٺ�");
			pstmt.setInt(2, 2);
			pstmt.setInt(3, 0);
			//ִ�����
			int i=pstmt.executeUpdate();
			System.out.println(i);
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally{
			try {
				if(rs!=null)
					rs.close();
				if(pstmt!=null)
					pstmt.close();
				if(con!=null)
					con.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
	}

}
