package prob06;

import java.util.Scanner;

public class CalcApp {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		while( true ) {

			System.out.print( ">> " );
			String expression = scanner.nextLine();
			
			if( "quit".equals( expression ) ) {
				break;
			}
			
			String[] tokens = expression.split( " " );
			
			if( tokens.length != 3 ) {
				System.out.println( ">> 알 수 없는 식입니다.");
				continue;
			}
			

			
			/*  코드를 완성 합니다 */
			Add addCal = new Add();
			addCal.setValue(Integer.parseInt(tokens[0]), Integer.parseInt(tokens[2]));
			System.out.println(">> " + addCal.calculate());
		}
		
		
		
		
		scanner.close();

	}

}



class Add{
	int a;
	int b;
	void setValue(int a, int b) {
		this.a = a;
		this.b = b;
	}
	int calculate() {
		int c = this.a + this.b;
		return c;
		
	}
}

class Sub{
	int a;
	int b;
	void setValue(int a, int b) {
		this.a = a;
		this.b = b;
	}
	int calculate() {
		return 1;
	}
}

class Mul{
	int a;
	int b;
	void setValue(int a, int b) {
		this.a = a;
		this.b = b;
	}
	int calculate() {
		return 1;
	}
}

class Div{
	int a;
	int b;
	void setValue(int a, int b) {
		this.a = a;
		this.b = b;
	}
	int calculate() {
		return 1;
	}
}