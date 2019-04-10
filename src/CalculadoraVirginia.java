


import javax.swing.JOptionPane;

public class CalculadoraVirginia {

	static Double a=0.0, b=0.0, result=0.0;

	public static void main(String[] args) {
		Object operator;
		char op=' ';
		
		JOptionPane.showMessageDialog(null, "Calculator!!");
		
		a = firstnumber(a);
		
		b = secondnumber(b);
		
		operator = JOptionPane.showInputDialog(null,"What would you like to do?", "calculate", JOptionPane.QUESTION_MESSAGE, null, new Object[] { "+","-","x","/", null},"Choose");

		JOptionPane.showMessageDialog(null, "Calculating...");
		switch (operator.toString()) {
		case "+":
			result = addition(a, b);
			op = '+';
			break;
		case "-":
			result = subtraction(a, b);
			op = '-';
			break;
		case "x":
			result = multiplication(a, b);
			op = 'x';
			break;
		case "/":
			result = division(a, b);
			op = '/';
			if(a==0 || b==0) {
				JOptionPane.showMessageDialog(null, "Error, you can't divide with 0.", "ERROR_MESSAGE", JOptionPane.ERROR_MESSAGE);	
				System.exit(0);
			}
			break;
		
		}
		JOptionPane.showMessageDialog(null, a+" "+op+" "+b+" = "+result);

	}

	public static Double division(Double a, Double b) {
		Double result;
		result = a/b;
		if(a==0 || b==0) {
			result = 0.0;
		}
		return result;
	}

	public static Double multiplication(Double a, Double b) {
		Double result;
		result = a*b;
		return result;
	}

	public static Double subtraction(Double a, Double b) {
		Double result;
		result = a-b;
		return result;
	}

	public static Double addition(Double a, Double b) {
		Double result;
		result = a+b;
		return result;
	}

	private static Double secondnumber(Double b) {
		try {
			b = new Double(JOptionPane.showInputDialog("Write the second number: "));
		}catch(NumberFormatException e) {
			JOptionPane.showMessageDialog(null, "Error!", "ERROR_MESSAGE", JOptionPane.ERROR_MESSAGE);	
			System.exit(0);
		}catch(NullPointerException e) {
			JOptionPane.showMessageDialog(null, "Error, you can't let it empty. Start again!", "ERROR_MESSAGE", JOptionPane.ERROR_MESSAGE);	
			System.exit(0);
		}
		return b;
	}

	private static Double firstnumber(Double a) {
		try {
			a = new Double(JOptionPane.showInputDialog("Write the first number: "));
		}catch(NumberFormatException e) {
			JOptionPane.showMessageDialog(null, "Error!", "ERROR_MESSAGE", JOptionPane.ERROR_MESSAGE);	
			System.exit(0);
		}catch(NullPointerException e) {
			JOptionPane.showMessageDialog(null, "Error, you can't let it empty. Start again!", "ERROR_MESSAGE", JOptionPane.ERROR_MESSAGE);	
			System.exit(0);
		}
		return a;
	}

}
