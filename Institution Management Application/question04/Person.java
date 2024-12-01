package question04;

abstract class Person {
	int ID;
	String name;
	
	public Person() {
		this.ID = 0;
		this.name="";
	}
	
	public Person(int ID, String name) {
		super();
		this.ID = ID;
		this.name = name;
	}
	
	public void DisplayDetailes() {
		
	}

	public int getID() {
		return ID;
	}

	public void setID(int iD) {
		ID = iD;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
}
