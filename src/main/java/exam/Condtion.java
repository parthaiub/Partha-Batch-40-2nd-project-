package exam;

public class Condtion {
	
	
	
	public void getCondition (String name) {
		
		if(name.contains("Rez")) {
			System.out.println("Found my name");	
		}
		else {
			System.out.println("Not Found");	
		}}
	
	
	public void getCondtionif(String country) {
		
		if(country.contains("Can")) {
			System.out.println("This is Canada");}
				
			 else if(country.contains("USA")) {
				 System.out.println("This is USA");}
		else {
			System.out.println("No country found");
		}}
	
	
	public static void main(String[] args) {
		Condtion obj= new Condtion();
		obj.getCondition("Parthal");
		obj.getCondtionif("usa");
		
	}
	}


