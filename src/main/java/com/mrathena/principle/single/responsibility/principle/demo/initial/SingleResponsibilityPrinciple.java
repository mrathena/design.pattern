package com.mrathena.principle.single.responsibility.principle.demo.initial;

/**
 * @author mrathena on 2019-11-21 22:05
 */
public class SingleResponsibilityPrinciple {
	public static void main(String[] args) {
		Vehicle vehicle = new Vehicle();
		vehicle.run("摩托车");
		vehicle.run("汽车");
		vehicle.run("飞机");
	}
}

/**
 * 交通工具类
 */
class Vehicle {
	public void run(String vehicle) {
		System.out.println(vehicle + " 在公路上跑");
	}
}
