package ru.Daniilscream.tanks.main;

import java.awt.event.ActionEvent;

import javax.swing.AbstractAction;
import javax.swing.Timer;

import ru.Daniilscream.tanks.display.Display;
import ru.Daniilscream.tanks.game.Game;

public class Main {

	public static void main(String[] args) {
		
		Game tanks = new Game();
		tanks.start();
}
}
