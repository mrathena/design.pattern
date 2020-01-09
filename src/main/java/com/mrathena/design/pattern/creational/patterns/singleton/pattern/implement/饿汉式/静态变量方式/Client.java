package com.mrathena.design.pattern.creational.patterns.singleton.pattern.implement.饿汉式.静态变量方式;

import com.mrathena.toolkit.CloneKit;
import com.mrathena.toolkit.ReflectionKit;

/**
 * @author mrathena on 2020/1/9 11:31
 */
public class Client {

	public static void main(String[] args) {
		Singleton instance = Singleton.getInstance();
		System.out.println(Singleton.getInstance());
		// 尝试反序列化创建(需实现Serializable)
		System.out.println(CloneKit.clone(instance));
		System.out.println(CloneKit.clone(instance));
		// 尝试反射创建
		System.out.println(ReflectionKit.invoke(instance, "getInstance"));
		System.out.println(ReflectionKit.newInstance(instance));
		System.out.println(ReflectionKit.newInstance(instance));
		System.out.println(ReflectionKit.newInstance(instance));
	}

}
