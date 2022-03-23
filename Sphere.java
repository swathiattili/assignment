package com.training.cg.dp;

public class Sphere extends Circle implements Volume{
	private double radius;
	Sphere(){
	}
	
	Sphere(String name,double radius){
		
		this.name=name;
		this.radius=radius;
	}
	@Override
	public double getvolume() {
		// TODO Auto-generated method stub
		double s;
		double radius = 0;
		s=(4/3)*Math.PI*(radius*radius);
		return s;

}
}
