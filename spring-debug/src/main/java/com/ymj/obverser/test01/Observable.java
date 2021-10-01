package com.ymj.obverser.test01;

/**
 * 被观察者接口
 */
public interface Observable {
	void addObserver(Observer observer);

	void deleteObserver(Observer observer);

	void notifyObserver(String str);

}
