package _03_Printing_Binary;

public class BinaryPrinter {
	//Complete the methods below so they print the passed in parameter in binary.
	//Don't be afraid to use the methods that are already complete to finish the others.
	//Create a main method to test your methods.
	
	public void printByteBinary(byte b) {
		boolean temp = true;
		int count = 0;
		while(temp) {
			if(b%(Math.pow(2, count))!=b) {
				count++;
			}else {
				temp = false;
			}
		}
		for (int i = 0; i < count; i++) {
			int r1 = (int) (b%(Math.pow(2, count)));
			
		}
		
	}
	
	public void printShortBinary(short s) {
		
	}
	
	public void printIntBinary(int i) {
		
	}
	
	public void printLongBinary(long l) {
		
	}
}
