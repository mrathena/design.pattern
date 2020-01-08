package com.mrathena.design.pattern.creation.singleton.pattern.implement.枚举;

/**
 * @author mrathena on 2020-01-06 22:21
 */
public enum Singleton {

	/**
	 * 推荐
	 * 可防止反射创建对象
	 */
	INSTANCE;

	public void method() {
		System.out.println("singleton implements with enum");
	}

	public static void main(String[] args) {
		Singleton.INSTANCE.method();
	}

}
