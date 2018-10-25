package org.lanqiao.dao;

import org.lanqiao.pojo.Student;

public interface StudentMapper {
    //根据学生信息查询所有对应老师的信息
    public Student findStuAndTeaBySid(int id);
}
