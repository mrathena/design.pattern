package com.mrathena.design.pattern.structural.patterns.adapter.pattern.implement.interfact_.adapter.pattern;

import java.util.*;

/**
 * @author mrathena on 2020/1/16 16:37
 */
public class Mouse {

	private Set<MouseClickEventListener> listenerSet = new HashSet<>();

	public void addMouseClickEventListener(MouseClickEventListener listener) {
		if (Objects.isNull(listener)) {
			return;
		}
		listenerSet.add(listener);
	}

	public void click() {
		System.out.println("左键单击事件发生");
		System.out.println("通知监听器开始");
		listenerSet.forEach(item -> item.onClick(new MouseClickEvent(this)));
		System.out.println("通知监听器结束");
		System.out.println();
	}

	public void doubleClick() {
		System.out.println("左键双击事件发生");
		System.out.println("通知监听器开始");
		listenerSet.forEach(item -> item.onDoubleClick(new MouseClickEvent(this)));
		System.out.println("通知监听器结束");
		System.out.println();
	}

	public void rightClick() {
		System.out.println("右键单击事件发生");
		System.out.println("通知监听器开始");
		listenerSet.forEach(item -> item.onRightClick(new MouseClickEvent(this)));
		System.out.println("通知监听器结束");
		System.out.println();
	}

}
