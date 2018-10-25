package org.lanqiao.pojo;

import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

public class Student {
    private int sid;
    private String sname;
    private int   sage;
    private String ssex;
    private Set<Teacher> teacherSet = new HashSet<>();

    public Student(){

    }

    public Student(int id, String sname, int sage, String ssex, Set<Teacher> teacherSet) {
        this.sid = id;
        this.sname = sname;
        this.sage = sage;
        this.ssex = ssex;
        this.teacherSet = teacherSet;
    }

    public int getId() {
        return sid;
    }

    public void setId(int id) {
        this.sid = id;
    }

    public String getSname() {
        return sname;
    }

    public void setSname(String sname) {
        this.sname = sname;
    }

    public int getSage() {
        return sage;
    }

    public void setSage(int sage) {
        this.sage = sage;
    }

    public String getSsex() {
        return ssex;
    }

    public void setSsex(String ssex) {
        this.ssex = ssex;
    }

    public Set<Teacher> getTeacherSet() {
        return teacherSet;
    }

    public void setTeacherSet(Set<Teacher> teacherSet) {
        this.teacherSet = teacherSet;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return sid == student.sid &&
                sage == student.sage &&
                Objects.equals(sname, student.sname) &&
                Objects.equals(ssex, student.ssex) &&
                Objects.equals(teacherSet, student.teacherSet);
    }

    @Override
    public int hashCode() {
        return Objects.hash(sid, sname, sage, ssex, teacherSet);
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + sid +
                ", sname='" + sname + '\'' +
                ", sage=" + sage +
                ", ssex='" + ssex + '\'' +
                ", teacherSet=" + teacherSet +
                '}';
    }
}
