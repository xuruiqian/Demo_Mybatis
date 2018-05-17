package com.astor.test;

import com.astor.mapper.UserMapper;
import com.astor.model.User;
import com.astor.util.MybatisUtil;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import java.util.List;

public class UserTest {

    SqlSession sqlSession ;

    @Test
    public void Query(){
        sqlSession = MybatisUtil.getSqlSession();
        try{
            UserMapper userMapper = sqlSession.getMapper(UserMapper.class);
            List<User> users=userMapper.selectAll();
            for(User user:users){
                System.out.println(user.toString());
            }
            User user=userMapper.selectByPrimaryKey("1");
            System.out.println(user.toString());
            sqlSession.commit();
        }catch (Exception e){
            e.printStackTrace();
        }finally {
            MybatisUtil.closeSession(sqlSession);
        }

    }
}