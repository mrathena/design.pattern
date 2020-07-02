package com.mrathena.design.pattern.behavioral.patterns.template.pattern.demo;

public class WorkerOneDay extends OneDay {

	public void getUp() {
		System.out.println("从工地上醒来");
	}

	@Override
	protected void goToWork() {
		System.out.println("乘公交上班");
	}

	@Override
	protected void eatLunch() {
		System.out.println("吃工地上的大锅饭");
	}

	@Override
	protected void goOffWork() {
		System.out.println("乘公交下班");
	}

	@Override
	protected void makeLove() {
		System.out.println("单身汉没有老婆");
	}

}
