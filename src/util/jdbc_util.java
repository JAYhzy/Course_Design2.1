package util;
/**
 *该类是用于连接数据库的工具类
 *
 * @author Hezhenyu
 *
 */

import com.alibaba.druid.pool.DruidDataSourceFactory;

import javax.sql.DataSource;
import java.io.FileInputStream;
import java.sql.Connection;
import java.util.Properties;

public class jdbc_util 
{
	/**
	 * 获取数据库连接	
	 * @return 一个connection连接对象
	 * @throws Exception
	 */
	public Connection getCon() throws Exception 
	{
		//1.导入jar包
		//2.定义配置文件
		//3.加载配置文件
		Properties pro = new Properties();
		pro.load(new FileInputStream("druid.properties"));
		
		//4.获取连接池对象
		DataSource DR = DruidDataSourceFactory.createDataSource(pro);
		
		//5.获取数据库连接Connection
		Connection connection = DR.getConnection();
		
		System.out.println(connection);
		return connection;
	}
	
	/**
	 * 关闭数据库连接
	 * @param con
	 * @throws Exception
	 */
	public void closeCon(Connection con)throws Exception{
		if (con != null) {
			con.close();
		}
	}
	
}
