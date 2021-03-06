
public class Q1 {

	public static void main(String[] args) {
		LED led = new LED();
		led.device_type();
		led.category();
		led.display_tech();
	}

}




class Electronics {

	public void device_type() {
		System.out.println("Device Type: Electronics");
	}
}



class Television extends Electronics {

	public void category() {
		System.out.println("Category: Television");
	}
}



class LED extends Television {

	public void display_tech() {
		System.out.println("Display Technology: LED");
	}
}
