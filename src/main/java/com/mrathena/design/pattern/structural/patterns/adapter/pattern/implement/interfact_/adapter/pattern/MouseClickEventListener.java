package com.mrathena.design.pattern.structural.patterns.adapter.pattern.implement.interfact_.adapter.pattern;

/**
 * @author mrathena on 2020/1/16 16:01
 */
public interface MouseClickEventListener {

	void onClick(MouseClickEvent event);

	void onDoubleClick(MouseClickEvent event);

	void onRightClick(MouseClickEvent event);

}
