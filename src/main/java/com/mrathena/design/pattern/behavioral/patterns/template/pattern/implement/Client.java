package com.mrathena.design.pattern.behavioral.patterns.template.pattern.implement;

public class Client {

	public static void main(String[] args) {
		ConcreteClass23 concreteClass23 = new ConcreteClass23();
		concreteClass23.templateAction12345();
		concreteClass23.templateAction13();
		concreteClass23.templateAction123();
		concreteClass23.templateAction124();
		concreteClass23.templateAction125();

		System.out.println();

		ConcreteClass25 concreteClass25 = new ConcreteClass25();
		concreteClass25.templateAction124();
		concreteClass25.templateAction125();

		System.out.println();

		ConcreteClass2345 concreteClass2345 = new ConcreteClass2345();
		concreteClass2345.templateAction12345();
		concreteClass2345.templateAction13();
		concreteClass2345.templateAction123();
		concreteClass2345.templateAction124();
		concreteClass2345.templateAction125();
	}

}
