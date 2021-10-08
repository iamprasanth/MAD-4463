/**
 * 
 */

/**
 * @author prasanth
 *
 */
public class AddTwoNumbers {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Calculator calculator = new Calculator(100, 9);
        System.out.println("Final value " + (new Calculator(1, 100)).addNumbers());
	}
}

class Calculator {
	int startValue;
	int endValue;
	
	public Calculator(int _startValue, int _endValue) {
		// _ for function local variables, this for instance variables
		this.startValue = _startValue;
		this.endValue = _endValue;
	}
    
	int addNumbers() {
    	// static functions wont have access to instance variable
    	for(int counter = this.startValue; counter <= this.endValue; counter += this.stepValue) {
    		this.finalValue = this.finalValue + counter;
    	}
    	
    	return this.startValue + this.endValue;
    }
}
