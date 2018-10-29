import java.io.Console;

public class Test {
	public static void main(String[] args) {
		String eS;
		Expression e1;

		if (args.length == 1 && args[0].equals("-r")) {
			eS = System.console().readLine();
		} else if (args.length != 1 || args[0].isEmpty() || args[0].trim().isEmpty()) { 
			System.out.println("Exit");
			System.exit(0); 
			} else { 

			eS = args[0]; 

			e1 = new Expression(eS);
			Integer i = e1.evaluate();
			System.out.println("Expression : " + eS + " , result : " + i.intValue());
			}
	}
}