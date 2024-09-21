package exam;

public class ReverseLoop {
	
	public void getReverseLoop(String country) {
		for(int i=(country.length()-1);i>=0;i--) {
			
			System.out.println(i=country.charAt(i));
			
		}}
public static void main(String[] args) {
	ReverseLoop obj= new ReverseLoop();
	obj.getReverseLoop("USA");
}
}
