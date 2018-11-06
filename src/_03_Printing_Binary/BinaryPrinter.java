package _03_Printing_Binary;

public class BinaryPrinter {
	// Complete the methods below so they print the passed in parameter in binary.
	// Don't be afraid to use the methods that are already complete to finish the
	// others.
	// Create a main method to test your methods.

	public void printByteBinary(byte b) {
		boolean temp = true;
		int count = 0;
		String result = "";
		int tempb = b;
		while (temp) {
			if (b % (Math.pow(2, count)) != b) {
				count++;
			} else {
				temp = false;
			}
		}
		for (int i = count - 1; i >= 0; i--) {
			int r1 = (int) (tempb % (Math.pow(2, i)));
			if (r1 == tempb) {
				result+='0';
			} else {
				result+='1';
				tempb = (int) (tempb - Math.pow(2, i));
			}

		}

		System.out.println(result);
	}

	public void printShortBinary(short s) {
		boolean temp = true;
		int count = 0;
		StringBuilder result = new StringBuilder();
		int tempb = s;
		while (temp) {
			if (s % (Math.pow(2, count)) != s) {
				count++;
			} else {
				temp = false;
			}
		}
		for (int i = count - 1; i >= 0; i--) {
			int r1 = (int) (tempb % (Math.pow(2, i)));
			if (r1 == tempb) {
				result.append(0);
			} else {
				result.append(1);
				tempb = (int) (tempb - Math.pow(2, i));
			}

		}

		System.out.println(result);
	}

	public void printIntBinary(int i) {
		boolean temp = true;
		int count = 0;
		StringBuilder result = new StringBuilder();
		int tempb = i;
		while (temp) {
			if (i % (Math.pow(2, count)) != i) {
				count++;
			} else {
				temp = false;
			}
		}
		for (int i1 = count - 1; i1 >= 0; i1--) {
			int r1 = (int) (tempb % (Math.pow(2, i1)));
			if (r1 == tempb) {
				result.append(0);
			} else {
				result.append(1);
				tempb = (int) (tempb - Math.pow(2, i1));
			}

		}

		System.out.println(result);
	}

	public void printLongBinary(long l) {
		boolean temp = true;
		int count = 0;
		StringBuilder result = new StringBuilder();
		int tempb = (int) l;
		while (temp) {
			if (l % (Math.pow(2, count)) != l) {
				count++;
			} else {
				temp = false;
			}
		}
		for (int i = count - 1; i >= 0; i--) {
			int r1 = (int) (tempb % (Math.pow(2, i)));
			if (r1 == tempb) {
				result.append(0);
			} else {
				result.append(1);
				tempb = (int) (tempb - Math.pow(2, i));
			}

		}

		System.out.println(result);
	}

	public static void main(String[] args) {
		BinaryPrinter bp = new BinaryPrinter();
		bp.printByteBinary((byte) 10);
		bp.printShortBinary((short) 100);
		bp.printIntBinary((int) 100);
		bp.printLongBinary((long) 100);
	}
}
