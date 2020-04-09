package com.mrathena.design.pattern.structural.patterns.decorator.pattern.demo;

/**
 * @author mrathena on 2020/4/9 16:10
 */
public class Test {

	public static void main(String[] args) {

		Tea tea = new BlackTea();
		System.out.println(tea.getDescription());

		System.out.println();

		tea = new Coconut(new BlackTea());
		System.out.println(tea.getDescription());

		System.out.println();

		tea = new Honey(new Pearl(new Pearl(new Coconut(new OolongTea()))));
		System.out.println(tea.getDescription());
	}

}
