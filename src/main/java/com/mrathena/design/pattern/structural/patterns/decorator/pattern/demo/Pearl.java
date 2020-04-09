package com.mrathena.design.pattern.structural.patterns.decorator.pattern.demo;

/**
 * 珍珠配料
 *
 * @author mrathena on 2020/4/9 17:49
 */
public class Pearl extends AbstractCondimentDecorator {

	public Pearl(Tea tea) {
		this.tea = tea;
	}

	@Override
	public String getDescription() {
		return tea.getDescription() + ", 珍珠";
	}
}
