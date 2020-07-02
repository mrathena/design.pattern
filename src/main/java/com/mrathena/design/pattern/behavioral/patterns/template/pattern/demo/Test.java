package com.mrathena.design.pattern.behavioral.patterns.template.pattern.demo;

public class Test {

	public static void main(String[] args) {
		WorkerOneDay workerOneDay = new WorkerOneDay();
		workerOneDay.oneDay();

		System.out.println();

		BossOneDay bossOneDay = new BossOneDay();
		bossOneDay.oneDay();

		System.out.println();

		LuoZhiXiangOneDay luoZhiXiangOneDay = new LuoZhiXiangOneDay();
		luoZhiXiangOneDay.oneDay();
	}

}
