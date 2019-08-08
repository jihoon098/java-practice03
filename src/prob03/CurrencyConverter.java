package prob03;

public class CurrencyConverter {
	
	private static double rate;
	
	public static void setRate(double rate) {
		CurrencyConverter.rate = rate;
	}
	
	
	//한국 원화를 달러로 변환
	public static double toDollar(double won) {
		double a = won/rate ;
		return a;
	}
	
	
	//달러를 한국 원화로 변환
	public static double toKRW(double dollar) {
		double a = dollar * rate ;
		return a;
	}
	
	
	
	
}
