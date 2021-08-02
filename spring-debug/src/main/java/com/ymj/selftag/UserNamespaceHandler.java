package com.ymj.selftag;

import org.springframework.beans.factory.xml.NamespaceHandlerSupport;

/**
 * @author : yemingjie
 * @date : 2021/8/2 23:07
 */
public class UserNamespaceHandler extends NamespaceHandlerSupport {
	@Override
	public void init() {
		registerBeanDefinitionParser("user", new UserBeanDefinitionParser());
	}
}
