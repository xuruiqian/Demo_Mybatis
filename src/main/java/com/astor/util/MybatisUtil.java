package com.astor.util;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;
import java.io.InputStream;

public class MybatisUtil {
    public static String sqlmapconfigPath = "mybatis-config.xml"; // 定位核心配置文件
    public static InputStream inputStream = null;
    public static SqlSessionFactory sqlSessionFactory = null;

    static {

        try {
            inputStream = Resources.getResourceAsStream(sqlmapconfigPath);
            sqlSessionFactory = new SqlSessionFactoryBuilder()
                    .build(inputStream);
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

    }

    /**
     * 获取SqlSessionFactory
     * @return SqlSessionFactory
     */
    public static SqlSessionFactory getSqlSessionFactory(){
        return sqlSessionFactory;
    }

    /**
     * 获取SqlSession
     * @return SqlSession
     */
    public static SqlSession getSqlSession(){
        return sqlSessionFactory.openSession();
    }
    /**
     * 关闭SqlSession
     */
    public  static void closeSession(SqlSession sqlSession){
        if (sqlSession!=null)
            sqlSession.close();
    }
}
