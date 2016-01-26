package com.fletcher.clicker.input;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class Keyboard implements KeyListener{

	private boolean[] keys = new boolean[65536];
	public boolean up, down, left, right, ctrl, esc;
	public boolean inventory;
	
	public void update(){
		up = keys[KeyEvent.VK_UP] ||keys[KeyEvent.VK_W];
		down = keys[KeyEvent.VK_DOWN] ||keys[KeyEvent.VK_S];
		left = keys[KeyEvent.VK_LEFT] ||keys[KeyEvent.VK_A];
		right = keys[KeyEvent.VK_RIGHT] ||keys[KeyEvent.VK_D];
		ctrl = keys[KeyEvent.VK_CONTROL];
		esc = keys[KeyEvent.VK_ESCAPE];
		inventory = keys[KeyEvent.VK_I];
	}
	
	@Override
	public void keyPressed(KeyEvent e) {
		keys[e.getKeyCode()] = true;
	}

	@Override
	public void keyReleased(KeyEvent e) {
		keys[e.getKeyCode()] = false;
	}

	@Override
	public void keyTyped(KeyEvent e) {
	}
}