package learn01;

public class Anonymous3 {
	public static void main(String[] args) {
//		Abstract ab = new Abstract();
		Abstract ab= new Abstract() {
			@Override
			void f2() {
				System.out.println("Abstract extends f2()");
				
			}
			
		};
		ab.f2();
	}
}

abstract class Abstract{
	abstract void f2();
	
}