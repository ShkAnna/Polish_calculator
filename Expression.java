public class Expression {

	String line;

	public Expression(String val) {
		this.line = val;
	}

	public Integer evaluate() {
		String tabOper[] = line.split(" ");
		StackPerTable calcul = new StackPerTable(100);
		String read;
		int op1;
		int op2;
		Integer res = null;

		int len = tabOper.length;

		for (int i = 0; i < len; i++) {
			read = tabOper[i];

			if (read.matches("-?\\d+(\\.\\d+)?")) {
				calcul.push(Integer.valueOf(read));
			}
			else if (read.equals("+")) {
				op1 = calcul.pop().intValue();
				op2 = calcul.pop().intValue();

				calcul.push(op1 + op2);
			}
			else if (read.equals("*")) {
				op1 = calcul.pop().intValue();
				op2 = calcul.pop().intValue();

				calcul.push(op1 * op2);
			}
			else if (read.equals("-")) {
				op1 = calcul.pop().intValue();
				op2 = calcul.pop().intValue();

				calcul.push(op1 - op2);
			}
			else if (read.equals("/")) {
				op1 = calcul.pop().intValue();
				op2 = calcul.pop().intValue();

				calcul.push(op1 / op2);
			}
		}

		if (len > 0) { res = calcul.pop(); }

		return res;
	}
}