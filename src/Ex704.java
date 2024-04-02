public class Ex704 {

	public static void main(String[] args) {
		Student s1 = new Student();
		Student s2 = new Student();

		s1.id = 20191512;
		s1.name = "졸린애"; 
		s1.printInfo();
		
		s2.insertRecord(20191511, "덜 졸린애");
		s2.printInfo();
		
		Student s3 = new Student(20191510, "제일 졸린애");
		s3.printInfo();
	}

}
