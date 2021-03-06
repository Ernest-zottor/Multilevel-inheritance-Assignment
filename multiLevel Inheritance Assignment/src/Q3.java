
public class Q3 {

	public static void main(String[] args) {
		Manager manager = new Manager();
		manager.nationality();
		manager.organization();
		manager.surbodinates();
		manager.place();

	}

}

class Person {

	public void nationality() {
		System.out.println("Nationality: Ghanaian");
	}

	public void place() {
		System.out.println("Place: Ghana");
	}
}



class Emp extends Person {

	public void organization() {
		System.out.println("Organization: Amalitech");
	}

}


class Manager extends Emp {

	public void surbodinates() {
		System.out.println("Surbodinates: ten");
	}	
}