package learn01;

public class InnerClass1 {
	public static void main(String[] args) {
		
	}

}

class A{
	static class  StaticInner{}
	class InstanceInner{}
	
	StaticInner st1 = new StaticInner();
	InstanceInner ii1 = new InstanceInner();
	
	static void StaticMethod() {
		StaticInner st2 = new StaticInner();
//		InstanceInner ii2 = new InstanceInner(); 
//		static메서드는 인스턴스 멤버에 접근이 불가능하다.
		
	}
	void InstanceMethod() {
		StaticInner st3 = new StaticInner();
		InstanceInner ii3 = new InstanceInner();
		
//		instance메서드는 둘 다 접근이 가능하다.
	}
}