package cn.js.vo;

import java.io.Serializable;

/**
 * @author Administrator
 * @version 1.0.0
 * @ClassName User
 * @Description TODO
 * @createTime 2019年08月25日 22:30:00
 */
public class User implements Serializable {
    private String name;
    private int age;
    private String sex;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }
}
