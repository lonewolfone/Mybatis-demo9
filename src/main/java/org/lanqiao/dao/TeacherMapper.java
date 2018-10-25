package org.lanqiao.dao;

import org.lanqiao.pojo.Teacher;

public interface TeacherMapper {
    //根据老师信息查询所有对应学生的信息
    public Teacher findTeaAndStuByTid(int id);
}
