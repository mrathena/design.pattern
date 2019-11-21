package com.mrathena.principle.dependence.inversion.principle.transmit.mode.setter;

/**
 * @author mrathena on 2019-11-21 23:38
 */
public class SetterTransmit {
	public static void main(String[] args) {
		Tv tv = new ChangHongTv();
		OpenAndClose openAndClose = new OpenAndCloseImpl();
		openAndClose.setTv(tv);
		openAndClose.open();
	}
}

/**
 * 接口传递
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

	void setTv(Tv tv);
}

class OpenAndCloseImpl implements OpenAndClose {

	private Tv tv;

	@Override
	public void open() {
		tv.play();
	}

	@Override
	public void setTv(Tv tv) {
		this.tv = tv;
	}
}