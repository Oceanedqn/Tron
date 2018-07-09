package view;

import javax.swing.JOptionPane;

import controller.IController;

/**
 * <h1>The Class ViewFacade provides a facade of the View component.</h1>
 *
 * @author Jean-Aymeric DIET jadiet@cesi.fr
 * @version 1.0
 */
public class ViewFacade implements IView {

	private final Windows win;

	/**
	 * Instantiates a new view facade.
	 */
	public ViewFacade() {
		super();
		this.win = new Windows();
	}

	/*
	 * (non-Javadoc)
	 *
	 * @see view.IView#displayMessage(java.lang.String)
	 */
	@Override
	public final void displayMessage(final String message) {
		JOptionPane.showMessageDialog(null, message);
	}

	public Windows getWin() {
		return this.win;
	}

	@Override
	public void setController(final IController controller) {
		this.win.setController(controller);
	}

}
