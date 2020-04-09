package com.mrathena.design.pattern.structural.patterns.decorator.pattern.demo;

/**
 * 蜂蜜配料
 *
 * @author mrathena on 2020/4/9 17:49
 */
public class Honey extends AbstractCondimentDecorator {

	public Honey(Tea tea) {
		this.tea = tea;
	}

	@Override
	public String getDescription() {
		return tea.getDescription() + ", 蜂蜜";
	}
}
