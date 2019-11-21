package com.mrathena.principle.interface_.segregation.principle.demo.optimize;

/**
 * @author mrathena on 2019-11-21 23:01
 */
public class InterfaceSegregationPrinciple {
	public static void main(String[] args) {
		A a = new A();
		a.useMethod1(new B());
		a.useMethod2(new B());
		C c = new C();
		c.useMethod1(new D());
		c.useMethod3(new D());
	}
}

interface Interface1 {
	void method1();
}

interface Interface2 {
	void method2();
}

interface Interface3 {
	void method3();
}

class A {
	public void useMethod1(Interface1 i) {
		i.method1();
	}

	public void useMethod2(Interface2 i) {
		i.method2();
	}
}

class C {
	public void useMethod1(Interface1 i) {
		i.method1();
	}

	public void useMethod3(Interface3 i) {
		i.method3();
	}
}

class B implements Interface1, Interface2 {
	@Override
	public void method1() {
		System.out.println("B 实现了 method1");
	}

	@Override
	public void method2() {
		System.out.println("B 实现了 method2");
	}
}

class D implements Interface1, Interface3 {
	@Override
	public void method1() {
		System.out.println("D 实现了 method1");
	}

	@Override
	public void method3() {
		System.out.println("D 实现了 method3");
	}
}
