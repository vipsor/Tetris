package game;

import java.awt.Frame;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

public class Viewer extends Frame implements WindowListener, KeyListener {
	private static DrawCanvas cv;
	public Viewer(int i, int j, int size) {
		cv = new DrawCanvas(size);
		cv.setSize((size+2)*j, (size+2)*i);
		this.add(cv);
		this.pack();
		this.addWindowListener(this);
		this.setVisible(true);
		BlockData.newBlockData(i, j);
		this.startGame();
	}
	private void startGame() {
		// TODO 自動生成されたメソッド・スタブ

	}
	@Override public void keyPressed(KeyEvent arg0) {}
	@Override public void keyReleased(KeyEvent arg0) {}
	@Override public void keyTyped(KeyEvent arg0) {}
	@Override public void windowActivated(WindowEvent arg0) {}
	@Override public void windowClosed(WindowEvent arg0) {System.exit(0);}
	@Override public void windowClosing(WindowEvent arg0) {}
	@Override public void windowDeactivated(WindowEvent arg0) {}
	@Override public void windowDeiconified(WindowEvent arg0) {}
	@Override public void windowIconified(WindowEvent arg0) {}
	@Override public void windowOpened(WindowEvent arg0) {}
}
