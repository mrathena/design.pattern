package com.mrathena.design.pattern.structural.patterns.adapter.pattern.implement.interfact_.adapter.pattern;

/**
 * @author mrathena on 2020/1/16 17:52
 */
public class MouseLeftSingleClickEventListener implements MouseClickEventListener {

	@Override
	public void onClick(MouseClickEvent event) {
		System.out.println("MouseLeftSingleClickEventListener:只关注左键单击事件,其他事件不处理");
	}

	@Override
	public void onDoubleClick(MouseClickEvent event) {

	}

	@Override
	public void onRightClick(MouseClickEvent event) {

	}
}
