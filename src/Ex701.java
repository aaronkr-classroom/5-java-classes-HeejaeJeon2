
public class Ex701 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Cat my_cat = new Cat();
		my_cat.setAge(14);
		my_cat.setName("tired");
		
		System.out.println("Say hi to my cat, " + my_cat.getName());
		System.out.println("My cat is " + my_cat.getAge() + " years old");
		
		my_cat.setAge(6);
		System.out.println("My cat is " + my_cat.getAge() + " years old");

	}

}
