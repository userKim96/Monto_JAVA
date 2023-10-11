package learn01;

public class Inner1 {
	public static void main(String[] args) {
		OuterClass oc = new OuterClass();
		
		System.out.println("OuterClass의 A 값 : " + oc.a);
		System.out.println("OuterClass의 B 값 : " + OuterClass.b);
		
		
		OuterClass oc2 = new OuterClass();
		OuterClass.Inner i = oc2.new Inner();
		
		System.out.println("Inner의 C 값 : " + i.c);
		i.innerMethod();
		
		OuterClass.StaticInner si = new OuterClass.StaticInner();
		System.out.println("StaticInner의 d의 값 : " + si.d);
		
		
//		si.staticMethod(); 객체를 사용하지 않고 클래스명을 사용하여 호출가능.
		OuterClass.StaticInner.staticMethod();
		
		
	}
}

class OuterClass{
	int a = 3;
	static int b =4;
	class Inner{
		int c = 5;
		public void innerMethod() {
			System.out.println("<Inner Class>");
		}
	}
	static class StaticInner{
		int d = 6;
		static int stat = 10;
		public static void staticMethod() {
			System.out.println("<Static Inner>");
		}
	}
}