class circle{
	int r;
	void area(int a){
		this.r=a;
		double a1;
		a1=r*r*3.14;
		system.out.print("area of the circle="+a1);
	}
}
class cylinder extends circle{
	int h;
	void volume(int a,int b){
		super.r=a;
		this.h=b;
		a2=3.14*r*h;
		system.out.print("volume of the cylinder="+a2);
	}
	public static void main(String arg[]){
		int x,y,z;
		circle obj1=new circle();
		cylinder obj2=new cylinder();
		Scanner inp=new Scanner(System.in);
		System.out.print("enter the radius of the circle");
		x=inp.nextInt();
		obj1.area(x);
		System.out.print("enter the radius of the cylinder");
		y=inp.nextInt();
		System.out.println("enter the height of the cylinder");
		z=inp.nextInt();
		obj2.volume(y,z);
		
	}	
}
