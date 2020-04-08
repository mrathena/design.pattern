package com.mrathena.design.pattern.structural.patterns.proxy.pattern.implement.dynamic.jdk;

/**
 * @author mrathena on 2020/4/8 22:57
 */
public class Test {

	public static void main(String[] args) {
		Singer singer = new SHESinger();
		Singer proxy = Agent.getProxy(singer);
		proxy.sing();
	}

}
