package lab3;

public class Person {
	static int current_year = 2017;
	private String name;
	private int birthdate;
	private int age;
	
	
	//constructor
	public Person(String name, int birthdate)
	{
		this.name = name;
		this.birthdate = birthdate;
	}

	//this method resets the persons birth date to the year given in the arguments of the method
	public void reset_birthday(int year){
		birthdate = year;
	}
	
	//this method displays the name, birth date, age, and if the person is a senior 
	public void displayInfo()
	{
		System.out.println("This is " + name);
		System.out.printf("I was born in %d. ",birthdate);
		age = current_year - birthdate;
		System.out.printf("I am %d years old ",age);
		System.out.println(isSenior());
	}
	//this method determines if the person is considered a senior by medicare
	public String isSenior()
	{
		if (age >= 65){
			return "\nI'm a senior citizen";
		}
		else{
			return "\nI'm not old enough to be classified as a senior by Medicare!";
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Person John = new Person("John",1957);
		John.displayInfo();	
	}

}
