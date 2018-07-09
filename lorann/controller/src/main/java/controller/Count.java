package controller;

public class Count extends Thread {

	private ControllerFacade controller;

	private final int countTime;

	private static int countLongeur = 200;

	private boolean countEtat;

	public Count(final ControllerFacade controlleR) {
		this.countTime = 0;
		this.controller = controlleR;
		setCountLongeur(Count.countLongeur);
	}

	public Count(final int countLongeur) {
		this.countTime = 0;
		setCountLongeur(countLongeur);
	}

}
