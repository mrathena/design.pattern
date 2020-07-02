package com.mrathena.design.pattern.behavioral.patterns.template.pattern.demo;

public class BossOneDay extends OneDay {

	@Override
	protected void goToWork() {
		System.out.println("开车上班");
	}

	@Override
	protected void eatLunch() {
		System.out.println("吃私人大厨定制午餐");
	}

	@Override
	protected void goOffWork() {
		System.out.println("开车下班");
	}

	@Override
	protected void goToBed() {
		System.out.println("上豪华席梦思");
	}

	@Override
	protected void makeLove() {
		System.out.println("叫3个超模一起打牌");
	}

}
