package dao.util;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by zyf on 2017/12/13.
 */
public class JdbcUtilTest {
	@Test
	public void t(){
		try {
			Class.forName("dao.util.JdbcUtil");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	}
}