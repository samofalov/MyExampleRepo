import java.util.Scanner;

public class Application {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Please provide an integer: ");
		int number = scanner.nextInt();
		
		boolean isPrimary = isPrimary(number);
		
		System.out.println(isPrimary);

	}

	private static boolean isPrimary(int number) {
		
		boolean isThereRemainder = true;
		int divider = 2;
		
		while (isThereRemainder && divider < number) {
			
			isThereRemainder = (number % divider != 0);
			
			divider++;
		}
		
		
		return isThereRemainder;
	}
}
