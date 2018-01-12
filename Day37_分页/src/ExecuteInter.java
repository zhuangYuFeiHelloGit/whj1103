import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

/**
 * Created by zyf on 2017/12/20.
 */
public interface ExecuteInter {
	Statement execute(Connection conn) throws SQLException;
}
