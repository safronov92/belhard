package First;

public class D {
	public static void main (String [] args) {
		int sec = 4500 ;
		int min = sec/60;
		int hours = min/60;
		double days = hours/24f;
		double weeks = days/7f;
		System.out.println("������ = " + sec );
		System.out.println("����� = " + min );
		System.out.println("����� = " + hours );
		System.out.println("���� = " + days );
		System.out.println("������ = " + weeks );
	}

}