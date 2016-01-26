package com.fletcher.clicker.consol;

import java.awt.BorderLayout;

import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.text.DefaultCaret;

import com.fletcher.clicker.Clicker;

public class Consol extends JFrame implements Runnable {
	private static final long serialVersionUID = 1L;

	private Clicker game;
	private Thread thread;
	private JTextArea txtA;
	private JTextField txtF;
	private JScrollPane scroll;
	private final int WIDTH = 400, HEIGHT = 600;

	public Consol(Clicker clicker) {
		this.game = clicker;
		this.setTitle("Consol");
		this.setSize(WIDTH, HEIGHT);
		this.setResizable(false);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setVisible(true);
		this.setLayout(new BorderLayout());

		txtA = new JTextArea();
		txtA.setEditable(false);
		txtA.setLineWrap(false);
		txtA.setVisible(true);

		DefaultCaret caret = (DefaultCaret) txtA.getCaret();
		caret.setUpdatePolicy(DefaultCaret.ALWAYS_UPDATE);
		scroll = new JScrollPane(txtA,
				JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED,
				JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);
	}

	@Override
	public void run() {

	}

}
