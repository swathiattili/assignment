package com.training.cg.dp;
	public class Glome extends Sphere implements Volume {
		private double radius;
		Glome(String name,double radius){
			
			this.name=name;
			this.radius=radius;
		}
		@Override
		public double getvolume() {
			// TODO Auto-generated method stub
			double s;
			s=0.2*(Math.PI*Math.PI)*(Math.pow(radius,4));
			return s;
}
	}
