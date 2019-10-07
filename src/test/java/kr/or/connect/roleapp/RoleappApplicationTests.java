package kr.or.connect.roleapp;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.sql.DataSource;
import java.sql.Connection;

@RunWith(SpringRunner.class)
@SpringBootTest
public class RoleappApplicationTests {

	@Autowired
	private DataSource dataSource;

	@Test
	public void connectionTest() throws Exception
	{
		Connection conn = dataSource.getConnection();
		Assert.assertNotNull(conn);
	}


	@Test
	public void contextLoads()
	{

	}

}
