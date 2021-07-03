package com.example.tools;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;
import java.io.InputStream;

public class MybatisTool {
    private static SqlSession sqlSession = null;
    private static SqlSessionFactory sqlSessionFactory = null;
    static{
        String path = "mybatis-config.xml";
        try {
            InputStream is = Resources.getResourceAsStream(path);
            sqlSessionFactory = new SqlSessionFactoryBuilder().build(is);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static SqlSession openSession(){
        return sqlSessionFactory.openSession();
    }

    public static void close(){
        if(sqlSession != null){
            sqlSession.close();
        }
    }
}
