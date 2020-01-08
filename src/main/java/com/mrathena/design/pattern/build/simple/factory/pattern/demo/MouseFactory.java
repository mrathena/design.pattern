package com.mrathena.design.pattern.build.simple.factory.pattern.demo;

/**
 * @author mrathena on 2020/1/8 18:08
 */
public class MouseFactory {

	public static AbstractMouse getMouse(String brand) {
		switch (brand) {
			case "DELL":
				return new DellMouse();
			case "ASUS":
				return new AsusMouse();
			default:
				break;
		}
		return null;
	}

}
