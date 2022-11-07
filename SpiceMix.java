//Tester Statement java -jar cs1811Assignment2TesterStudent.jar

public class SpiceMix {

	private char[] spice;
	private int[] amounts;
	public Object head;

	//Constructer
	public SpiceMix(char[] spice) {
		this.spice = spice;
		this.amounts = new int[7];
		for (int i = 0; i < 5; i++) {
			amounts[spice[i] - 'N'] += i + 1;
		}
	}

	public int getSpiceAmount(char spice) {
		return this.amounts[spice - 'N'];
		
	}
		

	//Getter Method
	public char getSpice(int i) { return spice[i]; }
	
	public String toString() {

		String seperate = "";
		for (int i = 0; i < (spice.length - 1); i++) {
			seperate += spice[i] + " ";
		} 
		seperate += spice[spice.length - 1];			
		return seperate;
		
	}
}
