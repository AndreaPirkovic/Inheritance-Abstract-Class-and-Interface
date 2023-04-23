package pirkovic.andrea;

 public class Krug extends Oblik { 
	 
	 public double poluprecnik;
	 
	 
	 public Krug(double poluprecnik) { 
			this.poluprecnik=poluprecnik;
			
			} 
		public double uzmiPovrsinu() {
			 povrsina = Math.PI * (poluprecnik * poluprecnik); 
			 return povrsina; 
			 
			
			} }
