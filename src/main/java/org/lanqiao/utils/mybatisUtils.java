package org.lanqiao.utils;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;
import java.io.InputStream;

public class mybatisUtils {
    //工具类中存放静态的...
    //方法：获取SqlSession对象   参数：配置文件路径
    public static SqlSession getSqlSession(String mybatisConfigPath){
        //0 读取配置文件
        InputStream is = null;
        try {
            is = Resources.getResourceAsStream(mybatisConfigPath);
        } catch (IOException e) {
            e.printStackTrace();
        }
        // 1 建立SqlSessionFactory 对象
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(is);
        //2 获取SqlSession对象
        SqlSession sqlSession =  sqlSessionFactory.openSession();
        //3 返回sqlSession对象
        return sqlSession;
    }

    //方法：释放资源  参数：SqlSession对象
    public static void realeaseSource(SqlSession sqlSession){
        //4 关闭sqlsession
        if(sqlSession!=null){
            sqlSession.close();
        }
    }
}
