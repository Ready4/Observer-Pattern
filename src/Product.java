import java.util.ArrayList;

public class Product implements Subject {
	
	private String productName;
	private boolean available;
	private ArrayList<Observer> listOfObservers = new ArrayList<>();

	public boolean isAvailable() {
		return available;
	}

	public void setAvailable(boolean available) {
		this.available = available;
		if(available) notifyObservers();
	}

	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public ArrayList<Observer> getListOfObservers() {
		return listOfObservers;
	}

	public void setListOfObservers(ArrayList<Observer> listOfObservers) {
		this.listOfObservers = listOfObservers;
	}

	@Override
	public void registerObserver(Observer observer) {
		// register an observer for notifications
		listOfObservers.add(observer);
		
	}

	@Override
	public void removeObserver(Observer observer) {
		listOfObservers.remove(observer);
	}

	@Override
	public void notifyObservers() {
		System.out.println("Notifying all registered users when product becomes available");
		for (Observer observer : listOfObservers){
			
			observer.update(productName);
			
		}
	}

}