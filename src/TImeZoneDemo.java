import java.util.TimeZone;

public class TImeZoneDemo {

	public static void main(String[] args) {
		/*
		 * prints all timezone details 
		 */
		
		String[] tids=TimeZone.getAvailableIDs();
		
		for(String str:tids) {
			System.out.println(str);
		}

	}

}
