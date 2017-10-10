package com.gk.rest.service;

import com.gk.rest.model.Shape;


public class AreaService {

	public long calculateArea(Shape shape)
	{
		if(shape == null)
		{
			throw new NullPointerException("Dimensions are null");
		}
		
		if(shape.getLength()>0 && shape.getWidth()>0 && shape.getLength()!=shape.getWidth())
		{
			return shape.getLength() * shape.getWidth();
		}
		else if (shape.getLength() >0)
		{
			return shape.getLength() * shape.getLength();
		}
		else if(shape.getWidth()>0)
		{
			return shape.getWidth()*shape.getWidth();
		}
		return 0;
	}
}
