package First;

public class D {
	public static void main (String [] args) {
		int sec = 4500 ;
		int min = sec/60;
		int hours = min/60;
		double days = hours/24f;
		double weeks = days/7f;
		System.out.println("секунд = " + sec );
		System.out.println("минут = " + min );
		System.out.println("часов = " + hours );
		System.out.println("дней = " + days );
		System.out.println("недель = " + weeks );
	}

}