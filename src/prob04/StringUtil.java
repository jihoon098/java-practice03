package prob04;

public class StringUtil {
	
	
	public static String concatenate(String[] str) {
		
		String storeString = "";
		
		for(int i = 0; i<3 ; ++i) { 
			storeString += str[i];
		}
		
		
		return storeString;
	}

	
}
