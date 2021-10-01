package com.ymj.obverser.test01;

import java.util.ArrayList;

public class BadMan implements Observable{

	private ArrayList<Observer> observers = new ArrayList<>();

	@Override
	public void addObserver(Observer observer) {
		this.observers.add(observer);
	}

	@Override
	public void deleteObserver(Observer observer) {
		this.observers.remove(observer);
	}

	@Override
	public void notifyObserver(String str) {
		observers.forEach(observer1 -> observer1.make(str));
	}

	public void run() {
		System.out.println("罪犯要逃跑了");
		this.notifyObserver("追击罪犯");
	}

	public void play() {
		System.out.println("罪犯在玩");
		this.notifyObserver("静观其变");
	}
}
