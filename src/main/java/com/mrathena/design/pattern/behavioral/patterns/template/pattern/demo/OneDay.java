package com.mrathena.design.pattern.behavioral.patterns.template.pattern.demo;

public abstract class OneDay {

	/**
	 * 模板方法
	 */
	public void oneDay() {
		getUp();
		goToWork();
		eatLunch();
		goOffWork();
		goToBed();
		makeLove();
	}

	/**
	 * 所有人都会醒来
	 * 通用方法,放到父类里
	 */
	private void getUp() {
		System.out.println("醒来");
	}

	/**
	 * 有些人可能不上班
	 * 上班的可以覆盖
	 */
	protected void goToWork() {

	}

	/**
	 * 所有人都要吃午餐,必须覆盖实现
	 */
	protected abstract void eatLunch();

	/**
	 * 有些人可能不上班
	 * 有下班的可以覆盖
	 */
	protected void goOffWork() {

	}

	/**
	 * 所有人都要上床睡觉
	 * 有自定义需求的自行覆盖
	 */
	protected void goToBed() {
		System.out.println("上床");
	}

	/**
	 * 性生活
	 * 默认咩有性生活,想做,就得自己想办法
	 */
	protected void makeLove() {
		throw new UnsupportedOperationException();
	}

}
