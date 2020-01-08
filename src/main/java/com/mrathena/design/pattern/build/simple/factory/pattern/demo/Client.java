package com.mrathena.design.pattern.build.simple.factory.pattern.demo;

/**
 * @author mrathena on 2020/1/8 18:11
 */
public class Client {

	public static void main(String[] args) {
		AbstractMouse mouse = MouseFactory.getMouse("DELL");
		System.out.println(mouse);
		mouse = MouseFactory.getMouse("ASUS");
		System.out.println(mouse);
	}

}
