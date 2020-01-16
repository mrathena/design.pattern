package com.mrathena.design.pattern.structural.patterns.adapter.pattern.implement.interfact_.adapter.pattern;

/**
 * @author mrathena on 2020/1/16 17:46
 */
public class Client {

	public static void main(String[] args) {
		// 常规使用
		Mouse mouse = new Mouse();
		mouse.addMouseClickEventListener(new MouseClickEventListener() {
			@Override
			public void onClick(MouseClickEvent event) {
				System.out.println("收到左键单击事件通知并处理");
			}
			@Override
			public void onDoubleClick(MouseClickEvent event) {
				System.out.println("收到左键双击事件通知并处理");
			}
			@Override
			public void onRightClick(MouseClickEvent event) {
				System.out.println("收到右键单击事件通知并处理");
			}
		});
		mouse.click();
		mouse.doubleClick();

		// 当仅仅想监听左键单击事件时可以使用接口适配器模式
		mouse.addMouseClickEventListener(new MouseLeftSingleClickEventListener());
		mouse.doubleClick();
		mouse.click();
		mouse.rightClick();

	}

}
