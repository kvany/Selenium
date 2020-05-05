package training;

public class CallMultiplyconstructor {

	public static void main(String[] args) {
	
		Multiplyconstructor obj = new Multiplyconstructor();
		Multiplyconstructor obj1 = new Multiplyconstructor(100, 75);  // this will hit another constructor
		
		System.out.print(" The multiplication equals to"  + obj.getnumber());
		System.out.print(" The multiplication equals to"  + obj1.getnumber());
		


	}

}
