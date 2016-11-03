public class ObserverPatternTest {

	public static void main(String[] args) {

		Customer customer1 = new Customer();
		Customer customer2 = new Customer();
		
		customer1.setCustomerName("John");
		customer2.setCustomerName("Johnny");

		Product cicret = new Product();
		cicret.setProductName("Cicret Bracelet");
		cicret.setAvailable(false);
		
		cicret.registerObserver(customer1);
		cicret.registerObserver(customer2);
		
		// After few days cicret becomes available
		
		cicret.setAvailable(true);
		
		// Customer 2 wants to unregister for cicret availability
		
		cicret.removeObserver(customer2);
		
		cicret.setAvailable(true);
		
		
	}

}