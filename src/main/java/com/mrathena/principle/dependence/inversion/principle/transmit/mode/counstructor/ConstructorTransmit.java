package com.mrathena.principle.dependence.inversion.principle.transmit.mode.counstructor;

/**
 * @author mrathena on 2019-11-21 23:34
 */
public class ConstructorTransmit {
	public static void main(String[] args) {
		Tv tv  = new ChangHongTv();
		OpenAndClose openAndClose = new OpenAndCloseImpl(tv);
		openAndClose.open();
	}
}

/**
 * 构造器传递
 */
interface Tv {
	void play();
}

class ChangHongTv implements Tv {

	@Override
	public void play() {
		System.out.println("open changhong tv");
	}
}

interface OpenAndClose {
	void open();
}

class OpenAndCloseImpl implements OpenAndClose {

	private Tv tv;

	public OpenAndCloseImpl (Tv tv) {
		this.tv = tv;
	}

	@Override
	public void open() {
		tv.play();
	}
}