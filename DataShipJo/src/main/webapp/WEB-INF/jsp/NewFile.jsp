<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>

<script>
package jdbc_connection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
 
public class BoardDao {
    private Connection conn; //DB 커넥션 연결 객체
    private static final String USERNAME = "root";//DBMS접속 시 아이디
    private static final String PASSWORD = "root";//DBMS접속 시 비밀번호
    private static final String URL = "jdbc:mysql://132.226.150.234:3306/chickenmap";//DBMS접속할 db명
    
    public BoardDao() {
        try {
            System.out.println("생성자");
            Class.forName("com.mysql.jdbc.Driver");
            conn = DriverManager.getConnection(URL, USERNAME, PASSWORD);
            System.out.println("드라이버 로딩 성공");
        } catch (Exception e) {
            System.out.println("드라이버 로딩 실패 ");
            try {
                conn.close();
            } catch (SQLException e1) {    }
        }
        
        
    }
}

package jdbc_connection;

public class Main{
	public static void main(String[] args){
		BoardDao bDao = new BoardDao();
	}	

}


</script>
</head>
<body>
<h3>dddddddd</h3>



</body>
</html>