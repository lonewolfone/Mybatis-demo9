package org.lanqiao.test;

import org.apache.ibatis.session.SqlSession;
import org.junit.Before;
import org.lanqiao.dao.StudentMapper;
import org.lanqiao.dao.TeacherMapper;
import org.lanqiao.pojo.Student;
import org.lanqiao.pojo.Teacher;
import org.lanqiao.utils.mybatisUtils;

public class Test {
    SqlSession sqlSession;
    StudentMapper studentMapper;
    TeacherMapper teacherMapper;
    @Before
    public void init(){
        sqlSession = mybatisUtils.getSqlSession("mybatis-config.xml");
        studentMapper = sqlSession.getMapper(StudentMapper.class);
        teacherMapper = sqlSession.getMapper(TeacherMapper.class);
    }

    @org.junit.Test
    public void findStuAndTeaBySidTest(){
        Student student =studentMapper.findStuAndTeaBySid(1);
        System.out.println(student);
    }

    @org.junit.Test
   public void findTeaAndStuByTidTest(){
        Teacher teacher = teacherMapper.findTeaAndStuByTid(2);
        System.out.println(teacher);
    }

}
