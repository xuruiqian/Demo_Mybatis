package mybatistest;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

public abstract class TestMyBatisBase {

	public static String sqlmapconfigPath = "mybatis-config.xml"; // 定位核心配置文件
	public static InputStream inputStream = null;
	public static SqlSessionFactory sqlSessionFactory = null;
	public static SqlSession sqlSession = null;

	static {

		try {
			inputStream = Resources.getResourceAsStream(sqlmapconfigPath);
			sqlSessionFactory = new SqlSessionFactoryBuilder()
					.build(inputStream);
			sqlSession = sqlSessionFactory.openSession();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
}
