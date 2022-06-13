package utils;

public class TestMethodeStatic {

	public static void main(String[] args) {
		
		String varString = "58";
		int varInt = Integer.parseInt(varString);
		
		int a = 116;
		int b = varInt;
		
		int max = Integer.max(a, b);
		System.out.println(max);

	}

}
