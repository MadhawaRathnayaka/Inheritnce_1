public class Main {
	public static void main(String[] args) {
		Publication p = new Journal("Mother", 250.0, 5, 10);
		p.print();
		p.getData();
	}
}

class Publication {
	String title;
	double price;
	
	Publication(String title, double price) {
		this.title = title;
		this.price = price;
	}
	
	void getData() {
		System.out.println("Title: " + title + ", Price: " + price);
	}
	
	void print() {
		System.out.println(title);
	}
}

interface Magazine {
	// we could define the volumeNumber here inside the interface as a data member 
	// but that would be static and final, so there's no use of doing that
	void print();
	int getVolumeNumber();
}

interface Book {
	// same goes with this interface and accessionNumber
	void print();
	int getAccessionNumber();
}

class Journal extends Publication implements Magazine, Book {
	// so, volumeNumber and accessionNumber are defined in this class as data members
	private int volumeNumber;
	private int accessionNumber;
	
	Journal(String title, double price, int volumeNumber, int accessionNumber) {
		super(title, price);
		this.volumeNumber = volumeNumber;
		this.accessionNumber = accessionNumber;
	}
	
	@Override
	public void print() {
		// leaving the base class' implementation in the derrived class
		super.print();
	}
	
	@Override
	public void getData() {
		System.out.println("Title: " + title + ", Price: " + price + ", Volume No: " + volumeNumber + ", Accession No: " + accessionNumber);
	}
	
	@Override
	public int getVolumeNumber() {
		return volumeNumber;
	}
	
	@Override
	public int getAccessionNumber() {
		return accessionNumber;
	}
}
