package com.hr;

import com.hr.service.IAccountService;
import com.hr.service.impl.AccountServiceImpl;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

public class Client {

    public static void main(String[] args) {
        ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext("bean.xml");
        //构造方法注入值
//        IAccountService as = (IAccountService) applicationContext.getBean("accountService");
//        as.saveAccount();

        //set方法注入值
//        IAccountService as = (IAccountService) applicationContext.getBean("accountService2");
//        as.saveAccount();

        //包含复杂属性注入值
        IAccountService as = (IAccountService) applicationContext.getBean("accountService3");
        as.saveAccount();
    }

}
