package ru.Daniilscream.tanks.main;

import java.awt.event.ActionEvent;

import javax.swing.AbstractAction;
import javax.swing.Timer;

import ru.Daniilscream.tanks.display.Display;

public class Main {

	public static void main(String[] args) {
		
		Display.create(800, 600, "Tanks", 0xff00ff00, 3);
		
		Timer t = new Timer(1000/60, new AbstractAction() {

			@Override
			public void actionPerformed(ActionEvent e) {
				Display.clear();
				Display.render();
				Display.swapBuffers();
			}
		});
			t.setRepeats(true);
			t.start();
	}

}
