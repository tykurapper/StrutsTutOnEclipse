package com.tutorialspoint.struts2;

import com.opensymphony.xwork2.ActionSupport;

/**
 * Created by Tyku on 7/10/2017.
 */
public class Employee extends ActionSupport {
    private String name;
    private int age;

    public String execute()
    {
        return SUCCESS;
    }

    public void validate()
    {
        if(name == null || name.trim().equals(""))
            addFieldError("name","Name cannot be empty");
        if(age < 20 || age > 65)
            addFieldError("age", "Too old or too young");
    }
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
}
