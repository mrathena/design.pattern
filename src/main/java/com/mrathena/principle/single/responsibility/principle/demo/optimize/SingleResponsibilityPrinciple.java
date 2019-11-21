package com.mrathena.principle.single.responsibility.principle.demo.optimize;

/**
 * @author mrathena on 2019-11-21 22:11
 */
public class SingleResponsibilityPrinciple {
	public static void main(String[] args) {
		RoadVehicle vehicle = new RoadVehicle();
		vehicle.run("摩托车");
		vehicle.run("汽车");
		AirVehicle airVehicle = new AirVehicle();
		airVehicle.run("飞机");
	}
}

/**
 * 按照交通工具运行方式划分职责
 */
class RoadVehicle {
	public void run(String vehicle) {
		System.out.println(vehicle + " 在公路跑");
	}
}
class AirVehicle {
	public void run(String vehicle) {
		System.out.println(vehicle + " 在天上飞");
	}
}
class WaterVehicle {
	public void run(String vehicle) {
		System.out.println(vehicle + " 在水里游");
	}
}