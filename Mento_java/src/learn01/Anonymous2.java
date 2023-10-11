package learn01;

public class Anonymous2 {
	public static void main(String[] args) {
//		Inter it1 = new Inter1(); 인터페이스는 객체를 만들수 없다.
		Inter1 it = new Inter1() {

			@Override
			public void f1() {
				System.out.println("inter1 imple f1()");
				
			}
			
		};
		it.f1();
	}
}

interface Inter1{
	void f1();
	
}
class Inter1Imp1 implements Inter1{
	@Override
	public void f1() {
		
	}
	
}