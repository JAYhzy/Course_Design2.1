package util;
/**
 *�����������������ݿ�Ĺ�����
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
	 * ��ȡ���ݿ�����	
	 * @return һ��connection���Ӷ���
	 * @throws Exception
	 */
	public Connection getCon() throws Exception 
	{
		//1.����jar��
		//2.���������ļ�
		//3.���������ļ�
		Properties pro = new Properties();
		pro.load(new FileInputStream("druid.properties"));
		
		//4.��ȡ���ӳض���
		DataSource DR = DruidDataSourceFactory.createDataSource(pro);
		
		//5.��ȡ���ݿ�����Connection
		Connection connection = DR.getConnection();
		
		System.out.println(connection);
		return connection;
	}
	
	/**
	 * �ر����ݿ�����
	 * @param con
	 * @throws Exception
	 */
	public void closeCon(Connection con)throws Exception{
		if (con != null) {
			con.close();
		}
	}
	
}
