import org.apache.commons.dbutils.QueryRunner;
import org.junit.Test;

import java.sql.Connection;
import java.sql.SQLException;

/**
 * Created by zyf on 2018/1/12.
 */
public class T {

	@Test
	public void t() throws SQLException {
		Connection connection = JdbcUtil.getConnection();
		QueryRunner qr = new QueryRunner();
		String sql = "insert into book values(?,?,?,?,?)";
		qr.update(connection,sql,null,"b1","a1","p1","c1");
		connection.close();
	}

	@Test
	public void t2(){
		for (int i = 0; i < 40; i++) {
			try {
				t();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}
}
