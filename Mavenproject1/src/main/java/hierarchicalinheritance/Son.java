package hierarchicalinheritance;

public class Son extends Father{
 public void show()
 {
	 System.out.println("Guten morgen");
 }
 public static void main(String[] args) {
	 Son obj1 = new Son();
	 obj1.division(10, 2);
	 obj1.show();
 }
}
