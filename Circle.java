package com.training.cg.dp;

public class Circle extends Shapee implements Area{
	public double radius;
	Circle(){
		
	}
	Circle(String name,double radius){
		this.name=name;
		this.radius=radius;
	}
	@Override
	public double getarea() {
		// TODO Auto-generated method stub
		double s;
		s=Math.PI*(radius*radius);
		return s;
}
}
