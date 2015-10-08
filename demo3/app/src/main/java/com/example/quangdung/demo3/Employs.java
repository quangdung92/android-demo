package com.example.quangdung.demo3;

/**
 * Created by quangdung on 08/10/2015.
 */
public class Employs {
    private boolean sex;
    private String name;
    private Integer id;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isSex() {
        return sex;
    }

    public void setSex(boolean sex) {
        this.sex = sex;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }
    @Override
    public String toString() {
        return this.id+""+"-"+this.name;
    }
}
