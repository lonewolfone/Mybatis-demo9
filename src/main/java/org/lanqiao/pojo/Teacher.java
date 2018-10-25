package org.lanqiao.pojo;

import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

public class Teacher {
    private int tid;
    private String tname;
    private Set<Student> studentSet = new HashSet<>();

    public Teacher(){

    }

    public Teacher(int tid, String tname, Set<Student> studentSet) {
        this.tid = tid;
        this.tname = tname;
        this.studentSet = studentSet;
    }

    public int getTid() {
        return tid;
    }

    public void setTid(int tid) {
        this.tid = tid;
    }

    public String getTname() {
        return tname;
    }

    public void setTname(String tname) {
        this.tname = tname;
    }

    public Set<Student> getStudentSet() {
        return studentSet;
    }

    public void setStudentSet(Set<Student> studentSet) {
        this.studentSet = studentSet;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Teacher teacher = (Teacher) o;
        return tid == teacher.tid &&
                Objects.equals(tname, teacher.tname) &&
                Objects.equals(studentSet, teacher.studentSet);
    }

    @Override
    public int hashCode() {
        return Objects.hash(tid, tname, studentSet);
    }

    @Override
    public String toString() {
        return "Teacher{" +
                "tid=" + tid +
                ", tname='" + tname + '\'' +
                ", studentSet=" + studentSet +
                '}';
    }
}
