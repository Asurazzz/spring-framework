package com.ymj;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


/**
 * @author : yemingjie
 * @date : 2021/7/15 22:49
 */
class MyTestBeanTest {

	@Test
	public void testSimpleLoad() {
		ApplicationContext ac =
				new ClassPathXmlApplicationContext("applicationContext.xml");
		MyTestBean myTestBean = (MyTestBean) ac.getBean("myTestBean");
		System.out.println(myTestBean);
	}

	public static void main(String[] args) {
		ApplicationContext ac =
				new ClassPathXmlApplicationContext("applicationContext.xml");
		MyTestBean myTestBean = (MyTestBean) ac.getBean("myTestBean");
		System.out.println(myTestBean);
	}

}