package com.training.cg.dp;


	public class Cube extends Squaree implements Volume{

		private String name;
		Cube(String name,double side){
			
			this.name=name;
			this.side=side;
		}
		@Override
		public double getvolume() {
			// TODO Auto-generated method stub
			double s;
			s=side*side*side;
			return s;
}
		public double getarea() {
			// TODO Auto-generated method stub
			return 0;
		}
}