package com.fletcher.clicker.input;

import java.awt.Point;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class Mouse implements MouseListener{

	private Point mousePointClicked;
	private boolean updated;
	
	public boolean updated(){
		return updated;
	}
	
	public Point getClick(){
		updated = false;
		return mousePointClicked;
	}
	
	@Override
	public void mouseClicked(MouseEvent e) {
		if(e.getButton() == MouseEvent.BUTTON1){
			updated = true;
			mousePointClicked = e.getPoint();
		}
	}

	@Override
	public void mousePressed(MouseEvent e) {}

	@Override
	public void mouseReleased(MouseEvent e) {}

	@Override
	public void mouseEntered(MouseEvent e) {}

	@Override
	public void mouseExited(MouseEvent e) {}

}