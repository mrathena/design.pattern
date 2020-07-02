package com.mrathena.design.pattern.behavioral.patterns.template.pattern.implement;

public abstract class AbstractClass {

	/**
	 * 模板方法(算法骨架)
	 */
	public void templateAction12345() {
		action1();
		action2();
		action3();
		action4();
		action5();
	}

	public void templateAction123() {
		action1();
		action2();
		action3();
	}

	public void templateAction124() {
		action1();
		action2();
		action4();
	}

	public void templateAction125() {
		action1();
		action2();
		action5();
	}

	public void templateAction13() {
		action1();
		action3();
	}

	/**
	 * 具体步骤1
	 * 私有,无法被子类覆盖
	 */
	private void action1() {
		System.out.println("default action 1");
	}

	/**
	 * 具体步骤2
	 * 抽象,子类必须主动覆盖
	 */
	protected abstract void action2();

	/**
	 * 具体步骤3
	 * 不支持报错,如果子类调用的模板方法中包含步骤3,则子类必须主动覆盖
	 */
	protected void action3() {
		throw new UnsupportedOperationException();
	}

	/**
	 * 具体步骤4
	 * 默认,如果子类调用的模板方法中包含步骤4且子类想要自定义,则子类须主动覆盖
	 */
	protected void action4() {
		System.out.println("default action 4");
	}

	/**
	 * 具体步骤5
	 * 默认不执行操作,如果子类调用的模板方法中包含步骤5且子类想要自定义,则子类可主动覆盖
	 */
	protected void action5() {

	}

}
