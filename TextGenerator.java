import java.util.Scanner;

/**
 * Output user input in a fun way.
 * Letters.java must be used for generating.
 * 
 * @author Logan Duck (logan.duck@yahoo.com)
 */
public class TextGenerator {
	static Scanner scan = new Scanner(System.in);
	static String output = "";
	static Letters s = new Letters();

	/**
	 * Letters are pulled from Letters.java to make this more readable.
	 * 's.ln()' creates space between letters.
	 */
	public static void main(String[] args) {
		System.out.print("Please enter: ");
		String input = scan.nextLine().trim().toUpperCase();
		if (input.length() < 100) {
			for (int i = 0; i < input.length(); i++) {
			char txt = input.charAt(i);
			switch (txt) {
				case 'A' :
					output += s.getA();
					break;
				case 'B' :
					output += s.getB();
					break;
				case 'C' :
					output += s.getC();
					break;
				case 'D' :
					output += s.getD();
					break;
				case 'E' :
					output += s.getE();
					break;
				case 'F' :
					output += s.getF();
					break;
				case 'G' :
					output += s.getG();
					break;
				case 'H' :
					output += s.getH();
					break;
				case 'I' :
					output += s.getI();
					break;
				case 'J' :
					output += s.getJ();
					break;
				case 'K' :
					output += s.getK();
					break;
				case 'L' :
					output += s.getL();
					break;
				case 'M' :
					output += s.getM();
					break;
				case 'N' :
					output += s.getN();
					break;
				case 'O' :
					output += s.getO();
					break;
				case 'P' :
					output += s.getP();
					break;
				case 'Q' :
					output += s.getQ();
					break;
				case 'R' :
					output += s.getR();
					break;
				case 'S' :
					output += s.getS();
					break;
				case 'T' :
					output += s.getT();
					break;
				case 'U' :
					output += s.getU();
					break;
				case 'V' :
					output += s.getV();
					break;
				case 'W' :
					output += s.getW();
					break;
				case 'X' :
					output += s.getX();
					break;
				case 'Y' :
					output += s.getY();
					break;
				case 'Z' :
					output += s.getZ();
					break;
				case ' ' :
					output += s.space();
					break;
				}
			}
			System.out.println(output);	
		} else {
			System.out.println("\n" + s.tooLarge());
		}
	}
}