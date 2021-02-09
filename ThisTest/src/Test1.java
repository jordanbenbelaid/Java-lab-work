
public class Test1 {

		int a;
		int b;
		
		public void Go(){
			int a = 10;
			a++;
			this.a=100;
			System.out.println(a);
		}
		
		public void What() {
			System.out.println(a);
		}
		
		public void Where() {
			int b = 20;
			b--;
			this.b=200;
			System.out.println(b);
		}
		
		public void Why() {
			System.out.println(b);
		}
		
		
		
		static int c;
		
		public void Message() {
			this.c = 15;
			this.c++;
			System.out.println(c);
		}
}
