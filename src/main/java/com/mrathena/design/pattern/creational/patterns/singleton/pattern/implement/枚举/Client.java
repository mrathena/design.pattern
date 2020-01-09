package com.mrathena.design.pattern.creational.patterns.singleton.pattern.implement.枚举;

import com.mrathena.toolkit.CloneKit;
import com.mrathena.toolkit.ReflectionKit;

/**
 * @author mrathena on 2020/1/9 12:25
 */
public class Client {

	public static void main(String[] args) {
		System.out.println(Singleton.INSTANCE.hashCode());
		// 尝试反序列化创建(需实现Serializable)
		System.out.println(CloneKit.clone(Singleton.INSTANCE).hashCode());
		System.out.println(CloneKit.clone(CloneKit.clone(Singleton.INSTANCE)).hashCode());
		// 尝试反射创建
		System.out.println(ReflectionKit.newInstance(Singleton.INSTANCE));
	}

}
