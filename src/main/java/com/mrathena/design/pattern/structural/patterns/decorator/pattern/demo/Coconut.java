package com.mrathena.design.pattern.structural.patterns.decorator.pattern.demo;

import lombok.ToString;

/**
 * 椰果配料
 *
 * @author mrathena on 2020/4/9 15:54
 */
@ToString
public class Coconut extends AbstractCondimentDecorator {

	public Coconut(Tea tea) {
		this.tea = tea;
	}

	@Override
	public String getDescription() {
		return tea.getDescription() + ", 椰果";
	}
}
