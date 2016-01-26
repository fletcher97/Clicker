package com.fletcher.clicker.screen;

import java.awt.Color;

import com.fletcher.clicker.Clicker;
import com.fletcher.clicker.consol.Consol;

public class Screen {

	private int[] pixels;
	private Consol consol;
	private int width, height;
	
	public Screen(int width, int height, Consol consol) {
		this.width = width;
		this.height = height;
		this.consol = consol;
		pixels = new int[width * height];
		if(Clicker.debug) consol.write("Screen created"));
	}

	public void clear() {
		pixels = new int[pixels.length];
	}

	public void render() {
		for(int i = 0; i < pixels.length; i++){
			pixels[i] = Color.CYAN.getRGB();
		}
	}

	public int[] getPixels() {
		return pixels.clone();
	}

}
