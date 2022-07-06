package com.tedu.mallserver.pojo;

import com.baomidou.mybatisplus.annotation.TableName;

@TableName("student")
public class StudentDAO {
    Integer sno;
    Integer spno;
    String sname;
    String username;
    String password;
    String phone_number;
    String s_picture;
    String sex;
    String grade;

    public Integer getSno() {
        return sno;
    }

    public void setSno(Integer sno) {
        this.sno = sno;
    }

    public Integer getSpno() {
        return spno;
    }

    public void setSpno(Integer spno) {
        this.spno = spno;
    }

    public String getSname() {
        return sname;
    }

    public void setSname(String sname) {
        this.sname = sname;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getPhone_number() {
        return phone_number;
    }

    public void setPhone_number(String phone_number) {
        this.phone_number = phone_number;
    }

    public String getS_picture() {
        return s_picture;
    }

    public void setS_picture(String s_picture) {
        this.s_picture = s_picture;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getGrade() {
        return grade;
    }

    public void setGrade(String grade) {
        this.grade = grade;
    }
}
