package prob02;

import java.util.Scanner;

public class GoodsApp {
	private static final int COUNT_GOODS = 3;

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		String[] GoodsData = new String[COUNT_GOODS];
		
		
		//Goods 3개를 받아 배열에 넣기
		for(int i = 0; i < COUNT_GOODS; ++i) { 
			String info = scanner.nextLine();
			GoodsData[i] = info;
		}
		
		System.out.println();
		
		for (int i = 0; i < COUNT_GOODS; ++i) {

			String[] data = GoodsData[i].split(" "); // 공백기준으로 문자 자르기
			String name = data[0];
			int price = Integer.parseInt(data[1]);
			int countStock = Integer.parseInt(data[2]);

			System.out.println(name + "(가격: " + price + "원)이 " + countStock + "개 입고 되었습니다.");
		}

		scanner.close();
	}
}
