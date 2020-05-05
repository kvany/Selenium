package training;

public class Multiplyconstructor {

int Firstnumber;
int secondnumber;
public int getnumber() { 
 
		return (Firstnumber+secondnumber);
 }
Multiplyconstructor(){
Firstnumber =10;
secondnumber = 50;

	}

Multiplyconstructor(int a, int b) {

	Firstnumber = a;
	secondnumber = b;
}
}