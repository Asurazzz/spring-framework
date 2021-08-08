package com.ymj;

import com.ymj.selfEditor.Customer;
import com.ymj.selftag.User;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author : yemingjie
 * @date : 2021/8/2 23:28
 */
public class Test {
	public static void main(String[] args) {
//		MyClassPathXmlApplicationContext ac = new MyClassPathXmlApplicationContext("applicationContext.xml");
//		User user = (User) ac.getBean("ymj");
//		System.out.println("=============");
//		System.out.println(user.getUsername());

		MyClassPathXmlApplicationContext ac = new MyClassPathXmlApplicationContext("selfEditor.xml");
		Customer bean = ac.getBean(Customer.class);
		System.out.println(bean);
	}
}
