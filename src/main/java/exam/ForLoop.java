package exam;

public class ForLoop {
	
	// ForLoop Positive
	public void getForLoopP() {
		for (int p=0;p<=100;p++) {
			System.out.println(p);
		}}
	
	//ForLoop Negative
	public void getForLoopN(){
		for(int n=100;n>=0;n--) {
			System.out.println(n);
		}}	
	
	//Infinite ForLoop
	public void getInfinite () {
		for(int i=0;;i++) {
			System.out.println(i);
		}}
	
	//Infinite Loop With Break
	public void getInfiniteBreak() {
		for(int b=0;;b++) {
			if(b==50)
				break;
			System.out.println(b);
		}}
	
public static void main(String[] args) {
	ForLoop obj =new ForLoop();
	//obj.getForLoopP();
	//obj.getForLoopN();
	//obj.getInfinite();
	obj.getInfiniteBreak();
	
}}
