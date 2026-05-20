package logic;

public class Operaciones {
	public static int operation (int a, int b, int op) {
		int result;
		switch (op) {
		case 1:
			result = a + b;
			break;
		case 2:
			result = a - b;
			break;
		case 3:
			result = a * b;
			break;
		case 4:
			result = a / b;
			break;
		default:
			result = 0;
		}
		return result;
	}
	
	public static int parse(String a) {
		return Integer.parseInt(a);
	}
}
