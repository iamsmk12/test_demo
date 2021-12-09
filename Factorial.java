import java.util.*;
class Factorial {
	static int fact(int n) {
	if (n <= 1) {
	return 1;
}
	else {
	return (n * fact(n - 1));
}
}
	public static void main(String[] args) {
	System.out.println("Enter the number");
	Scanner obj = new Scanner(System.in);
	int result = obj.nextInt();
	System.out.println(fact(result));
}
}
	