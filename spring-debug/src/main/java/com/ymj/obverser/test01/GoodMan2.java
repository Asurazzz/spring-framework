package com.ymj.obverser.test01;

public class GoodMan2 implements Observer {

	@Override
	public void make(String str) {
		System.out.println("GoodMan2开始行动");
		System.out.println("------------" + str);
	}
}
