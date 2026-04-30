package hierarchicalinheritance;

public class Daughter extends Father {
	public void subtraction(int a , int b) {
		int sub =  a -  b;
		System.out.println("subtartion:" +sub);
	}
	public static void main(String[] args) {
		Daughter obj2 = new Daughter();
		obj2.division(25, 5);
		obj2.subtraction(9, 2);
	}

}
