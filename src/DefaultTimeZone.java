import java.util.TimeZone;

public class DefaultTimeZone {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TimeZone timezone=	TimeZone.getDefault();
		
		System.out.println(timezone.getID());

	}

}
