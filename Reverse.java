import java.util.*;
class Reverse {
	static int rev(int n) {
	int sum = 0;
	while (n != 0) {
	sum = sum + n % 10;
	n = n / 10;
	}
	return sum;
}
public static void main (String[] args) {
	Scanner obj = new Scanner(System.in);
	System.out.println("Enter the number");
	int result = obj.nextInt();
	System.out.println(rev(result));
}
}