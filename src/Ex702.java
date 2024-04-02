
public class Ex702 {
	// 정적 (일반) 메서드 
	static void staticMethod() {
		System.out.println("정적 메서드 호출");
	}
	// 인스턴스 (클래스) 메서드
	public void instanceMethod() {
		System.out.println("인스턴스 메서드 호출");
	}
	
	public static void main(String[] args) {
		int y;
		
		staticMethod();
		// instanceMethod();
		
		Ex702 x = new Ex702();
		x.instanceMethod();
	}

}
