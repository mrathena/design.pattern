package com.mrathena.design.pattern.structural.patterns.proxy.pattern.implement.static_;

/**
 * @author mrathena on 2020/4/8 22:42
 */
public class Agent implements Singer {

	private Singer singer;

	public Agent(Singer singer) {
		this.singer = singer;
	}

	@Override
	public void sing() {
		System.out.println("演出前谈合同");
		singer.sing();
		System.out.println("演出后收钱");
	}
}
