package com.training.cg.dp;

public class Squaree extends Shapee implements Area {
	public double side;
	
	Squaree(){
		
	}
	Squaree(String name,double side){
		this.name=name;
		this.side=side;
	}
	public double getarea() {
		// TODO Auto-generated method stub
		double s;
		s=side*side;
		return s;
}
}
