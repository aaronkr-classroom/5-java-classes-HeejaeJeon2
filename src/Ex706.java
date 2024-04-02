public class Ex706 {
	public static void main(String[] args) {
		Dog d = new Dog();
		d.breed = "포메라니언";
		d.color = "갈색";
		
		System.out.println("강아지 품종 : " + d.breed);
		System.out.println("강아지 색상 : " + d.color);
		
		d.sound(); // public 매서드
		d.age = 10; //protected 변수
		System.out.println("강아지 나이: " +d.age);
		d.run(); // protected 매서드
		
		// d.name = "다운";
		// System.out.println("강아지 이름: " +d.name); // 오류
		// d.sleep(); // private 매서드 (오류)
	}

}
