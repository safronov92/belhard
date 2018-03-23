package Four;

public class Money {
	public static void main (String [] args) {
		 int a = 0; 
	      int b = 100;
	      int random_number1 = a + (int) (Math.random() * b);
		  if (random_number1%10>=5 || random_number1%10<1 ) {
			  System.out.println(random_number1 + "рублей");
		  } else if (random_number1%10<5 && random_number1%10>=2 ) {
			  System.out.println(random_number1 + "рубля"); 
		  }
			  else System.out.println(random_number1 + "рубль");
			  }
	}

