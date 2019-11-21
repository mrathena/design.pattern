package com.mrathena.principle.dependence.inversion.principle.transmit.mode.interface_;

/**
 * @author mrathena on 2019-11-21 23:30
 */
public class InterfaceTransmit {
	public static void main(String[] args) {
		Tv tv = new ChangHongTv();
		OpenAndClose openAndClose = new OpenAndCloseImpl();
		openAndClose.open(tv);
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
	void open(Tv tv);
}

class OpenAndCloseImpl implements OpenAndClose {

	@Override
	public void open(Tv tv) {
		tv.play();
	}
}