package classesdemo.model;

public class CustomerDemo {


	public static void main(String[] args) {
		Customer customer = new Customer();
		int result =customer.addition(15, 10);//calling addition method from Customer class.
		System.out.println(result);
		String message = customer.display();
		System.out.println(message);
	}

}
