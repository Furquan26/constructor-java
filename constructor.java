package type;

public class constructor {
	int num1, num2; //global variable
	
	constructor(){
	}
		
		
	constructor(int y, int x){	// here int y and x are is local variable. 
	this.num1 = y;
	this.num2 = x;

		
	}
	public void showValues() {
		System.out.println(" Value of N1 is " + num1 + " Values of N2 is " + num2);
	
	}
	public static void main(String[]args) {

		constructor cdemo = new constructor(10, 20);
		cdemo.showValues();
	}
	}

