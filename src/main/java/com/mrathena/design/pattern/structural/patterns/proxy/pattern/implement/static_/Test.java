package com.mrathena.design.pattern.structural.patterns.proxy.pattern.implement.static_;

/**
 * @author mrathena on 2020/4/8 22:44
 */
public class Test {

	public static void main(String[] args) {
		Singer agent = new Agent(new SHESinger());
		agent.sing();
	}

}
