package com.cla.study.dp.solid.l;

import java.util.ArrayList;
import java.util.List;

public class Listov {

	
	private void subTypeExampe() {
		
		ArrayList arrayList = new ArrayList();
		
		System.out.println(arrayList.size());
		
		List list = (List) arrayList;
		
		System.out.println(list.size());
		
		
	}
	public static void main (String args[]) {
		
		calculateArea(new Rectangle(),3,2);
		calculateArea(new Square(),3,1);
	}
	
	private double calculateFrame(Rectangle rect, int widthMargin, int heightMargin) throws Exception{
		
		double area1 = (rect.getWidth() + widthMargin) * (rect.getHeight() + heightMargin );
		double area2 = rect.getArea() 
						+ widthMargin * (rect.getHeight() + (heightMargin * 2)) * 2
						+ heightMargin * rect.getWidth() *2;
		
		if(area1 != area2) {
			throw new Exception("Unexpected value");
		}
		
		return area1;
	}
	
	private  static void calculateArea(Rectangle r, int width, int height) {
		
		r.setHeight(height);
		r.setWidth(width);
		
		if(r.getArea() == width * height) {
			System.out.println("Area: " + r.getArea());
		}else {
			System.out.println("Unexpected value: " + r.getArea());
		}
	}
}

class Rectangle{
	
	protected int width;
	
	protected int height;

	public int getWidth() {
		return width;
	}

	public void setWidth(int width) {
		this.width = width;
	}

	public int getHeight() {
		return height;
	}
	public void setHeight(int height) {
		this.height = height;
	}
	public double getArea(){
		return width * height;
	}
	
}
class Square extends Rectangle{
	
	public void setWidth(int width) {
		super.setWidth(width);
		super.setHeight(width);
	}
	public void setHeight(int height) {
		this.height = height;
	}
	
}