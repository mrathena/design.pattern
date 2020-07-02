package com.mrathena.design.pattern.behavioral.patterns.template.pattern.demo;

public class LuoZhiXiangOneDay extends OneDay {

	@Override
	protected void eatLunch() {
		System.out.println("在节目现场吃午餐");
	}

	@Override
	protected void goToBed() {
		System.out.println("上定制10人水床");
	}

	@Override
	protected void makeLove() {
		System.out.println("和10个小改改做多人运动");
	}

}
