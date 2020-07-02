package com.hr.service.impl;

import com.hr.service.IAccountService;

import java.util.Date;

/**
 * set方法注入值
 */
public class AccountServiceImpl2 implements IAccountService {

    private String name;
    private Integer age;
    private Date birthday;

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    public void saveAccount() {
        System.out.println("service中的saveAccount执行了.." + name +"--"+ age +"--"+ birthday );
    }

}
