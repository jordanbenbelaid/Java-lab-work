package test5;

public class test5 {

	public static void main(String[] args) {
		
		int a;
		
		for(a=1; a<=10; a=a+1)
		{
			System.out.println(a + " Green Bottle");
		}

		System.out.println("==========================================");
		
		int ax, b, c;
		
		for(ax=1, b=10, c=100; ax <= 10; ax=ax+1, b=b+10, c=c+100)
		{
			System.out.println(ax + " " + b + " " + c);
		}
		
		System.out.println("==========================================");
		
		int d, e, f;
		
		d=5;
		e=10;
		f=50;
		
		for( ; d<=50; d=d+5, e=e+10, f=f+50)
		{
			System.out.println(d + " " + e + " " + f);
		}
		
		System.out.println("==========================================");
		
		
	}
}
