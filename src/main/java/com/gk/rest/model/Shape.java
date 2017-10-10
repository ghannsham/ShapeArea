package com.gk.rest.model;

public class Shape {
	private long length;
	private long width;
	
	public Shape()
	{	
		super();
	}
	
	public Shape(long length, long width) {
		super();
		this.length = length;
		this.width = width;
	}

	public long getLength() {
		return length;
	}
	public void setLength(long length) {
		this.length = length;
	}
	public long getWidth() {
		return width;
	}
	public void setWidth(long width) {
		this.width = width;
	}

	
}
