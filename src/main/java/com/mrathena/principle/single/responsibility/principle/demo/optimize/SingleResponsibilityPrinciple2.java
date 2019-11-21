package com.mrathena.principle.single.responsibility.principle.demo.optimize;

/**
 * @author mrathena on 2019-11-21 22:11
 */
public class SingleResponsibilityPrinciple2 {
	public static void main(String[] args) {
		Vehicle vehicle = new Vehicle();
		vehicle.run("摩托车");
		vehicle.run("汽车");
		vehicle.runAir("飞机");
		vehicle.runWater("帆船");
	}
}

/**
 * 按照交通工具运行方式划分职责
 * 虽然没有在类级别单一职责,但是因方法足够简单,所以在方法级别上单一职责了
 */
class Vehicle {
	public void run(String vehicle) {
		System.out.println(vehicle + " 在公路跑");
	}
	public void runAir(String vehicle) {
		System.out.println(vehicle + " 在天上飞");
	}
	public void runWater(String vehicle) {
		System.out.println(vehicle + " 在水里游");
	}
}